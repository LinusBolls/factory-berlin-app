package e.h.i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat */
public class c implements Spannable {

    /* renamed from: g  reason: collision with root package name */
    private final Spannable f8663g;

    /* renamed from: h  reason: collision with root package name */
    private final a f8664h;

    /* renamed from: i  reason: collision with root package name */
    private final PrecomputedText f8665i;

    public a a() {
        return this.f8664h;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f8663g;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i2) {
        return this.f8663g.charAt(i2);
    }

    public int getSpanEnd(Object obj) {
        return this.f8663g.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f8663g.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f8663g.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f8665i.getSpans(i2, i3, cls);
        }
        return this.f8663g.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.f8663g.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f8663g.nextSpanTransition(i2, i3, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f8665i.removeSpan(obj);
        } else {
            this.f8663g.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f8665i.setSpan(obj, i2, i3, i4);
        } else {
            this.f8663g.setSpan(obj, i2, i3, i4);
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f8663g.subSequence(i2, i3);
    }

    public String toString() {
        return this.f8663g.toString();
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8666d;

        /* renamed from: e.h.i.c$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0560a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;

            /* renamed from: d  reason: collision with root package name */
            private int f8667d;

            public C0560a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.f8667d = 1;
                } else {
                    this.f8667d = 0;
                    this.c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.b = null;
                }
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.f8667d);
            }

            public C0560a b(int i2) {
                this.c = i2;
                return this;
            }

            public C0560a c(int i2) {
                this.f8667d = i2;
                return this;
            }

            public C0560a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.f8666d = i3;
        }

        public boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.c != aVar.b() || this.f8666d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.f8666d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.b == aVar.d();
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return e.h.j.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f8666d));
            } else if (i2 >= 21) {
                return e.h.j.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f8666d));
            } else if (i2 >= 18) {
                return e.h.j.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f8666d));
            } else if (i2 >= 17) {
                return e.h.j.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f8666d));
            } else {
                return e.h.j.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f8666d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.a.getTextSize());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                sb.append(", textLocale=" + this.a.getTextLocales());
            } else if (i2 >= 17) {
                sb.append(", textLocale=" + this.a.getTextLocale());
            }
            sb.append(", typeface=" + this.a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.b);
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.f8666d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.f8666d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }
    }
}
