package com.sensorberg.smartspaces.backend.q;

import com.google.gson.annotations.b;
import java.util.Arrays;
import java.util.List;

/* compiled from: ApiError */
public class a {
    @b("error")
    @com.google.gson.annotations.a
    public String a;
    @b("error_description")
    @com.google.gson.annotations.a
    public String b;
    @b("errors")
    @com.google.gson.annotations.a
    public List<C0346a> c = null;

    /* renamed from: com.sensorberg.smartspaces.backend.q.a$a  reason: collision with other inner class name */
    /* compiled from: ApiError */
    public static class C0346a {
        @b("title")
        @com.google.gson.annotations.a
        public String a;
        @b("detail")
        @com.google.gson.annotations.a
        public String b;

        public String toString() {
            return String.format("%s - %s", new Object[]{this.a, this.b});
        }
    }

    public String toString() {
        int i2;
        String str;
        Object[] objArr = new Object[2];
        List<C0346a> list = this.c;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        objArr[0] = Integer.valueOf(i2);
        List<C0346a> list2 = this.c;
        if (list2 == null) {
            str = "-";
        } else {
            str = Arrays.toString(list2.toArray());
        }
        objArr[1] = str;
        return String.format("%s errors[%s]", objArr);
    }
}
