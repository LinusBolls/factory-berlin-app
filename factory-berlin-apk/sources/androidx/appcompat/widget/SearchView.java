package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import e.h.k.u;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements e.a.n.c {
    static final k w0 = new k();
    final ImageView A;
    final ImageView B;
    final ImageView C;
    private final View D;
    private p E;
    private Rect F;
    private Rect G;
    private int[] H;
    private int[] I;
    private final ImageView J;
    private final Drawable K;
    private final int L;
    private final int M;
    private final Intent N;
    private final Intent O;
    private final CharSequence P;
    private m Q;
    private l R;
    View.OnFocusChangeListener S;
    private n T;
    private View.OnClickListener U;
    private boolean V;
    private boolean W;
    e.i.a.a a0;
    private boolean b0;
    private CharSequence c0;
    private boolean d0;
    private boolean e0;
    private int f0;
    private boolean g0;
    private CharSequence h0;
    private CharSequence i0;
    private boolean j0;
    private int k0;
    SearchableInfo l0;
    private Bundle m0;
    private final Runnable n0;
    private Runnable o0;
    private final WeakHashMap<String, Drawable.ConstantState> p0;
    private final View.OnClickListener q0;
    View.OnKeyListener r0;
    private final TextView.OnEditorActionListener s0;
    private final AdapterView.OnItemClickListener t0;
    private final AdapterView.OnItemSelectedListener u0;
    final SearchAutoComplete v;
    private TextWatcher v0;
    private final View w;
    private final View x;
    private final View y;
    final ImageView z;

    public static class SearchAutoComplete extends d {

        /* renamed from: j  reason: collision with root package name */
        private int f333j;

        /* renamed from: k  reason: collision with root package name */
        private SearchView f334k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f335l;

        /* renamed from: m  reason: collision with root package name */
        final Runnable f336m;

        class a implements Runnable {
            a() {
            }

            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.a.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (this.f335l) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f335l = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f333j <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f335l) {
                removeCallbacks(this.f336m);
                post(this.f336m);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            this.f334k.Z();
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f334k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f334k.hasFocus() && getVisibility() == 0) {
                this.f335l = true;
                if (SearchView.M(getContext())) {
                    SearchView.w0.c(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f335l = false;
                removeCallbacks(this.f336m);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f335l = false;
                removeCallbacks(this.f336m);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f335l = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f334k = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f333j = i2;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f336m = new a();
            this.f333j = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            e.i.a.a aVar = SearchView.this.a0;
            if (aVar instanceof q0) {
                aVar.a((Cursor) null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.S;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.z) {
                searchView.V();
            } else if (view == searchView.B) {
                searchView.R();
            } else if (view == searchView.A) {
                searchView.W();
            } else if (view == searchView.C) {
                searchView.a0();
            } else if (view == searchView.v) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.l0 == null) {
                return false;
            }
            if (searchView.v.isPopupShowing() && SearchView.this.v.getListSelection() != -1) {
                return SearchView.this.X(view, i2, keyEvent);
            }
            if (SearchView.this.v.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, (String) null, searchView2.v.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.S(i2, 0, (String) null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.T(i2);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class k {
        private Method a;
        private Method b;
        private Method c;

        k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        public void a(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(AutoCompleteTextView autoCompleteTextView) {
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c(AutoCompleteTextView autoCompleteTextView, boolean z) {
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i2);

        boolean b(int i2);
    }

    static class o extends e.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        boolean f347i;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            /* renamed from: a */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            /* renamed from: c */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f347i + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f347i));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f347i = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    private static class p extends TouchDelegate {
        private final View a;
        private final Rect b = new Rect();
        private final Rect c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        private final Rect f348d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private final int f349e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f350f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f349e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f348d.set(rect);
            Rect rect3 = this.f348d;
            int i2 = this.f349e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f350f
                r7.f350f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f350f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f348d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f350f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.i0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.m0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.l0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i2, String str) {
        int i3;
        Uri uri;
        String o2;
        try {
            String o3 = q0.o(cursor, "suggest_intent_action");
            if (o3 == null) {
                o3 = this.l0.getSuggestIntentAction();
            }
            if (o3 == null) {
                o3 = "android.intent.action.SEARCH";
            }
            String str2 = o3;
            String o4 = q0.o(cursor, "suggest_intent_data");
            if (o4 == null) {
                o4 = this.l0.getSuggestIntentData();
            }
            if (!(o4 == null || (o2 = q0.o(cursor, "suggest_intent_data_id")) == null)) {
                o4 = o4 + "/" + Uri.encode(o2);
            }
            if (o4 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o4);
            }
            return C(str2, uri, q0.o(cursor, "suggest_intent_extra_data"), q0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                i3 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i3 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.m0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void G() {
        this.v.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.H);
        getLocationInWindow(this.I);
        int[] iArr = this.H;
        int i2 = iArr[1];
        int[] iArr2 = this.I;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.V || this.K == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.v.getTextSize()) * 1.25d);
        this.K.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.K), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.l0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.l0.getVoiceSearchLaunchWebSearch()) {
            intent = this.N;
        } else if (this.l0.getVoiceSearchLaunchRecognizer()) {
            intent = this.O;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.b0 || this.g0) && !L();
    }

    private void O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e2) {
                Log.e("SearchView", "Failed launch activity: " + intent, e2);
            }
        }
    }

    private boolean Q(int i2, int i3, String str) {
        Cursor b2 = this.a0.b();
        if (b2 == null || !b2.moveToPosition(i2)) {
            return false;
        }
        O(D(b2, i3, str));
        return true;
    }

    private void b0() {
        post(this.n0);
    }

    private void c0(int i2) {
        Editable text = this.v.getText();
        Cursor b2 = this.a0.b();
        if (b2 != null) {
            if (b2.moveToPosition(i2)) {
                CharSequence c2 = this.a0.c(b2);
                if (c2 != null) {
                    setQuery(c2);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void e0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.v.getText());
        int i2 = 0;
        if (!z3 && (!this.V || this.j0)) {
            z2 = false;
        }
        ImageView imageView = this.B;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.B.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.v;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.a.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.a.d.abc_search_view_preferred_width);
    }

    private void h0() {
        this.v.setThreshold(this.l0.getSuggestThreshold());
        this.v.setImeOptions(this.l0.getImeOptions());
        int inputType = this.l0.getInputType();
        int i2 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.l0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.v.setInputType(inputType);
        e.i.a.a aVar = this.a0;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.l0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.l0, this.p0);
            this.a0 = q0Var;
            this.v.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.a0;
            if (this.d0) {
                i2 = 2;
            }
            q0Var2.x(i2);
        }
    }

    private void i0() {
        this.y.setVisibility((!N() || !(this.A.getVisibility() == 0 || this.C.getVisibility() == 0)) ? 8 : 0);
    }

    private void j0(boolean z2) {
        this.A.setVisibility((!this.b0 || !N() || !hasFocus() || (!z2 && this.g0)) ? 8 : 0);
    }

    private void k0(boolean z2) {
        this.W = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.v.getText());
        this.z.setVisibility(i3);
        j0(z3);
        this.w.setVisibility(z2 ? 8 : 0);
        if (this.J.getDrawable() == null || this.V) {
            i2 = 8;
        }
        this.J.setVisibility(i2);
        e0();
        l0(!z3);
        i0();
    }

    private void l0(boolean z2) {
        int i2 = 8;
        if (this.g0 && !L() && z2) {
            this.A.setVisibility(8);
            i2 = 0;
        }
        this.C.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.v.setText(charSequence);
        this.v.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    public void B() {
        int i2;
        if (this.D.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.x.getPaddingLeft();
            Rect rect = new Rect();
            boolean b2 = c1.b(this);
            int dimensionPixelSize = this.V ? resources.getDimensionPixelSize(e.a.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(e.a.d.abc_dropdownitem_text_padding_left) : 0;
            this.v.getDropDownBackground().getPadding(rect);
            if (b2) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.v.setDropDownHorizontalOffset(i2);
            this.v.setDropDownWidth((((this.D.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.v.refreshAutoCompleteResults();
            return;
        }
        w0.b(this.v);
        w0.a(this.v);
    }

    public boolean L() {
        return this.W;
    }

    /* access modifiers changed from: package-private */
    public void P(int i2, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    /* access modifiers changed from: package-private */
    public void R() {
        if (!TextUtils.isEmpty(this.v.getText())) {
            this.v.setText("");
            this.v.requestFocus();
            this.v.setImeVisibility(true);
        } else if (this.V) {
            l lVar = this.R;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean S(int i2, int i3, String str) {
        n nVar = this.T;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        Q(i2, 0, (String) null);
        this.v.setImeVisibility(false);
        G();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean T(int i2) {
        n nVar = this.T;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        c0(i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void V() {
        k0(false);
        this.v.requestFocus();
        this.v.setImeVisibility(true);
        View.OnClickListener onClickListener = this.U;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Editable text = this.v.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.Q;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.l0 != null) {
                    P(0, (String) null, text.toString());
                }
                this.v.setImeVisibility(false);
                G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean X(View view, int i2, KeyEvent keyEvent) {
        int i3;
        if (this.l0 != null && this.a0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return S(this.v.getListSelection(), 0, (String) null);
            }
            if (i2 == 21 || i2 == 22) {
                if (i2 == 21) {
                    i3 = 0;
                } else {
                    i3 = this.v.length();
                }
                this.v.setSelection(i3);
                this.v.setListSelection(0);
                this.v.clearListSelection();
                w0.c(this.v, true);
                return true;
            } else if (i2 != 19 || this.v.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Y(CharSequence charSequence) {
        Editable text = this.v.getText();
        this.i0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        j0(z2);
        l0(!z2);
        e0();
        i0();
        if (this.Q != null && !TextUtils.equals(charSequence, this.h0)) {
            this.Q.a(charSequence.toString());
        }
        this.h0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    public void Z() {
        k0(L());
        b0();
        if (this.v.hasFocus()) {
            H();
        }
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        SearchableInfo searchableInfo = this.l0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(F(this.N, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(E(this.O, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public void c() {
        if (!this.j0) {
            this.j0 = true;
            int imeOptions = this.v.getImeOptions();
            this.k0 = imeOptions;
            this.v.setImeOptions(imeOptions | 33554432);
            this.v.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.e0 = true;
        super.clearFocus();
        this.v.clearFocus();
        this.v.setImeVisibility(false);
        this.e0 = false;
    }

    public void d0(CharSequence charSequence, boolean z2) {
        this.v.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.v;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.i0 = charSequence;
        }
        if (z2 && !TextUtils.isEmpty(charSequence)) {
            W();
        }
    }

    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.v.setImeOptions(this.k0);
        this.j0 = false;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        int[] iArr = this.v.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.x.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.y.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.v.getImeOptions();
    }

    public int getInputType() {
        return this.v.getInputType();
    }

    public int getMaxWidth() {
        return this.f0;
    }

    public CharSequence getQuery() {
        return this.v.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.c0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.l0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.P;
        }
        return getContext().getText(this.l0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.M;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.L;
    }

    public e.i.a.a getSuggestionsAdapter() {
        return this.a0;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.n0);
        post(this.o0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            I(this.v, this.F);
            Rect rect = this.G;
            Rect rect2 = this.F;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.E;
            if (pVar == null) {
                p pVar2 = new p(this.G, this.F, this.v);
                this.E = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.G, this.F);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (L()) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        k0(oVar.f347i);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f347i = L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        b0();
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.e0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.v.requestFocus(i2, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.m0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.V != z2) {
            this.V = z2;
            k0(z2);
            g0();
        }
    }

    public void setImeOptions(int i2) {
        this.v.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.v.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.R = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.S = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.Q = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.U = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.T = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.c0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.d0 = z2;
        e.i.a.a aVar = this.a0;
        if (aVar instanceof q0) {
            ((q0) aVar).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.l0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K2 = K();
        this.g0 = K2;
        if (K2) {
            this.v.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.b0 = z2;
        k0(L());
    }

    public void setSuggestionsAdapter(e.i.a.a aVar) {
        this.a0 = aVar;
        this.v.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new int[2];
        this.I = new int[2];
        this.n0 = new b();
        this.o0 = new c();
        this.p0 = new WeakHashMap<>();
        this.q0 = new f();
        this.r0 = new g();
        this.s0 = new h();
        this.t0 = new i();
        this.u0 = new j();
        this.v0 = new a();
        w0 u = w0.u(context, attributeSet, e.a.j.SearchView, i2, 0);
        LayoutInflater.from(context).inflate(u.n(e.a.j.SearchView_layout, e.a.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.a.f.search_src_text);
        this.v = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.w = findViewById(e.a.f.search_edit_frame);
        this.x = findViewById(e.a.f.search_plate);
        this.y = findViewById(e.a.f.submit_area);
        this.z = (ImageView) findViewById(e.a.f.search_button);
        this.A = (ImageView) findViewById(e.a.f.search_go_btn);
        this.B = (ImageView) findViewById(e.a.f.search_close_btn);
        this.C = (ImageView) findViewById(e.a.f.search_voice_btn);
        this.J = (ImageView) findViewById(e.a.f.search_mag_icon);
        u.h0(this.x, u.g(e.a.j.SearchView_queryBackground));
        u.h0(this.y, u.g(e.a.j.SearchView_submitBackground));
        this.z.setImageDrawable(u.g(e.a.j.SearchView_searchIcon));
        this.A.setImageDrawable(u.g(e.a.j.SearchView_goIcon));
        this.B.setImageDrawable(u.g(e.a.j.SearchView_closeIcon));
        this.C.setImageDrawable(u.g(e.a.j.SearchView_voiceIcon));
        this.J.setImageDrawable(u.g(e.a.j.SearchView_searchIcon));
        this.K = u.g(e.a.j.SearchView_searchHintIcon);
        y0.a(this.z, getResources().getString(e.a.h.abc_searchview_description_search));
        this.L = u.n(e.a.j.SearchView_suggestionRowLayout, e.a.g.abc_search_dropdown_item_icons_2line);
        this.M = u.n(e.a.j.SearchView_commitIcon, 0);
        this.z.setOnClickListener(this.q0);
        this.B.setOnClickListener(this.q0);
        this.A.setOnClickListener(this.q0);
        this.C.setOnClickListener(this.q0);
        this.v.setOnClickListener(this.q0);
        this.v.addTextChangedListener(this.v0);
        this.v.setOnEditorActionListener(this.s0);
        this.v.setOnItemClickListener(this.t0);
        this.v.setOnItemSelectedListener(this.u0);
        this.v.setOnKeyListener(this.r0);
        this.v.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u.a(e.a.j.SearchView_iconifiedByDefault, true));
        int f2 = u.f(e.a.j.SearchView_android_maxWidth, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.P = u.p(e.a.j.SearchView_defaultQueryHint);
        this.c0 = u.p(e.a.j.SearchView_queryHint);
        int k2 = u.k(e.a.j.SearchView_android_imeOptions, -1);
        if (k2 != -1) {
            setImeOptions(k2);
        }
        int k3 = u.k(e.a.j.SearchView_android_inputType, -1);
        if (k3 != -1) {
            setInputType(k3);
        }
        setFocusable(u.a(e.a.j.SearchView_android_focusable, true));
        u.v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.N = intent;
        intent.addFlags(268435456);
        this.N.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.O = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.v.getDropDownAnchor());
        this.D = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        k0(this.V);
        g0();
    }
}
