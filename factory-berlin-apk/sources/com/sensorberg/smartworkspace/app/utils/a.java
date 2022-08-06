package com.sensorberg.smartworkspace.app.utils;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: BindingAdapters.kt */
public final class a {

    /* renamed from: com.sensorberg.smartworkspace.app.utils.a$a  reason: collision with other inner class name */
    /* compiled from: BindingAdapters.kt */
    static final class C0538a implements View.OnClickListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7998g;

        C0538a(kotlin.e0.c.a aVar) {
            this.f7998g = aVar;
        }

        public final void onClick(View view) {
            this.f7998g.d();
        }
    }

    /* compiled from: BindingAdapters.kt */
    static final class b implements TextView.OnEditorActionListener {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f7999g;

        b(kotlin.e0.c.a aVar) {
            this.f7999g = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            if (i2 != 2) {
                return false;
            }
            this.f7999g.d();
            return true;
        }
    }

    public static final void a(ImageView imageView, boolean z) {
        k.e(imageView, "view");
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof Animatable)) {
            return;
        }
        if (z) {
            ((Animatable) drawable).start();
        } else {
            ((Animatable) drawable).stop();
        }
    }

    public static final void b(View view, kotlin.e0.c.a<x> aVar) {
        k.e(view, "$this$onClick");
        k.e(aVar, "func");
        view.setOnClickListener(new C0538a(aVar));
    }

    public static final void c(EditText editText, kotlin.e0.c.a<x> aVar) {
        k.e(editText, "$this$onImeGo");
        k.e(aVar, "func");
        editText.setOnEditorActionListener(new b(aVar));
    }

    public static final void d(View view, boolean z) {
        k.e(view, "view");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void e(View view, boolean z) {
        k.e(view, "view");
        view.setVisibility(z ? 0 : 8);
    }

    public static final <T> void f(View view, LiveData<List<T>> liveData) {
        k.e(view, "view");
        k.e(liveData, "ld");
        List l2 = liveData.l();
        view.setVisibility((l2 == null || !l2.isEmpty()) ? 0 : 8);
    }

    public static final void g(ImageView imageView, int i2) {
        k.e(imageView, "imageView");
        imageView.setImageResource(i2);
    }
}
