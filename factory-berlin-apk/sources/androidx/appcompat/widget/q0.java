package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import e.a.f;
import e.i.a.c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: SuggestionsAdapter */
class q0 extends c implements View.OnClickListener {
    private int A = -1;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private int E = -1;
    private final SearchView r;
    private final SearchableInfo s;
    private final Context t;
    private final WeakHashMap<String, Drawable.ConstantState> u;
    private final int v;
    private boolean w = false;
    private int x = 1;
    private ColorStateList y;
    private int z = -1;

    /* compiled from: SuggestionsAdapter */
    private static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f501d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f502e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.f501d = (ImageView) view.findViewById(16908296);
            this.f502e = (ImageView) view.findViewById(f.edit_query);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        SearchManager searchManager = (SearchManager) this.f8717j.getSystemService("search");
        this.r = searchView;
        this.s = searchableInfo;
        this.v = searchView.getSuggestionCommitIconResId();
        this.t = context;
        this.u = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.u.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.u.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.y == null) {
            TypedValue typedValue = new TypedValue();
            this.f8717j.getTheme().resolveAttribute(e.a.a.textColorSearchUrl, typedValue, true);
            this.y = this.f8717j.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.y, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f8717j.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("SuggestionsAdapter", e2.toString());
            return null;
        }
    }

    private Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.u.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.u.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.t.getResources());
        }
        Drawable m2 = m(componentName);
        if (m2 != null) {
            constantState = m2.getConstantState();
        }
        this.u.put(flattenToShortString, constantState);
        return m2;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p(Cursor cursor) {
        Drawable n2 = n(this.s.getSearchActivity());
        if (n2 != null) {
            return n2;
        }
        return this.f8717j.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.t     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.t.getPackageName() + "/" + parseInt;
            Drawable k2 = k(str2);
            if (k2 != null) {
                return k2;
            }
            Drawable f2 = androidx.core.content.a.f(this.t, parseInt);
            A(str2, f2);
            return f2;
        } catch (NumberFormatException unused) {
            Drawable k3 = k(str);
            if (k3 != null) {
                return k3;
            }
            Drawable q = q(Uri.parse(str));
            A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private Drawable t(Cursor cursor) {
        int i2 = this.C;
        if (i2 == -1) {
            return null;
        }
        Drawable s2 = s(cursor.getString(i2));
        if (s2 != null) {
            return s2;
        }
        return p(cursor);
    }

    private Drawable u(Cursor cursor) {
        int i2 = this.D;
        if (i2 == -1) {
            return null;
        }
        return s(cursor.getString(i2));
    }

    private static String w(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public void a(Cursor cursor) {
        if (this.w) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.z = cursor.getColumnIndex("suggest_text_1");
                this.A = cursor.getColumnIndex("suggest_text_2");
                this.B = cursor.getColumnIndex("suggest_text_2_url");
                this.C = cursor.getColumnIndex("suggest_icon_1");
                this.D = cursor.getColumnIndex("suggest_icon_2");
                this.E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public CharSequence c(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.s.shouldRewriteQueryFromData() && (o2 = o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.s.shouldRewriteQueryFromText() || (o = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.r.getVisibility() == 0 && this.r.getWindowVisibility() == 0) {
            try {
                Cursor v2 = v(this.s, charSequence2, 50);
                if (v2 != null) {
                    v2.getCount();
                    return v2;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    public void e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        a aVar = (a) view.getTag();
        int i2 = this.E;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.a != null) {
            z(aVar.a, w(cursor, this.z));
        }
        if (aVar.b != null) {
            String w2 = w(cursor, this.B);
            if (w2 != null) {
                charSequence = l(w2);
            } else {
                charSequence = w(cursor, this.A);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.a.setMaxLines(1);
                }
            }
            z(aVar.b, charSequence);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f501d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i4 = this.x;
        if (i4 == 2 || (i4 == 1 && (i3 & 1) != 0)) {
            aVar.f502e.setVisibility(0);
            aVar.f502e.setTag(aVar.a.getText());
            aVar.f502e.setOnClickListener(this);
            return;
        }
        aVar.f502e.setVisibility(8);
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View g2 = g(this.f8717j, this.f8716i, viewGroup);
            if (g2 != null) {
                ((a) g2.getTag()).a.setText(e2.toString());
            }
            return g2;
        }
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View h2 = h(this.f8717j, this.f8716i, viewGroup);
            if (h2 != null) {
                ((a) h2.getTag()).a.setText(e2.toString());
            }
            return h2;
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h2 = super.h(context, cursor, viewGroup);
        h2.setTag(new a(h2));
        ((ImageView) h2.findViewById(f.edit_query)).setImageResource(this.v);
        return h2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.r.U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable r(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f8717j.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    public Cursor v(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f8717j.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void x(int i2) {
        this.x = i2;
    }
}
