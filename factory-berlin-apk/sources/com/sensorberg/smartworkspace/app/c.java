package com.sensorberg.smartworkspace.app;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.sensorberg.factory.R;
import com.sensorberg.smartworkspace.app.k.b;
import com.sensorberg.smartworkspace.app.k.b0;
import com.sensorberg.smartworkspace.app.k.b1;
import com.sensorberg.smartworkspace.app.k.d0;
import com.sensorberg.smartworkspace.app.k.d1;
import com.sensorberg.smartworkspace.app.k.f0;
import com.sensorberg.smartworkspace.app.k.f1;
import com.sensorberg.smartworkspace.app.k.g;
import com.sensorberg.smartworkspace.app.k.h0;
import com.sensorberg.smartworkspace.app.k.j;
import com.sensorberg.smartworkspace.app.k.j0;
import com.sensorberg.smartworkspace.app.k.j1;
import com.sensorberg.smartworkspace.app.k.l;
import com.sensorberg.smartworkspace.app.k.l0;
import com.sensorberg.smartworkspace.app.k.l1;
import com.sensorberg.smartworkspace.app.k.n;
import com.sensorberg.smartworkspace.app.k.n0;
import com.sensorberg.smartworkspace.app.k.n1;
import com.sensorberg.smartworkspace.app.k.p;
import com.sensorberg.smartworkspace.app.k.p0;
import com.sensorberg.smartworkspace.app.k.p1;
import com.sensorberg.smartworkspace.app.k.r;
import com.sensorberg.smartworkspace.app.k.r0;
import com.sensorberg.smartworkspace.app.k.t;
import com.sensorberg.smartworkspace.app.k.t0;
import com.sensorberg.smartworkspace.app.k.v;
import com.sensorberg.smartworkspace.app.k.v0;
import com.sensorberg.smartworkspace.app.k.x;
import com.sensorberg.smartworkspace.app.k.x0;
import com.sensorberg.smartworkspace.app.k.z;
import com.sensorberg.smartworkspace.app.k.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: DataBinderMapperImpl */
public class c extends androidx.databinding.c {
    private static final SparseIntArray a;

