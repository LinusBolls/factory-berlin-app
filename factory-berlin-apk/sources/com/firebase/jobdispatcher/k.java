package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* compiled from: GooglePlayMessengerCallback */
class k implements o {
    private final Messenger a;
    private final String b;

    k(Messenger messenger, String str) {
        this.a = messenger;
        this.b = str;
    }

    private Message b(int i2) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i2;
        Bundle bundle = new Bundle();
        bundle.putString("tag", this.b);
        obtain.setData(bundle);
        return obtain;
    }

    public void a(int i2) {
        try {
            this.a.send(b(i2));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }
}
