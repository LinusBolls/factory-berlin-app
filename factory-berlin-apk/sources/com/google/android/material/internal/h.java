package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import e.u.m;
import e.u.s;
import java.util.Map;

/* compiled from: TextScale */
public class h extends m {

    /* compiled from: TextScale */
    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ TextView a;

        a(h hVar, TextView textView) {
            this.a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.setScaleX(floatValue);
            this.a.setScaleY(floatValue);
        }
    }

    private void q0(s sVar) {
        View view = sVar.b;
        if (view instanceof TextView) {
            sVar.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void h(s sVar) {
        q0(sVar);
    }

    public void r(s sVar) {
        q0(sVar);
    }

    public Animator v(ViewGroup viewGroup, s sVar, s sVar2) {
        if (sVar == null || sVar2 == null || !(sVar.b instanceof TextView)) {
            return null;
        }
        View view = sVar2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = sVar.a;
        Map<String, Object> map2 = sVar2.a;
        float f2 = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f2});
        ofFloat.addUpdateListener(new a(this, textView));
        return ofFloat;
    }
}