    /* compiled from: DataBinderMapperImpl */
    private static class a {
        static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(32);
            a = hashMap;
            hashMap.put("layout/activity_login_external_0", Integer.valueOf(R.layout.activity_login_external));
            a.put("layout/activity_login_username_0", Integer.valueOf(R.layout.activity_login_username));
            a.put("layout/activity_permission_0", Integer.valueOf(R.layout.activity_permission));
            a.put("layout/alarm_item_viewholder_0", Integer.valueOf(R.layout.alarm_item_viewholder));
            a.put("layout/frag_change_password_0", Integer.valueOf(R.layout.frag_change_password));
            a.put("layout/frag_favorite_list_0", Integer.valueOf(R.layout.frag_favorite_list));
            a.put("layout/frag_info_0", Integer.valueOf(R.layout.frag_info));
            a.put("layout/frag_info_item_read_0", Integer.valueOf(R.layout.frag_info_item_read));
            a.put("layout/frag_info_item_unread_0", Integer.valueOf(R.layout.frag_info_item_unread));
            a.put("layout/frag_iotdevice_details_0", Integer.valueOf(R.layout.frag_iotdevice_details));
            a.put("layout/frag_locker_booked_0", Integer.valueOf(R.layout.frag_locker_booked));
            a.put("layout/frag_locker_booking_deleted_0", Integer.valueOf(R.layout.frag_locker_booking_deleted));
            a.put("layout/frag_locker_container_0", Integer.valueOf(R.layout.frag_locker_container));
            a.put("layout/frag_locker_create_booking_0", Integer.valueOf(R.layout.frag_locker_create_booking));
            a.put("layout/frag_locker_delete_booking_0", Integer.valueOf(R.layout.frag_locker_delete_booking));
            a.put("layout/frag_locker_error_0", Integer.valueOf(R.layout.frag_locker_error));
            a.put("layout/frag_locker_group_selection_0", Integer.valueOf(R.layout.frag_locker_group_selection));
            a.put("layout/frag_locker_loading_0", Integer.valueOf(R.layout.frag_locker_loading));
            a.put("layout/frag_locker_none_nearby_0", Integer.valueOf(R.layout.frag_locker_none_nearby));
            a.put("layout/frag_locker_opening_0", Integer.valueOf(R.layout.frag_locker_opening));
            a.put("layout/frag_locker_selection_0", Integer.valueOf(R.layout.frag_locker_selection));
            a.put("layout/frag_locker_selection_available_0", Integer.valueOf(R.layout.frag_locker_selection_available));
            a.put("layout/frag_nearby_container_0", Integer.valueOf(R.layout.frag_nearby_container));
            a.put("layout/frag_nearby_unit_0", Integer.valueOf(R.layout.frag_nearby_unit));
            a.put("layout/frag_no_locker_available_0", Integer.valueOf(R.layout.frag_no_locker_available));
            a.put("layout/frag_webview_0", Integer.valueOf(R.layout.frag_webview));
            a.put("layout/fragment_alarm_0", Integer.valueOf(R.layout.fragment_alarm));
            a.put("layout/fragment_open_door_0", Integer.valueOf(R.layout.fragment_open_door));
            a.put("layout/fragment_spaces_detail_0", Integer.valueOf(R.layout.fragment_spaces_detail));
            a.put("layout/item_favorite_header_0", Integer.valueOf(R.layout.item_favorite_header));
            a.put("layout/item_favorite_unit_0", Integer.valueOf(R.layout.item_favorite_unit));
            a.put("layout/single_activity_0", Integer.valueOf(R.layout.single_activity));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(32);
        a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_login_external, 1);
        a.put(R.layout.activity_login_username, 2);
        a.put(R.layout.activity_permission, 3);
        a.put(R.layout.alarm_item_viewholder, 4);
        a.put(R.layout.frag_change_password, 5);
        a.put(R.layout.frag_favorite_list, 6);
        a.put(R.layout.frag_info, 7);
        a.put(R.layout.frag_info_item_read, 8);
        a.put(R.layout.frag_info_item_unread, 9);
        a.put(R.layout.frag_iotdevice_details, 10);
        a.put(R.layout.frag_locker_booked, 11);
        a.put(R.layout.frag_locker_booking_deleted, 12);
        a.put(R.layout.frag_locker_container, 13);
        a.put(R.layout.frag_locker_create_booking, 14);
        a.put(R.layout.frag_locker_delete_booking, 15);
        a.put(R.layout.frag_locker_error, 16);
        a.put(R.layout.frag_locker_group_selection, 17);
        a.put(R.layout.frag_locker_loading, 18);
        a.put(R.layout.frag_locker_none_nearby, 19);
        a.put(R.layout.frag_locker_opening, 20);
        a.put(R.layout.frag_locker_selection, 21);
        a.put(R.layout.frag_locker_selection_available, 22);
        a.put(R.layout.frag_nearby_container, 23);
        a.put(R.layout.frag_nearby_unit, 24);
        a.put(R.layout.frag_no_locker_available, 25);
        a.put(R.layout.frag_webview, 26);
        a.put(R.layout.fragment_alarm, 27);
        a.put(R.layout.fragment_open_door, 28);
        a.put(R.layout.fragment_spaces_detail, 29);
        a.put(R.layout.item_favorite_header, 30);
        a.put(R.layout.item_favorite_unit, 31);
        a.put(R.layout.single_activity, 32);
    }

    public List<androidx.databinding.c> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.k.b.a());
        arrayList.add(new g.e.b.a());
        return arrayList;
    }

    public ViewDataBinding b(e eVar, View view, int i2) {
        int i3 = a.get(i2);
        if (i3 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i3) {
                case 1:
                    if ("layout/activity_login_external_0".equals(tag)) {
                        return new b(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_login_external is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_login_username_0".equals(tag)) {
                        return new com.sensorberg.smartworkspace.app.k.e(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_login_username is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_permission_0".equals(tag)) {
                        return new g(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_permission is invalid. Received: " + tag);
                case 4:
                    if ("layout/alarm_item_viewholder_0".equals(tag)) {
                        return new j(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for alarm_item_viewholder is invalid. Received: " + tag);
                case 5:
                    if ("layout/frag_change_password_0".equals(tag)) {
                        return new l(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_change_password is invalid. Received: " + tag);
                case 6:
                    if ("layout/frag_favorite_list_0".equals(tag)) {
                        return new n(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_favorite_list is invalid. Received: " + tag);
                case 7:
                    if ("layout/frag_info_0".equals(tag)) {
                        return new p(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_info is invalid. Received: " + tag);
                case 8:
                    if ("layout/frag_info_item_read_0".equals(tag)) {
                        return new r(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_info_item_read is invalid. Received: " + tag);
                case 9:
                    if ("layout/frag_info_item_unread_0".equals(tag)) {
                        return new t(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_info_item_unread is invalid. Received: " + tag);
                case 10:
                    if ("layout/frag_iotdevice_details_0".equals(tag)) {
                        return new v(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_iotdevice_details is invalid. Received: " + tag);
                case 11:
                    if ("layout/frag_locker_booked_0".equals(tag)) {
                        return new x(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_booked is invalid. Received: " + tag);
                case 12:
                    if ("layout/frag_locker_booking_deleted_0".equals(tag)) {
                        return new z(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_booking_deleted is invalid. Received: " + tag);
                case 13:
                    if ("layout/frag_locker_container_0".equals(tag)) {
                        return new b0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_container is invalid. Received: " + tag);
                case 14:
                    if ("layout/frag_locker_create_booking_0".equals(tag)) {
                        return new d0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_create_booking is invalid. Received: " + tag);
                case 15:
                    if ("layout/frag_locker_delete_booking_0".equals(tag)) {
                        return new f0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_delete_booking is invalid. Received: " + tag);
                case 16:
                    if ("layout/frag_locker_error_0".equals(tag)) {
                        return new h0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_error is invalid. Received: " + tag);
                case 17:
                    if ("layout/frag_locker_group_selection_0".equals(tag)) {
                        return new j0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_group_selection is invalid. Received: " + tag);
                case 18:
                    if ("layout/frag_locker_loading_0".equals(tag)) {
                        return new l0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_loading is invalid. Received: " + tag);
                case 19:
                    if ("layout/frag_locker_none_nearby_0".equals(tag)) {
                        return new n0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_none_nearby is invalid. Received: " + tag);
                case 20:
                    if ("layout/frag_locker_opening_0".equals(tag)) {
                        return new p0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_opening is invalid. Received: " + tag);
                case 21:
                    if ("layout/frag_locker_selection_0".equals(tag)) {
                        return new t0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_selection is invalid. Received: " + tag);
                case 22:
                    if ("layout/frag_locker_selection_available_0".equals(tag)) {
                        return new r0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_locker_selection_available is invalid. Received: " + tag);
                case 23:
                    if ("layout/frag_nearby_container_0".equals(tag)) {
                        return new v0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_nearby_container is invalid. Received: " + tag);
                case 24:
                    if ("layout/frag_nearby_unit_0".equals(tag)) {
                        return new x0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_nearby_unit is invalid. Received: " + tag);
                case 25:
                    if ("layout/frag_no_locker_available_0".equals(tag)) {
                        return new z0(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_no_locker_available is invalid. Received: " + tag);
                case 26:
                    if ("layout/frag_webview_0".equals(tag)) {
                        return new b1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for frag_webview is invalid. Received: " + tag);
                case 27:
                    if ("layout/fragment_alarm_0".equals(tag)) {
                        return new d1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_alarm is invalid. Received: " + tag);
                case 28:
                    if ("layout/fragment_open_door_0".equals(tag)) {
                        return new f1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_open_door is invalid. Received: " + tag);
                case 29:
                    if ("layout/fragment_spaces_detail_0".equals(tag)) {
                        return new j1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_spaces_detail is invalid. Received: " + tag);
                case 30:
                    if ("layout/item_favorite_header_0".equals(tag)) {
                        return new l1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for item_favorite_header is invalid. Received: " + tag);
                case 31:
                    if ("layout/item_favorite_unit_0".equals(tag)) {
                        return new n1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for item_favorite_unit is invalid. Received: " + tag);
                case 32:
                    if ("layout/single_activity_0".equals(tag)) {
                        return new p1(eVar, view);
                    }
                    throw new IllegalArgumentException("The tag for single_activity is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding c(e eVar, View[] viewArr, int i2) {
        if (viewArr == null || viewArr.length == 0 || a.get(i2) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int d(String str) {
        Integer num;
        if (str == null || (num = a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
