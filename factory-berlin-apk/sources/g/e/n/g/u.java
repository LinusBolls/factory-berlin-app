package g.e.n.g;

import androidx.lifecycle.LiveData;
import com.sensorberg.smartspaces.sdk.model.IotUnit;
import java.util.List;

/* compiled from: SupportUnitController.kt */
public interface u {

    /* compiled from: SupportUnitController.kt */
    public static final class a {
        public static /* synthetic */ LiveData a(u uVar, b bVar, t tVar, IotUnit.Type type, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    type = null;
                }
                return uVar.getUnitsLiveData(bVar, tVar, type);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnitsLiveData");
        }
    }

    LiveData<g.e.m.a<List<IotUnit>, Void>> getUnitsLiveData(b bVar, t tVar, IotUnit.Type type);
}
