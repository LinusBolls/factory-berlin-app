package de.baimos;

import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.conn.protocols.Protocol;
import de.baimos.blueid.sdk.data.a;
import de.baimos.blueid.sdk.data.b;
import de.baimos.blueid.sdk.data.c;
import de.baimos.blueid.sdk.data.d;
import de.baimos.core.util.filter.ConnectionFilterChain;
import de.baimos.core.util.filter.ConnectionParameters;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECKey;

public class af extends Protocol {
    private static final dr a = ds.a(af.class);

    public af(int i2) {
        super(4, "Micro1.0", i2, true);
    }

    public void doFilter(InputStream inputStream, OutputStream outputStream, ConnectionParameters connectionParameters, ConnectionFilterChain connectionFilterChain) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        b bVar = (b) connectionParameters.getParameter("securedObject");
        a aVar = (a) connectionParameters.getParameter("commandExecutionResponse");
        c a2 = bVar.a((Command) connectionParameters.getParameter("command"), (Channel) connectionParameters.getParameter("channel"));
        if (a2 != null) {
            PrivateKey a3 = ((an) connectionParameters.getParameter("keyStore")).a();
            String algorithm = a3.getAlgorithm();
            try {
                ba a4 = az.a().a(a3);
                Signature a5 = az.a().a(a3, a4);
                cq.b(bufferedOutputStream, a4.a());
                bb bbVar = new bb(bufferedOutputStream, a5);
                bbVar.write(a2.e());
                bbVar.write(a(connectionParameters));
                byte[] bArr = (byte[]) connectionParameters.getParameter("parameter");
                if (bArr != null && bArr.length > 0) {
                    if (bArr.length <= 65535) {
                        new ag(ah.COMMAND_PARAMETER.a(), bArr.length).a((OutputStream) bbVar);
                        bbVar.write(bArr);
                    } else {
                        throw new IllegalArgumentException("command parameter exceeds maximum size of 64kb!");
                    }
                }
                boolean z = true;
                if (((ao) connectionParameters.getParameter("revocationDatabase")).f().contains(bVar.getId())) {
                    new ag(ah.PROCESS_TICKET_REVOCATIONS.a(), 1).a((OutputStream) bbVar);
                    bbVar.write(0);
                }
                new ag(ah.NO_EXTENSION_LEFT.a(), 0).a((OutputStream) bbVar);
                bufferedOutputStream.flush();
                byte[] a6 = az.a(20);
                bufferedOutputStream.write(a6);
                byte[] bArr2 = new byte[20];
                cq.a(inputStream, bArr2);
                try {
                    a5.update(bArr2);
                    a5.update(a6);
                    a5.update(cs.b(bVar.getId()));
                    byte[] sign = a5.sign();
                    if ("EC".equals(algorithm)) {
                        sign = az.a(sign, ((ECKey) a3).getParams().getCurve().getField().getFieldSize() / 8);
                    }
                    bufferedOutputStream.write(sign);
                    bufferedOutputStream.flush();
                    a.d("reading authorization and command execution results");
                    int c = cq.c(inputStream);
                    int c2 = cq.c(inputStream);
                    aVar.a(c);
                    aVar.b(c2);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 10) {
                            z = false;
                            break;
                        }
                        ag a7 = ag.a(inputStream);
                        if (ai.NO_EXTENSION_LEFT.a() == a7.a()) {
                            a.d("no extensions left!");
                            break;
                        }
                        if (ai.TICKET_REVOCATION_CONFIRMATION.a() == a7.a()) {
                            int c3 = cq.c(inputStream);
                            ba a8 = ba.a(c3);
                            if (a8 != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr3 = new byte[(a7.b() - 1)];
                                cq.a(inputStream, bArr3);
                                byteArrayOutputStream.write(bArr3);
                                cq.a(a8.name(), (OutputStream) byteArrayOutputStream);
                                d dVar = (d) connectionParameters.getParameter("revocationDataListener");
                                if (dVar != null) {
                                    dVar.a(byteArrayOutputStream.toByteArray(), bVar.getId());
                                }
                            } else {
                                throw new RuntimeException("no signature algorithm found with id " + c3);
                            }
                        } else if (ai.SIGNED_TRUST_CENTER_RESPONSE.a() == a7.a()) {
                            dr drVar = a;
                            drVar.c("found signed trust center response data, size=" + a7.b());
                            byte[] bArr4 = new byte[a7.b()];
                            cq.a(inputStream, bArr4);
                            d dVar2 = (d) connectionParameters.getParameter("revocationDataListener");
                            if (dVar2 != null) {
                                dVar2.a(bArr4, bVar.getId());
                            }
                        } else if (ai.OPERATOR_RESPONSE.a() == a7.a()) {
                            dr drVar2 = a;
                            drVar2.c("found operator response data, size=" + a7.b());
                            byte[] bArr5 = new byte[a7.b()];
                            cq.a(inputStream, bArr5);
                            aVar.a(bArr5);
                        } else {
                            dr drVar3 = a;
                            drVar3.c("found unknown extension, type=" + a7.a() + ", size=" + a7.b());
                            cq.a(inputStream, new byte[a7.b()]);
                        }
                        i2++;
                    }
                    if (z) {
                        a.d("finished protocol");
                        return;
                    }
                    throw new RuntimeException("more response extensions than allowed");
                } catch (SignatureException e2) {
                    throw new RuntimeException("failed to create signature", e2);
                }
            } catch (InvalidKeyException | NoSuchAlgorithmException e3) {
                throw new RuntimeException("failed to create signature", e3);
            }
        } else {
            throw new RuntimeException("Failed to get valid token. Please make sure you have a valid token for chosen command and channel.");
        }
    }
}
