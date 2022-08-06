package androidx.databinding.j;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.g;

/* compiled from: TextViewBindingAdapter */
public class b {

    /* compiled from: TextViewBindingAdapter */
    static class a implements TextWatcher {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f771g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f772h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f773i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C0018b f774j;

        a(c cVar, d dVar, g gVar, C0018b bVar) {
            this.f771g = cVar;
            this.f772h = dVar;
            this.f773i = gVar;
            this.f774j = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C0018b bVar = this.f774j;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            c cVar = this.f771g;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i2, i3, i4);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            d dVar = this.f772h;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i2, i3, i4);
            }
            g gVar = this.f773i;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* renamed from: androidx.databinding.j.b$b  reason: collision with other inner class name */
    /* compiled from: TextViewBindingAdapter */
    public interface C0018b {
        void afterTextChanged(Editable editable);
    }

    /* compiled from: TextViewBindingAdapter */
    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4);
    }

    /* compiled from: TextViewBindingAdapter */
    public interface d {
        void onTextChanged(CharSequence charSequence, int i2, int i3, int i4);
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    private static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return true;
            }
        }
        return false;
    }

    public static void c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence == text) {
            return;
        }
        if (charSequence != null || text.length() != 0) {
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void d(TextView textView, c cVar, d dVar, C0018b bVar, g gVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && gVar == null) ? null : new a(cVar, dVar, gVar, bVar);
        TextWatcher textWatcher = (TextWatcher) a.a(textView, aVar, androidx.databinding.k.b.b.textWatcher);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}
