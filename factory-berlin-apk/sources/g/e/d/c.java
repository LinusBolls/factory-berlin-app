package g.e.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.k;

/* compiled from: BaseRecyclerViewHolder.kt */
public abstract class c extends RecyclerView.d0 {
    public static final a t = new a((DefaultConstructorMarker) null);

    /* compiled from: BaseRecyclerViewHolder.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final View b(int i2, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
            k.d(inflate, "LayoutInflater.from(view…outRes, viewGroup, false)");
            return inflate;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(int i2, ViewGroup viewGroup) {
        super(t.b(i2, viewGroup));
        k.e(viewGroup, "viewGroup");
    }
}
