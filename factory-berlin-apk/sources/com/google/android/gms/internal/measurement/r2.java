package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final /* synthetic */ class r2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final s2 a;

    r2(s2 s2Var) {
        this.a = s2Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.d(sharedPreferences, str);
    }
}
