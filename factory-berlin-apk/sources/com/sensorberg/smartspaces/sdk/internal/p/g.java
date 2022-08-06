package com.sensorberg.smartspaces.sdk.internal.p;

import com.sensorberg.smartspaces.sdk.exception.BlueIdAuthorizationException;
import de.baimos.blueid.sdk.api.BlueIDMobileDevice;
import de.baimos.blueid.sdk.api.Channel;
import de.baimos.blueid.sdk.api.Command;
import de.baimos.blueid.sdk.api.CommandExecutionResponse;
import de.baimos.blueid.sdk.api.SecuredObject;
import de.baimos.blueid.sdk.api.exceptions.AuthorizationException;
import de.baimos.blueid.sdk.api.response.AuthorizationStatus;
import g.e.k.e;
import g.e.m.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: BlueIdOpening.kt */
public final class g extends e<a<Void, h>> implements Runnable {
    private final BlueIDMobileDevice q;
    private final String r;
    private final kotlin.e0.c.a<x> s;
    private final kotlin.e0.c.a<x> t;
    private final p<String, Integer, x> u;

    public g(BlueIDMobileDevice blueIDMobileDevice, String str, kotlin.e0.c.a<x> aVar, kotlin.e0.c.a<x> aVar2, p<? super String, ? super Integer, x> pVar) {
        k.e(blueIDMobileDevice, "blueIdSdk");
        k.e(str, "secureObjectId");
        k.e(aVar, "enableTime");
        k.e(aVar2, "disableTime");
        k.e(pVar, "onLowBattery");
        this.q = blueIDMobileDevice;
        this.r = str;
        this.s = aVar;
        this.t = aVar2;
        this.u = pVar;
        w(a.C0681a.b(a.f9908e, h.Opening, (Object) null, 2, (Object) null));
    }

    private final SecuredObject A(String str) {
        SecuredObject securedObjectById = this.q.getSecuredObjectById(str);
        if (securedObjectById == null) {
            n.a.a.k("Requested secureObjectId (" + str + ") was not available, re-synchronize blue-id", new Object[0]);
            this.q.synchronize();
            securedObjectById = this.q.getSecuredObjectById(str);
        }
        if (securedObjectById != null) {
            return securedObjectById;
        }
        throw new BlueIdAuthorizationException("No access to secure object", str, -100);
    }

    private final CommandExecutionResponse B(String str, d dVar) {
        SecuredObject A = A(str);
        Command commandById = A.getCommandById(dVar.a());
        k.d(commandById, "secureObject.getCommandById(blueIdCommand.id)");
        Channel channelForCommand = A.getChannelForCommand(Channel.BLUETOOTH_SMART_CHANNEL_ID, commandById);
        k.d(channelForCommand, "secureObject.getChannelF…mmand(\"btlespp\", command)");
        CommandExecutionResponse executeCommand = this.q.executeCommand(A, channelForCommand, commandById);
        k.d(executeCommand, "blueIdSdk.executeCommand…Object, channel, command)");
        return executeCommand;
    }

    private final c C(String str, kotlin.e0.c.a<x> aVar) {
        n.a.a.a("Requesting sync time access", new Object[0]);
        aVar.d();
        n.a.a.a("Re-synchronizing blueIdSdk", new Object[0]);
        this.q.synchronize();
        n.a.a.a("Busy sync time command", new Object[0]);
        return y(str, d.SyncTime);
    }

    private final c D(String str) {
        try {
            c y = y(str, d.Open);
            n.a.a.a("Open " + str + " response was " + y, new Object[0]);
            return y;
        } catch (AuthorizationException e2) {
            if (e2.getStatus() == AuthorizationStatus.TICKET_NOT_VALID_YET || e2.getStatus() == AuthorizationStatus.TICKET_NOT_VALID_ANYMORE) {
                n.a.a.a("Open " + str + " response was BlueIdCommandResponse.NeedsTimeSync", new Object[0]);
                return c.NeedsTimeSync;
            }
            String message = e2.getMessage();
            if (message == null) {
                message = "BlueId not authorized";
            }
            AuthorizationStatus status = e2.getStatus();
            k.d(status, "authorizationException.status");
            throw new BlueIdAuthorizationException(message, str, Integer.valueOf(status.getCode()));
        }
    }

    private final boolean E() {
        G(h.OpeningAgain);
        c D = D(this.r);
        this.t.d();
        int i2 = f.c[D.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Just synced time, but still request time-sync");
    }

    private final c F(CommandExecutionResponse commandExecutionResponse) {
        int responseCode = commandExecutionResponse.getResponseCode();
        if (responseCode == 0) {
            return c.Success;
        }
        if (responseCode == 100) {
            throw new RuntimeException("Already executing another command, dismissing command request");
        } else if (responseCode == 128) {
            return c.SuccessButLowBattery;
        } else {
            switch (responseCode) {
                case 49:
                    throw new RuntimeException("The secured object received an invalid parameter");
                case 50:
                    throw new RuntimeException("The secured object received an unknown command");
                case 51:
                    throw new RuntimeException("The secured object expected a parameter for the used command");
                case 52:
                    throw new RuntimeException("Error during execution of the procedure associated to command");
                default:
                    throw new RuntimeException("BlueId-Device responded with an unknown response code " + responseCode + " when running command");
            }
        }
    }

    private final h G(h hVar) {
        n.a.a.a("Blue-id execution: " + hVar.a(), new Object[0]);
        w(a.C0681a.b(a.f9908e, hVar, (Object) null, 2, (Object) null));
        return hVar;
    }

    private final c y(String str, d dVar) {
        return F(B(str, dVar));
    }

    private final boolean z() {
        G(h.SettingTime);
        int i2 = f.b[C(this.r, this.s).ordinal()];
        if (i2 == 1 || i2 == 2) {
            return E();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Sync time can't return NeedsTimeSync");
    }

    public void run() {
        h hVar;
        G(h.Opening);
        String str = null;
        try {
            int i2 = f.a[D(this.r).ordinal()];
            boolean z = true;
            if (i2 == 1) {
                z = false;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    z = z();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            w(a.f9908e.d(null));
            if (z) {
                this.u.l(this.r, 2);
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("BlueId failed to ");
            a aVar = (a) n();
            if (!(aVar == null || (hVar = (h) aVar.e()) == null)) {
                str = hVar.a();
            }
            sb.append(str);
            n.a.a.m(e2, sb.toString(), new Object[0]);
            w(a.f9908e.c(e2));
        }
    }
}
