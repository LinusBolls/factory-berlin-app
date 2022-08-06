package retrofit2;

import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl */
final class u implements t {
    private static final t a = new u();

    u() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (v.m(annotationArr, t.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return t.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof t;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + t.class.getName() + "()";
    }
}
