package com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.f;

import android.content.res.Resources;
import com.sensorberg.smartspaces.sdk.model.Property;
import com.sensorberg.smartworkspace.app.screens.spaces.iotdetails.e;
import com.sensorberg.smartworkspace.app.screens.spaces.o;
import com.sensorberg.smartworkspace.app.utils.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GenericMapper.kt */
public final class c {
    private final Resources a;
    private final r b;

    public c(Resources resources, r rVar) {
        k.e(resources, "resources");
        k.e(rVar, "uniqueIdMap");
        this.a = resources;
        this.b = rVar;
    }

    public static /* synthetic */ e e(c cVar, Property property, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return cVar.d(property, str, str2);
    }

    public final e.C0532e a(int i2, Integer num, Property.Binary binary) {
        String str;
        if (binary == null || !binary.getWritable()) {
            return null;
        }
        long a2 = this.b.a(binary.getKind());
        String string = this.a.getString(i2);
        k.d(string, "resources.getString(titleResId)");
        if (num == null || (str = this.a.getString(num.intValue())) == null) {
            str = "";
        }
        return new e.C0532e(a2, binary, string, str, false, binary.getValue());
    }

    public final List<e> b(List<? extends Property> list) {
        k.e(list, "properties");
        ArrayList arrayList = new ArrayList();
        for (Property e2 : list) {
            e e3 = e(this, e2, (String) null, (String) null, 6, (Object) null);
            if (e3 != null) {
                arrayList.add(e3);
            }
        }
        return arrayList;
    }

    public final e.d c(int i2, o oVar, Property.Numeric numeric) {
        k.e(oVar, "kind");
        e.d dVar = null;
        if (numeric != null) {
            if (!numeric.getWritable()) {
                return null;
            }
            com.sensorberg.smartworkspace.app.utils.k kVar = new com.sensorberg.smartworkspace.app.utils.k(numeric.getMinValue(), numeric.getMaxValue());
            long a2 = this.b.a(numeric.getKind());
            String string = this.a.getString(i2);
            k.d(string, "resources.getString(titleResId)");
            int a3 = kVar.a(numeric.getValue());
            String c = oVar.c();
            if (c == null) {
                c = "";
            }
            dVar = new e.d(a2, numeric, string, false, a3, kVar, c);
        }
        return dVar;
    }

    public final e d(Property property, String str, String str2) {
        String str3;
        k.e(property, "property");
        o a2 = o.f7957d.a(property);
        long a3 = this.b.a(property.getKind());
        if (str == null) {
            if (a2 != null) {
                str = this.a.getString(a2.b());
            } else {
                str = null;
            }
        }
        if (str == null) {
            str = property.getKind();
        }
        String str4 = str;
        boolean z = property instanceof Property.Binary;
        if (z && property.getWritable()) {
            Property.Binary binary = (Property.Binary) property;
            return new e.C0532e(a3, binary, str4, str2, false, binary.getValue());
        } else if (z && !property.getWritable()) {
            return new e.c(a3, str4, String.valueOf(((Property.Binary) property).getValue()));
        } else {
            boolean z2 = property instanceof Property.Numeric;
            if (z2 && property.getWritable()) {
                Property.Numeric numeric = (Property.Numeric) property;
                com.sensorberg.smartworkspace.app.utils.k kVar = new com.sensorberg.smartworkspace.app.utils.k(numeric.getMinValue(), numeric.getMaxValue());
                int a4 = kVar.a(numeric.getValue());
                if (a2 == null || (str3 = a2.c()) == null) {
                    str3 = "";
                }
                return new e.d(a3, numeric, str4, false, a4, kVar, str3);
            } else if (!z2 || property.getWritable()) {
                return null;
            } else {
                return new e.c(a3, str4, String.valueOf(((Property.Numeric) property).getValue()));
            }
        }
    }
}
