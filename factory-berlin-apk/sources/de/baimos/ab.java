package de.baimos;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.sensorberg.smartspaces.backend.model.Statistics;
import de.baimos.blueid.sdk.api.Channel;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

public class ab extends bn implements a {
    /* access modifiers changed from: private */
    public static final dr a = ds.a(ab.class);
    /* access modifiers changed from: private */
    public ad b;
    /* access modifiers changed from: private */
    public aa c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public OutputStream f8169d;

    /* renamed from: e  reason: collision with root package name */
    private ac f8170e;

    public ab(String str) {
    }

    /* access modifiers changed from: private */
    public Message a(int i2) {
        Message obtain = Message.obtain((Handler) null, i2);
        obtain.setData(new Bundle());
        return obtain;
    }

    /* access modifiers changed from: protected */
    public cm a() {
        if (!this.f8170e.getId().equals(Statistics.TRIGGER_NFC)) {
            throw new RuntimeException("wrong channel for client, expecting nfc channel");
        } else if (this.f8170e.a() instanceof Message) {
            final Messenger messenger = (Messenger) ((Message) this.f8170e.a()).getData().get("messenger");
            if (messenger != null) {
                Messenger messenger2 = new Messenger(new Handler(Looper.getMainLooper()) {
                    public void handleMessage(Message message) {
                        int i2 = message.what;
                        if (i2 == 2) {
                            try {
                                ab.this.c.a(message.getData().getByteArray("data"));
                            } catch (InterruptedIOException e2) {
                                ab.a.a("failed to get data from message", e2);
                            }
                        } else if (i2 != 3) {
                            dr b = ab.a;
                            b.a("unknown message type " + message.what);
                        } else {
                            cq.d(ab.this.b);
                            cq.a(ab.this.f8169d);
                        }
                    }
                });
                Message a2 = a(1);
                a2.getData().putParcelable("messenger", messenger2);
                try {
                    messenger.send(a2);
                    this.c = new aa();
                    this.b = new ad(this.c);
                    this.f8169d = new OutputStream() {
                        private void a(byte[] bArr) {
                            Message a2 = ab.this.a(2);
                            a2.getData().putByteArray("data", bArr);
                            messenger.send(a2);
                        }

                        public void write(int i2) {
                            write(new byte[]{(byte) i2});
                        }

                        public void write(byte[] bArr) {
                            try {
                                a(bArr);
                            } catch (RemoteException e2) {
                                throw new IOException("failed to send data", e2);
                            }
                        }

                        public void write(byte[] bArr, int i2, int i3) {
                            byte[] bArr2 = new byte[i3];
                            System.arraycopy(bArr, i2, bArr2, 0, i3);
                            write(bArr2);
                        }
                    };
                    return new cm() {
                        private boolean c = false;

                        public InputStream a() {
                            return ab.this.b;
                        }

                        public OutputStream b() {
                            return ab.this.f8169d;
                        }

                        public String c() {
                            return "nfccardreader";
                        }

                        public void d() {
                            cq.d(ab.this.b);
                            cq.a(ab.this.f8169d);
                            if (!this.c) {
                                this.c = true;
                                try {
                                    messenger.send(ab.this.a(3));
                                } catch (RemoteException e2) {
                                    ab.a.a("failed to send 'close' command to SDK", e2);
                                }
                            }
                        }
                    };
                } catch (RemoteException e2) {
                    throw new IOException("no connection to NFC service", e2);
                }
            } else {
                throw new RuntimeException("missing parameter 'messenger' in message");
            }
        } else {
            throw new RuntimeException("missing parameter for channel");
        }
    }

    public void a(Channel channel) {
        if (channel instanceof ac) {
            this.f8170e = (ac) channel;
            return;
        }
        throw new RuntimeException("wrong channel for client, expecting nfc channel");
    }
}
