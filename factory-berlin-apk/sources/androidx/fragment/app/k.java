package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import e.l.c;

/* compiled from: FragmentLayoutInflaterFactory */
class k implements LayoutInflater.Factory2 {

    /* renamed from: g  reason: collision with root package name */
    private final m f825g;

    k(m mVar) {
        this.f825g = mVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (g.class.getName().equals(str)) {
            return new g(context, attributeSet, this.f825g);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !i.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f825g.W(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f825g.X(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f825g.W(id);
        }
        if (m.p0(2)) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + fragment);
        }
        if (fragment == null) {
            fragment = this.f825g.e0().a(context.getClassLoader(), attributeValue);
            fragment.s = true;
            fragment.B = resourceId != 0 ? resourceId : id;
            fragment.C = id;
            fragment.D = string;
            fragment.t = true;
            m mVar = this.f825g;
            fragment.x = mVar;
            j<?> jVar = mVar.o;
            fragment.y = jVar;
            fragment.I0(jVar.h(), attributeSet, fragment.f776h);
            this.f825g.d(fragment);
            this.f825g.A0(fragment);
        } else if (!fragment.t) {
            fragment.t = true;
            j<?> jVar2 = this.f825g.o;
            fragment.y = jVar2;
            fragment.I0(jVar2.h(), attributeSet, fragment.f776h);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        m mVar2 = this.f825g;
        if (mVar2.f836n >= 1 || !fragment.s) {
            this.f825g.A0(fragment);
        } else {
            mVar2.B0(fragment, 1);
        }
        View view2 = fragment.M;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.M.getTag() == null) {
                fragment.M.setTag(string);
            }
            return fragment.M;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
