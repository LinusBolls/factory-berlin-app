package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
class a extends VersionedParcel {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f1516d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f1517e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1518f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1519g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1520h;

    /* renamed from: i  reason: collision with root package name */
    private int f1521i;

    /* renamed from: j  reason: collision with root package name */
    private int f1522j;

    /* renamed from: k  reason: collision with root package name */
    private int f1523k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e.e.a(), new e.e.a(), new e.e.a());
    }

    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f1517e.writeInt(bArr.length);
            this.f1517e.writeByteArray(bArr);
            return;
        }
        this.f1517e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1517e, 0);
    }

    public void E(int i2) {
        this.f1517e.writeInt(i2);
    }

    public void G(Parcelable parcelable) {
        this.f1517e.writeParcelable(parcelable, 0);
    }

    public void I(String str) {
        this.f1517e.writeString(str);
    }

    public void a() {
        int i2 = this.f1521i;
        if (i2 >= 0) {
            int i3 = this.f1516d.get(i2);
            int dataPosition = this.f1517e.dataPosition();
            this.f1517e.setDataPosition(i3);
            this.f1517e.writeInt(dataPosition - i3);
            this.f1517e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    public VersionedParcel b() {
        Parcel parcel = this.f1517e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1522j;
        if (i2 == this.f1518f) {
            i2 = this.f1519g;
        }
        int i3 = i2;
        return new a(parcel, dataPosition, i3, this.f1520h + "  ", this.a, this.b, this.c);
    }

    public boolean g() {
        return this.f1517e.readInt() != 0;
    }

    public byte[] i() {
        int readInt = this.f1517e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1517e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1517e);
    }

    public boolean m(int i2) {
        while (this.f1522j < this.f1519g) {
            int i3 = this.f1523k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f1517e.setDataPosition(this.f1522j);
            int readInt = this.f1517e.readInt();
            this.f1523k = this.f1517e.readInt();
            this.f1522j += readInt;
        }
        if (this.f1523k == i2) {
            return true;
        }
        return false;
    }

    public int o() {
        return this.f1517e.readInt();
    }

    public <T extends Parcelable> T q() {
        return this.f1517e.readParcelable(a.class.getClassLoader());
    }

    public String s() {
        return this.f1517e.readString();
    }

    public void w(int i2) {
        a();
        this.f1521i = i2;
        this.f1516d.put(i2, this.f1517e.dataPosition());
        E(0);
        E(i2);
    }

    public void y(boolean z) {
        this.f1517e.writeInt(z ? 1 : 0);
    }

    private a(Parcel parcel, int i2, int i3, String str, e.e.a<String, Method> aVar, e.e.a<String, Method> aVar2, e.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1516d = new SparseIntArray();
        this.f1521i = -1;
        this.f1522j = 0;
        this.f1523k = -1;
        this.f1517e = parcel;
        this.f1518f = i2;
        this.f1519g = i3;
        this.f1522j = i2;
        this.f1520h = str;
    }
}
