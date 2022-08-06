package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.b0.a;
import androidx.navigation.h;
import androidx.navigation.l;
import androidx.navigation.u;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater */
public final class t {
    private static final ThreadLocal<TypedValue> c = new ThreadLocal<>();
    private Context a;
    private y b;

    public t(Context context, y yVar) {
        this.a = context;
        this.b = yVar;
    }

    private static v a(TypedValue typedValue, v vVar, v vVar2, String str, String str2) {
        if (vVar == null || vVar == vVar2) {
            return vVar != null ? vVar : vVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private o b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i2) {
        int depth;
        o a2 = this.b.d(xmlResourceParser.getName()).a();
        a2.r(this.a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a2;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, a2, attributeSet, i2);
                } else if ("deepLink".equals(name)) {
                    h(resources, a2, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, a2, attributeSet, xmlResourceParser, i2);
                } else if ("include".equals(name) && (a2 instanceof q)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a0.NavInclude);
                    ((q) a2).E(c(obtainAttributes.getResourceId(a0.NavInclude_graph, 0)));
                    obtainAttributes.recycle();
                } else if (a2 instanceof q) {
                    ((q) a2).E(b(resources, xmlResourceParser, attributeSet, i2));
                }
            }
        }
        return a2;
    }

    private void d(Resources resources, o oVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i2) {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.NavAction);
        int resourceId = obtainAttributes.getResourceId(a.NavAction_android_id, 0);
        d dVar = new d(obtainAttributes.getResourceId(a.NavAction_destination, 0));
        u.a aVar = new u.a();
        aVar.d(obtainAttributes.getBoolean(a.NavAction_launchSingleTop, false));
        aVar.g(obtainAttributes.getResourceId(a.NavAction_popUpTo, -1), obtainAttributes.getBoolean(a.NavAction_popUpToInclusive, false));
        aVar.b(obtainAttributes.getResourceId(a.NavAction_enterAnim, -1));
        aVar.c(obtainAttributes.getResourceId(a.NavAction_exitAnim, -1));
        aVar.e(obtainAttributes.getResourceId(a.NavAction_popEnterAnim, -1));
        aVar.f(obtainAttributes.getResourceId(a.NavAction_popExitAnim, -1));
        dVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                    f(resources, bundle, attributeSet, i2);
                }
            }
        }
        if (!bundle.isEmpty()) {
            dVar.d(bundle);
        }
        oVar.s(resourceId, dVar);
        obtainAttributes.recycle();
    }

    private h e(TypedArray typedArray, Resources resources, int i2) {
        h.a aVar = new h.a();
        boolean z = false;
        aVar.c(typedArray.getBoolean(a.NavArgument_nullable, false));
        TypedValue typedValue = c.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            c.set(typedValue);
        }
        String string = typedArray.getString(a.NavArgument_argType);
        int i3 = null;
        v<Integer> a2 = string != null ? v.a(string, resources.getResourcePackageName(i2)) : null;
        if (typedArray.getValue(a.NavArgument_android_defaultValue, typedValue)) {
            v<Integer> vVar = v.c;
            if (a2 == vVar) {
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    i3 = Integer.valueOf(i4);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i3 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + typedValue.string + "' for " + a2.c() + ". Must be a reference to a resource.");
                }
            } else {
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    if (a2 == null) {
                        a2 = vVar;
                        i3 = Integer.valueOf(i5);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + typedValue.string + "' for " + a2.c() + ". You must use a \"" + v.c.c() + "\" type to reference other resources.");
                    }
                } else if (a2 == v.f1120k) {
                    i3 = typedArray.getString(a.NavArgument_android_defaultValue);
                } else {
                    int i6 = typedValue.type;
                    if (i6 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (a2 == null) {
                            a2 = v.d(charSequence);
                        }
                        i3 = a2.h(charSequence);
                    } else if (i6 == 4) {
                        a2 = a(typedValue, a2, v.f1116g, string, "float");
                        i3 = Float.valueOf(typedValue.getFloat());
                    } else if (i6 == 5) {
                        a2 = a(typedValue, a2, v.b, string, "dimension");
                        i3 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i6 == 18) {
                        a2 = a(typedValue, a2, v.f1118i, string, "boolean");
                        if (typedValue.data != 0) {
                            z = true;
                        }
                        i3 = Boolean.valueOf(z);
                    } else if (i6 < 16 || i6 > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    } else {
                        a2 = a(typedValue, a2, v.b, string, "integer");
                        i3 = Integer.valueOf(typedValue.data);
                    }
                }
            }
        }
        if (i3 != null) {
            aVar.b(i3);
        }
        if (a2 != null) {
            aVar.d(a2);
        }
        return aVar.a();
    }

    private void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i2) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.NavArgument);
        String string = obtainAttributes.getString(a.NavArgument_android_name);
        if (string != null) {
            h e2 = e(obtainAttributes, resources, i2);
            if (e2.c()) {
                e2.e(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void g(Resources resources, o oVar, AttributeSet attributeSet, int i2) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.NavArgument);
        String string = obtainAttributes.getString(a.NavArgument_android_name);
        if (string != null) {
            oVar.a(string, e(obtainAttributes, resources, i2));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void h(Resources resources, o oVar, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.NavDeepLink);
        String string = obtainAttributes.getString(a.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(a.NavDeepLink_action);
        String string3 = obtainAttributes.getString(a.NavDeepLink_mimeType);
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            l.a aVar = new l.a();
            if (string != null) {
                aVar.d(string.replace("${applicationId}", this.a.getPackageName()));
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.b(string2.replace("${applicationId}", this.a.getPackageName()));
            }
            if (string3 != null) {
                aVar.c(string3.replace("${applicationId}", this.a.getPackageName()));
            }
            oVar.d(aVar.a());
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.q c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.o r2 = r6.b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.q     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.q r2 = (androidx.navigation.q) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.c(int):androidx.navigation.q");
    }
}
