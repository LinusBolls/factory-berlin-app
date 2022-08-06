package com.sensorberg.smartspaces.sdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sensorberg.smartspaces.sdk.internal.Connector;
import g.e.n.c.d.b;
import g.e.n.c.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e0.c.l;
import kotlin.e0.c.q;
import kotlin.i;
import kotlin.jvm.internal.k;
import kotlin.x;

@i(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001:\u0002mnB\u0001\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u001a\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bk\u0010lJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0004J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0004J¨\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00142\b\b\u0002\u0010$\u001a\u00020\u00172\b\b\u0002\u0010%\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b.\u0010/JG\u00106\u001a\u0002022$\u00103\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0004\u0012\u000202002\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020204¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000201HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u001a2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u0004\u0018\u00010\u000e2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u000201HÖ\u0001¢\u0006\u0004\bD\u00109J\u001f\u0010F\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>2\u0006\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010H\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>2\u0006\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bH\u0010GJ\r\u0010I\u001a\u00020\u001a¢\u0006\u0004\bI\u0010\u001cJ\u000f\u0010J\u001a\u00020\u0002H\u0016¢\u0006\u0004\bJ\u0010\u0004J\u0019\u0010N\u001a\u0004\u0018\u00010\u00002\u0006\u0010K\u001a\u00020>H\u0000¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u0004\u0018\u00010\u00002\f\u0010K\u001a\b\u0012\u0004\u0012\u00020>0\rH\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001a\u0004\u0018\u00010\u00002\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\bP\u0010MJ\u001f\u0010Q\u001a\u0004\u0018\u00010\u00002\f\u0010K\u001a\b\u0012\u0004\u0012\u00020>0\rH\u0001¢\u0006\u0004\bP\u0010OJ \u0010U\u001a\u0002022\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u000201HÖ\u0001¢\u0006\u0004\bU\u0010VR\u001c\u0010,\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010W\u001a\u0004\bX\u0010\u0004R\u0019\u0010'\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010W\u001a\u0004\bY\u0010\u0004R\u001c\u0010+\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010W\u001a\u0004\bZ\u0010\u0004R\u001b\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010W\u001a\u0004\b[\u0010\u0004R\u0019\u0010%\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\\\u001a\u0004\b]\u0010\u001cR\u001b\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010^\u001a\u0004\b_\u0010\bR\u001b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010W\u001a\u0004\b`\u0010\u0004R\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010a\u001a\u0004\bb\u0010\u0010R\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010W\u001a\u0004\bc\u0010\u0004R\u0019\u0010!\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010W\u001a\u0004\bd\u0010\u0004R\u0019\u0010$\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010e\u001a\u0004\bf\u0010\u0019R\u0019\u0010 \u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010W\u001a\u0004\bg\u0010\u0004R\u0019\u0010#\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010h\u001a\u0004\bi\u0010\u0016R\u0019\u0010&\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010W\u001a\u0004\bj\u0010\u0004¨\u0006o"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "Lcom/sensorberg/smartspaces/sdk/model/Openable;", "", "component1", "()Ljava/lang/String;", "component10", "Lcom/sensorberg/smartspaces/domain/booking/BookableParams;", "component11", "()Lcom/sensorberg/smartspaces/domain/booking/BookableParams;", "component12$sdk_release", "component12", "component13$sdk_release", "component13", "", "Lcom/sensorberg/smartspaces/sdk/internal/Connector;", "component14$sdk_release", "()Ljava/util/List;", "component14", "component2", "component3", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;", "component4", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "component5", "()Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "", "component6", "()Z", "component7", "component8", "component9", "id", "grouping", "displayName", "type", "hardwareType", "bookable", "unitId", "actuatorId", "backendUnitType", "clusterId", "bookableParams", "actuatorType", "action", "connections", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/domain/booking/BookableParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "Lkotlin/Function3;", "", "", "callback", "Lkotlin/Function1;", "onFail", "debugGetBlueIdDetails", "(Lkotlin/Function3;Lkotlin/Function1;)V", "describeContents", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sensorberg/smartspaces/domain/bluetooth/BleScan;", "bleScan", "findConnector", "(Lcom/sensorberg/smartspaces/domain/bluetooth/BleScan;)Lcom/sensorberg/smartspaces/sdk/internal/Connector;", "hasConnector", "(Lcom/sensorberg/smartspaces/domain/bluetooth/BleScan;)Z", "hashCode", "connector", "isFromBlueId", "(Lcom/sensorberg/smartspaces/domain/bluetooth/BleScan;Lcom/sensorberg/smartspaces/sdk/internal/Connector;)Z", "isFromGateway", "isNearby", "toString", "bleScans", "updateConnections$sdk_release", "(Lcom/sensorberg/smartspaces/domain/bluetooth/BleScan;)Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "updateConnections", "(Ljava/util/List;)Lcom/sensorberg/smartspaces/sdk/model/IotUnit;", "withBleScan$sdk_release", "withBleScan", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAction$sdk_release", "getActuatorId", "getActuatorType$sdk_release", "getBackendUnitType", "Z", "getBookable", "Lcom/sensorberg/smartspaces/domain/booking/BookableParams;", "getBookableParams", "getClusterId", "Ljava/util/List;", "getConnections$sdk_release", "getDisplayName", "getGrouping", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "getHardwareType", "getId", "Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;", "getType", "getUnitId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sensorberg/smartspaces/domain/booking/BookableParams;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "HardwareType", "Type", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: IotUnit.kt */
public final class IotUnit implements Openable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private final String action;
    private final String actuatorId;
    private final String actuatorType;
    private final String backendUnitType;
    private final boolean bookable;
    private final a bookableParams;
    private final String clusterId;
    private final List<Connector> connections;
    private final String displayName;
    private final String grouping;
    private final HardwareType hardwareType;
    private final String id;
    private final Type type;
    private final String unitId;

    @i(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0}, pn = "", xi = 0, xs = "")
    public static class Creator implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            k.e(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            HardwareType hardwareType = (HardwareType) Enum.valueOf(HardwareType.class, parcel.readString());
            boolean z = parcel.readInt() != 0;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            a aVar = (a) parcel2.readParcelable(IotUnit.class.getClassLoader());
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            int readInt = parcel.readInt();
            String str = readString9;
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Connector) parcel2.readParcelable(IotUnit.class.getClassLoader()));
                readInt--;
                readString8 = readString8;
            }
            String str2 = readString8;
            return new IotUnit(readString, readString2, readString3, type, hardwareType, z, readString4, readString5, readString6, readString7, aVar, readString8, str, arrayList);
        }

        public final Object[] newArray(int i2) {
            return new IotUnit[i2];
        }
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/IotUnit$HardwareType;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "SB_GATEWAY", "BLUE_ID", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotUnit.kt */
    public enum HardwareType {
        SB_GATEWAY,
        BLUE_ID
    }

    @i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/model/IotUnit$Type;", "Ljava/lang/Enum;", "<init>", "(Ljava/lang/String;I)V", "DOOR", "LOCKER_BOX", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
    /* compiled from: IotUnit.kt */
    public enum Type {
        DOOR,
        LOCKER_BOX
    }

    public IotUnit(String str, String str2, String str3, Type type2, HardwareType hardwareType2, boolean z, String str4, String str5, String str6, String str7, a aVar, String str8, String str9, List<? extends Connector> list) {
        k.e(str, "id");
        k.e(str2, "grouping");
        k.e(str3, "displayName");
        k.e(type2, "type");
        k.e(hardwareType2, "hardwareType");
        k.e(str4, "unitId");
        k.e(str5, "actuatorId");
        k.e(str8, "actuatorType");
        k.e(str9, "action");
        k.e(list, "connections");
        this.id = str;
        this.grouping = str2;
        this.displayName = str3;
        this.type = type2;
        this.hardwareType = hardwareType2;
        this.bookable = z;
        this.unitId = str4;
        this.actuatorId = str5;
        this.backendUnitType = str6;
        this.clusterId = str7;
        this.bookableParams = aVar;
        this.actuatorType = str8;
        this.action = str9;
        this.connections = list;
    }

    public static /* synthetic */ IotUnit copy$default(IotUnit iotUnit, String str, String str2, String str3, Type type2, HardwareType hardwareType2, boolean z, String str4, String str5, String str6, String str7, a aVar, String str8, String str9, List list, int i2, Object obj) {
        IotUnit iotUnit2 = iotUnit;
        int i3 = i2;
        return iotUnit.copy((i3 & 1) != 0 ? iotUnit2.id : str, (i3 & 2) != 0 ? iotUnit2.grouping : str2, (i3 & 4) != 0 ? iotUnit2.displayName : str3, (i3 & 8) != 0 ? iotUnit2.type : type2, (i3 & 16) != 0 ? iotUnit2.hardwareType : hardwareType2, (i3 & 32) != 0 ? iotUnit2.bookable : z, (i3 & 64) != 0 ? iotUnit2.unitId : str4, (i3 & 128) != 0 ? iotUnit2.actuatorId : str5, (i3 & 256) != 0 ? iotUnit2.backendUnitType : str6, (i3 & 512) != 0 ? iotUnit2.clusterId : str7, (i3 & 1024) != 0 ? iotUnit2.bookableParams : aVar, (i3 & 2048) != 0 ? iotUnit2.actuatorType : str8, (i3 & 4096) != 0 ? iotUnit2.action : str9, (i3 & 8192) != 0 ? iotUnit2.connections : list);
    }

    private final boolean isFromBlueId(b bVar, Connector connector) {
        return (bVar instanceof b.a) && (connector instanceof Connector.a) && k.a(((Connector.a) connector).f(), ((b.a) bVar).e());
    }

    private final boolean isFromGateway(b bVar, Connector connector) {
        return (bVar instanceof b.C0694b) && (connector instanceof Connector.c) && k.a(connector.b(), ((b.C0694b) bVar).f());
    }

    private final IotUnit updateConnections(List<? extends b> list) {
        List<T> T = v.T(this.connections);
        boolean z = false;
        for (b bVar : list) {
            Connector findConnector = findConnector(bVar);
            if (findConnector != null) {
                z = true;
                T.remove(findConnector);
                if (findConnector instanceof Connector.c) {
                    T.add(0, Connector.c.e((Connector.c) findConnector, (String) null, bVar.c(), bVar.a(), (String) null, (List) null, 25, (Object) null));
                } else if (findConnector instanceof Connector.a) {
                    T.add(0, Connector.a.e((Connector.a) findConnector, (String) null, bVar.c(), bVar.a(), (String) null, (String) null, 25, (Object) null));
                }
            }
        }
        if (!z) {
            return null;
        }
        return copy$default(this, (String) null, (String) null, (String) null, (Type) null, (HardwareType) null, false, (String) null, (String) null, (String) null, (String) null, (a) null, (String) null, (String) null, v.R(T), 8191, (Object) null);
    }

    public final IotUnit copy(String str, String str2, String str3, Type type2, HardwareType hardwareType2, boolean z, String str4, String str5, String str6, String str7, a aVar, String str8, String str9, List<? extends Connector> list) {
        String str10 = str;
        k.e(str10, "id");
        String str11 = str2;
        k.e(str11, "grouping");
        String str12 = str3;
        k.e(str12, "displayName");
        Type type3 = type2;
        k.e(type3, "type");
        HardwareType hardwareType3 = hardwareType2;
        k.e(hardwareType3, "hardwareType");
        String str13 = str4;
        k.e(str13, "unitId");
        String str14 = str5;
        k.e(str14, "actuatorId");
        String str15 = str8;
        k.e(str15, "actuatorType");
        String str16 = str9;
        k.e(str16, "action");
        List<? extends Connector> list2 = list;
        k.e(list2, "connections");
        return new IotUnit(str10, str11, str12, type3, hardwareType3, z, str13, str14, str6, str7, aVar, str15, str16, list2);
    }

    public final void debugGetBlueIdDetails(q<? super String, ? super String, ? super Integer, x> qVar, l<? super String, x> lVar) {
        k.e(qVar, "callback");
        k.e(lVar, "onFail");
        new com.sensorberg.smartspaces.sdk.internal.unit.a(this).f(qVar, lVar);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IotUnit)) {
            return false;
        }
        IotUnit iotUnit = (IotUnit) obj;
        return k.a(this.id, iotUnit.id) && k.a(this.grouping, iotUnit.grouping) && k.a(this.displayName, iotUnit.displayName) && k.a(this.type, iotUnit.type) && k.a(this.hardwareType, iotUnit.hardwareType) && this.bookable == iotUnit.bookable && k.a(this.unitId, iotUnit.unitId) && k.a(this.actuatorId, iotUnit.actuatorId) && k.a(this.backendUnitType, iotUnit.backendUnitType) && k.a(this.clusterId, iotUnit.clusterId) && k.a(this.bookableParams, iotUnit.bookableParams) && k.a(this.actuatorType, iotUnit.actuatorType) && k.a(this.action, iotUnit.action) && k.a(this.connections, iotUnit.connections);
    }

    public final Connector findConnector(b bVar) {
        T t;
        boolean z;
        k.e(bVar, "bleScan");
        Iterator<T> it = this.connections.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Connector connector = (Connector) t;
            if (isFromGateway(bVar, connector) || isFromBlueId(bVar, connector)) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (Connector) t;
    }

    public final String getAction$sdk_release() {
        return this.action;
    }

    public final String getActuatorId() {
        return this.actuatorId;
    }

    public final String getActuatorType$sdk_release() {
        return this.actuatorType;
    }

    public final String getBackendUnitType() {
        return this.backendUnitType;
    }

    public final String getClusterId() {
        return this.clusterId;
    }

    public final List<Connector> getConnections$sdk_release() {
        return this.connections;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGrouping() {
        return this.grouping;
    }

    public final HardwareType getHardwareType() {
        return this.hardwareType;
    }

    public final String getId() {
        return this.id;
    }

    public final Type getType() {
        return this.type;
    }

    public final String getUnitId() {
        return this.unitId;
    }

    public final boolean hasConnector(b bVar) {
        k.e(bVar, "bleScan");
        return findConnector(bVar) != null;
    }

    public int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.grouping;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.displayName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type2 = this.type;
        int hashCode4 = (hashCode3 + (type2 != null ? type2.hashCode() : 0)) * 31;
        HardwareType hardwareType2 = this.hardwareType;
        int hashCode5 = (hashCode4 + (hardwareType2 != null ? hardwareType2.hashCode() : 0)) * 31;
        boolean z = this.bookable;
        if (z) {
            z = true;
        }
        int i3 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str4 = this.unitId;
        int hashCode6 = (i3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.actuatorId;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.backendUnitType;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.clusterId;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        a aVar = this.bookableParams;
        int hashCode10 = (hashCode9 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str8 = this.actuatorType;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.action;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        List<Connector> list = this.connections;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode12 + i2;
    }

    public final boolean isNearby() {
        return (this.connections.isEmpty() ^ true) && this.connections.get(0).c() != null;
    }

    public String toString() {
        return "IotUnit(" + this.grouping + ',' + this.displayName + ',' + this.type + ',' + this.hardwareType + ')';
    }

    public final IotUnit updateConnections$sdk_release(b bVar) {
        k.e(bVar, "bleScans");
        return updateConnections(m.b(bVar));
    }

    public final IotUnit withBleScan$sdk_release(List<? extends b> list) {
        boolean z;
        k.e(list, "bleScans");
        List<T> T = v.T(this.connections);
        Iterator<T> it = list.iterator();
        boolean z2 = false;
        while (true) {
            T t = null;
            if (!it.hasNext()) {
                break;
            }
            b bVar = (b) it.next();
            Iterator<T> it2 = this.connections.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                Connector connector = (Connector) next;
                if (isFromGateway(bVar, connector) || isFromBlueId(bVar, connector)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            Connector connector2 = (Connector) t;
            if (connector2 != null) {
                T.remove(connector2);
                if (connector2 instanceof Connector.c) {
                    T.add(0, Connector.c.e((Connector.c) connector2, (String) null, bVar.c(), bVar.a(), (String) null, (List) null, 25, (Object) null));
                } else if (connector2 instanceof Connector.a) {
                    T.add(0, Connector.a.e((Connector.a) connector2, (String) null, bVar.c(), bVar.a(), (String) null, (String) null, 25, (Object) null));
                }
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        return copy$default(this, (String) null, (String) null, (String) null, (Type) null, (HardwareType) null, false, (String) null, (String) null, (String) null, (String) null, (a) null, (String) null, (String) null, v.R(T), 8191, (Object) null);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        k.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.grouping);
        parcel.writeString(this.displayName);
        parcel.writeString(this.type.name());
        parcel.writeString(this.hardwareType.name());
        parcel.writeInt(this.bookable ? 1 : 0);
        parcel.writeString(this.unitId);
        parcel.writeString(this.actuatorId);
        parcel.writeString(this.backendUnitType);
        parcel.writeString(this.clusterId);
        parcel.writeParcelable(this.bookableParams, i2);
        parcel.writeString(this.actuatorType);
        parcel.writeString(this.action);
        List<Connector> list = this.connections;
        parcel.writeInt(list.size());
        for (Connector writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i2);
        }
    }
}
