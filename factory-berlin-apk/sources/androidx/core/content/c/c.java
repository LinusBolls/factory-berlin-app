package androidx.core.content.c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: FontResourcesParserCompat */
public class c {

    /* compiled from: FontResourcesParserCompat */
    public interface a {
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class b implements a {
        private final C0014c[] a;

        public b(C0014c[] cVarArr) {
            this.a = cVarArr;
        }

        public C0014c[] a() {
            return this.a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c  reason: collision with other inner class name */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0014c {
        private final String a;
        private int b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private String f701d;

        /* renamed from: e  reason: collision with root package name */
        private int f702e;

        /* renamed from: f  reason: collision with root package name */
        private int f703f;

        public C0014c(String str, int i2, boolean z, String str2, int i3, int i4) {
            this.a = str;
            this.b = i2;
            this.c = z;
            this.f701d = str2;
            this.f702e = i3;
            this.f703f = i4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f703f;
        }

        public int c() {
            return this.f702e;
        }

        public String d() {
            return this.f701d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* compiled from: FontResourcesParserCompat */
    public static final class d implements a {
        private final e.h.h.a a;
        private final int b;
        private final int c;

        public d(e.h.h.a aVar, int i2, int i3) {
            this.a = aVar;
            this.c = i2;
            this.b = i3;
        }

        public int a() {
            return this.c;
        }

        public e.h.h.a b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static androidx.core.content.c.c.a b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.c.c$a r3 = d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.c.c.b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.c.c$a");
    }

    public static List<List<byte[]>> c(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e.h.c.FontFamily);
        String string = obtainAttributes.getString(e.h.c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(e.h.c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(e.h.c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(e.h.c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(e.h.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(e.h.c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((C0014c[]) arrayList.toArray(new C0014c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(new e.h.h.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
    }

    private static C0014c f(XmlPullParser xmlPullParser, Resources resources) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e.h.c.FontFamilyFont);
        if (obtainAttributes.hasValue(e.h.c.FontFamilyFont_fontWeight)) {
            i2 = e.h.c.FontFamilyFont_fontWeight;
        } else {
            i2 = e.h.c.FontFamilyFont_android_fontWeight;
        }
        int i7 = obtainAttributes.getInt(i2, 400);
        if (obtainAttributes.hasValue(e.h.c.FontFamilyFont_fontStyle)) {
            i3 = e.h.c.FontFamilyFont_fontStyle;
        } else {
            i3 = e.h.c.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(e.h.c.FontFamilyFont_ttcIndex)) {
            i4 = e.h.c.FontFamilyFont_ttcIndex;
        } else {
            i4 = e.h.c.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(e.h.c.FontFamilyFont_fontVariationSettings)) {
            i5 = e.h.c.FontFamilyFont_fontVariationSettings;
        } else {
            i5 = e.h.c.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i8 = obtainAttributes.getInt(i4, 0);
        if (obtainAttributes.hasValue(e.h.c.FontFamilyFont_font)) {
            i6 = e.h.c.FontFamilyFont_font;
        } else {
            i6 = e.h.c.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i6, 0);
        String string2 = obtainAttributes.getString(i6);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0014c(string2, i7, z, string, i8, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
