package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e.h.j.h;

/* compiled from: AppCompatTextClassifierHelper */
final class x {
    private TextView a;
    private TextClassifier b;

    x(TextView textView) {
        h.c(textView);
        this.a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.b = textClassifier;
    }
}
