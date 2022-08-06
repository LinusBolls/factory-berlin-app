package com.sensorberg.smartworkspace.app.k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sensorberg.factory.R;

/* compiled from: FragmentSettingsBinding */
public final class h1 {
    private final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f7163d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f7164e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f7165f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f7166g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f7167h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f7168i;

    /* renamed from: j  reason: collision with root package name */
    public final Button f7169j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f7170k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f7171l;

    /* renamed from: m  reason: collision with root package name */
    public final Toolbar f7172m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f7173n;
    public final TextView o;

    private h1(ConstraintLayout constraintLayout, TextView textView, AppBarLayout appBarLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, Button button, TextView textView9, TextView textView10, Toolbar toolbar, TextView textView11, TextView textView12) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.f7163d = textView3;
        this.f7164e = textView4;
        this.f7165f = textView5;
        this.f7166g = textView6;
        this.f7167h = textView7;
        this.f7168i = textView8;
        this.f7169j = button;
        this.f7170k = textView9;
        this.f7171l = textView10;
        this.f7172m = toolbar;
        this.f7173n = textView11;
        this.o = textView12;
    }

    public static h1 a(View view) {
        View view2 = view;
        int i2 = R.id.about;
        TextView textView = (TextView) view2.findViewById(R.id.about);
        if (textView != null) {
            i2 = R.id.appbar;
            AppBarLayout appBarLayout = (AppBarLayout) view2.findViewById(R.id.appbar);
            if (appBarLayout != null) {
                i2 = R.id.changePassword;
                TextView textView2 = (TextView) view2.findViewById(R.id.changePassword);
                if (textView2 != null) {
                    i2 = R.id.debug;
                    TextView textView3 = (TextView) view2.findViewById(R.id.debug);
                    if (textView3 != null) {
                        i2 = R.id.email;
                        TextView textView4 = (TextView) view2.findViewById(R.id.email);
                        if (textView4 != null) {
                            i2 = R.id.feedback;
                            TextView textView5 = (TextView) view2.findViewById(R.id.feedback);
                            if (textView5 != null) {
                                i2 = R.id.link1;
                                TextView textView6 = (TextView) view2.findViewById(R.id.link1);
                                if (textView6 != null) {
                                    i2 = R.id.link2;
                                    TextView textView7 = (TextView) view2.findViewById(R.id.link2);
                                    if (textView7 != null) {
                                        i2 = R.id.link3;
                                        TextView textView8 = (TextView) view2.findViewById(R.id.link3);
                                        if (textView8 != null) {
                                            i2 = R.id.logout;
                                            Button button = (Button) view2.findViewById(R.id.logout);
                                            if (button != null) {
                                                i2 = R.id.myRenzCredentials;
                                                TextView textView9 = (TextView) view2.findViewById(R.id.myRenzCredentials);
                                                if (textView9 != null) {
                                                    i2 = R.id.pin;
                                                    TextView textView10 = (TextView) view2.findViewById(R.id.pin);
                                                    if (textView10 != null) {
                                                        i2 = R.id.toolbar;
                                                        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                        if (toolbar != null) {
                                                            i2 = R.id.username;
                                                            TextView textView11 = (TextView) view2.findViewById(R.id.username);
                                                            if (textView11 != null) {
                                                                i2 = R.id.version;
                                                                TextView textView12 = (TextView) view2.findViewById(R.id.version);
                                                                if (textView12 != null) {
                                                                    return new h1((ConstraintLayout) view2, textView, appBarLayout, textView2, textView3, textView4, textView5, textView6, textView7, textView8, button, textView9, textView10, toolbar, textView11, textView12);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static h1 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    public static h1 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.a;
    }
}
