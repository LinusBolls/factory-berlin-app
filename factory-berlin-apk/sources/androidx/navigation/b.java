package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.navigation.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@x.b("activity")
/* compiled from: ActivityNavigator */
public class b extends x<a> {
    private Context a;
    private Activity b;

    /* compiled from: ActivityNavigator */
    public static class a extends o {
        private Intent o;
        private String p;

        public a(x<? extends a> xVar) {
            super((x<? extends o>) xVar);
        }

        /* access modifiers changed from: package-private */
        public boolean D() {
            return false;
        }

        public final String E() {
            Intent intent = this.o;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName F() {
            Intent intent = this.o;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String H() {
            return this.p;
        }

        public final Intent J() {
            return this.o;
        }

        public final a K(String str) {
            if (this.o == null) {
                this.o = new Intent();
            }
            this.o.setAction(str);
            return this;
        }

        public final a L(ComponentName componentName) {
            if (this.o == null) {
                this.o = new Intent();
            }
            this.o.setComponent(componentName);
            return this;
        }

        public final a M(Uri uri) {
            if (this.o == null) {
                this.o = new Intent();
            }
            this.o.setData(uri);
            return this;
        }

        public final a N(String str) {
            this.p = str;
            return this;
        }

        public final a P(String str) {
            if (this.o == null) {
                this.o = new Intent();
            }
            this.o.setPackage(str);
            return this;
        }

        public void r(Context context, AttributeSet attributeSet) {
            super.r(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a0.ActivityNavigator);
            String string = obtainAttributes.getString(a0.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            P(string);
            String string2 = obtainAttributes.getString(a0.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                L(new ComponentName(context, string2));
            }
            K(obtainAttributes.getString(a0.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(a0.ActivityNavigator_data);
            if (string3 != null) {
                M(Uri.parse(string3));
            }
            N(obtainAttributes.getString(a0.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        public String toString() {
            ComponentName F = F();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (F != null) {
                sb.append(" class=");
                sb.append(F.getClassName());
            } else {
                String E = E();
                if (E != null) {
                    sb.append(" action=");
                    sb.append(E);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: androidx.navigation.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityNavigator */
    public static final class C0024b implements x.a {
        private final int a;
        private final androidx.core.app.b b;

        public androidx.core.app.b a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public b(Context context) {
        this.a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public boolean e() {
        Activity activity = this.b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: f */
    public a a() {
        return new a(this);
    }

    /* renamed from: g */
    public o b(a aVar, Bundle bundle, u uVar, x.a aVar2) {
        Intent intent;
        int intExtra;
        if (aVar.J() != null) {
            Intent intent2 = new Intent(aVar.J());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String H = aVar.H();
                if (!TextUtils.isEmpty(H)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(H);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + H);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = aVar2 instanceof C0024b;
            if (z) {
                intent2.addFlags(((C0024b) aVar2).b());
            }
            if (!(this.a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (uVar != null && uVar.g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.b;
            int i2 = 0;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.m());
            if (uVar != null) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", uVar.c());
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", uVar.d());
            }
            if (z) {
                androidx.core.app.b a2 = ((C0024b) aVar2).a();
                if (a2 != null) {
                    androidx.core.content.a.l(this.a, intent2, a2.a());
                } else {
                    this.a.startActivity(intent2);
                }
            } else {
                this.a.startActivity(intent2);
            }
            if (uVar == null || this.b == null) {
                return null;
            }
            int a3 = uVar.a();
            int b2 = uVar.b();
            if (a3 == -1 && b2 == -1) {
                return null;
            }
            if (a3 == -1) {
                a3 = 0;
            }
            if (b2 != -1) {
                i2 = b2;
            }
            this.b.overridePendingTransition(a3, i2);
            return null;
        }
        throw new IllegalStateException("Destination " + aVar.m() + " does not have an Intent set.");
    }
}
