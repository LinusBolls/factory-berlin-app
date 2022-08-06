package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import com.google.android.material.internal.e;
import g.b.a.c.n.b;

/* compiled from: BottomNavigationPresenter */
public class d implements m {

    /* renamed from: g  reason: collision with root package name */
    private g f3433g;

    /* renamed from: h  reason: collision with root package name */
    private c f3434h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3435i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f3436j;

    /* compiled from: BottomNavigationPresenter */
    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0072a();

        /* renamed from: g  reason: collision with root package name */
        int f3437g;

        /* renamed from: h  reason: collision with root package name */
        e f3438h;

        /* renamed from: com.google.android.material.bottomnavigation.d$a$a  reason: collision with other inner class name */
        /* compiled from: BottomNavigationPresenter */
        static class C0072a implements Parcelable.Creator<a> {
            C0072a() {
            }

            /* renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* renamed from: b */
            public a[] newArray(int i2) {
                return new a[i2];
            }
        }

        a() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f3437g);
            parcel.writeParcelable(this.f3438h, 0);
        }

        a(Parcel parcel) {
            this.f3437g = parcel.readInt();
            this.f3438h = (e) parcel.readParcelable(a.class.getClassLoader());
        }
    }

    public void a(g gVar, boolean z) {
    }

    public void b(Context context, g gVar) {
        this.f3433g = gVar;
        this.f3434h.b(gVar);
    }

    public void c(c cVar) {
        this.f3434h = cVar;
    }

    public void d(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f3434h.j(aVar.f3437g);
            this.f3434h.setBadgeDrawables(b.b(this.f3434h.getContext(), aVar.f3438h));
        }
    }

    public void e(int i2) {
        this.f3436j = i2;
    }

    public boolean f(r rVar) {
        return false;
    }

    public void g(boolean z) {
        if (!this.f3435i) {
            if (z) {
                this.f3434h.d();
            } else {
                this.f3434h.k();
            }
        }
    }

    public int getId() {
        return this.f3436j;
    }

    public void h(boolean z) {
        this.f3435i = z;
    }

    public boolean i() {
        return false;
    }

    public Parcelable j() {
        a aVar = new a();
        aVar.f3437g = this.f3434h.getSelectedItemId();
        aVar.f3438h = b.c(this.f3434h.getBadgeDrawables());
        return aVar;
    }

    public boolean k(g gVar, i iVar) {
        return false;
    }

    public boolean l(g gVar, i iVar) {
        return false;
    }

    public void m(m.a aVar) {
    }
}
