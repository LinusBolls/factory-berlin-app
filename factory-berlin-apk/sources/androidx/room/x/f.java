package androidx.room.x;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public class f {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<d> f1458d;

    /* compiled from: TableInfo */
    public static class a {
        public final String a;
        public final String b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1459d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1460e;

        /* renamed from: f  reason: collision with root package name */
        public final String f1461f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1462g;

        @Deprecated
        public a(String str, String str2, boolean z, int i2) {
            this(str, str2, z, i2, (String) null, 0);
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean b() {
            return this.f1460e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f1460e != aVar.f1460e) {
                    return false;
                }
            } else if (b() != aVar.b()) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.f1459d != aVar.f1459d) {
                return false;
            }
            if (this.f1462g == 1 && aVar.f1462g == 2 && (str3 = this.f1461f) != null && !str3.equals(aVar.f1461f)) {
                return false;
            }
            if (this.f1462g == 2 && aVar.f1462g == 1 && (str2 = aVar.f1461f) != null && !str2.equals(this.f1461f)) {
                return false;
            }
            int i2 = this.f1462g;
            if ((i2 == 0 || i2 != aVar.f1462g || ((str = this.f1461f) == null ? aVar.f1461f == null : str.equals(aVar.f1461f))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.f1459d ? 1231 : 1237)) * 31) + this.f1460e;
        }

        public String toString() {
            return "Column{name='" + this.a + '\'' + ", type='" + this.b + '\'' + ", affinity='" + this.c + '\'' + ", notNull=" + this.f1459d + ", primaryKeyPosition=" + this.f1460e + ", defaultValue='" + this.f1461f + '\'' + '}';
        }

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.b = str2;
            this.f1459d = z;
            this.f1460e = i2;
            this.c = a(str2);
            this.f1461f = str3;
            this.f1462g = i3;
        }
    }

    /* compiled from: TableInfo */
    public static class b {
        public final String a;
        public final String b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f1463d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f1464e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f1463d = Collections.unmodifiableList(list);
            this.f1464e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.f1463d.equals(bVar.f1463d)) {
                return this.f1464e.equals(bVar.f1464e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f1463d.hashCode()) * 31) + this.f1464e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.a + '\'' + ", onDelete='" + this.b + '\'' + ", onUpdate='" + this.c + '\'' + ", columnNames=" + this.f1463d + ", referenceColumnNames=" + this.f1464e + '}';
        }
    }

    /* compiled from: TableInfo */
    static class c implements Comparable<c> {

        /* renamed from: g  reason: collision with root package name */
        final int f1465g;

        /* renamed from: h  reason: collision with root package name */
        final int f1466h;

        /* renamed from: i  reason: collision with root package name */
        final String f1467i;

        /* renamed from: j  reason: collision with root package name */
        final String f1468j;

        c(int i2, int i3, String str, String str2) {
            this.f1465g = i2;
            this.f1466h = i3;
            this.f1467i = str;
            this.f1468j = str2;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i2 = this.f1465g - cVar.f1465g;
            return i2 == 0 ? this.f1466h - cVar.f1466h : i2;
        }
    }

    /* compiled from: TableInfo */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return dVar.a.startsWith("index_");
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int i2;
            if (this.a.startsWith("index_")) {
                i2 = -1184239155;
            } else {
                i2 = this.a.hashCode();
            }
            return (((i2 * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.a + '\'' + ", unique=" + this.b + ", columns=" + this.c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f1458d = set3;
    }

    public static f a(e.s.a.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(e.s.a.b bVar, String str) {
        Cursor x0 = bVar.x0("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (x0.getColumnCount() > 0) {
                int columnIndex = x0.getColumnIndex("name");
                int columnIndex2 = x0.getColumnIndex("type");
                int columnIndex3 = x0.getColumnIndex("notnull");
                int columnIndex4 = x0.getColumnIndex("pk");
                int columnIndex5 = x0.getColumnIndex("dflt_value");
                while (x0.moveToNext()) {
                    String string = x0.getString(columnIndex);
                    hashMap.put(string, new a(string, x0.getString(columnIndex2), x0.getInt(columnIndex3) != 0, x0.getInt(columnIndex4), x0.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            x0.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(e.s.a.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor x0 = bVar.x0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = x0.getColumnIndex("id");
            int columnIndex2 = x0.getColumnIndex("seq");
            int columnIndex3 = x0.getColumnIndex("table");
            int columnIndex4 = x0.getColumnIndex("on_delete");
            int columnIndex5 = x0.getColumnIndex("on_update");
            List<c> c2 = c(x0);
            int count = x0.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                x0.moveToPosition(i2);
                if (x0.getInt(columnIndex2) == 0) {
                    int i3 = x0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c next : c2) {
                        if (next.f1465g == i3) {
                            arrayList.add(next.f1467i);
                            arrayList2.add(next.f1468j);
                        }
                    }
                    hashSet.add(new b(x0.getString(columnIndex3), x0.getString(columnIndex4), x0.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            x0.close();
        }
    }

    private static d e(e.s.a.b bVar, String str, boolean z) {
        Cursor x0 = bVar.x0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = x0.getColumnIndex("seqno");
            int columnIndex2 = x0.getColumnIndex("cid");
            int columnIndex3 = x0.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (x0.moveToNext()) {
                        if (x0.getInt(columnIndex2) >= 0) {
                            int i2 = x0.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i2), x0.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    x0.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            x0.close();
        }
    }

    private static Set<d> f(e.s.a.b bVar, String str) {
        Cursor x0 = bVar.x0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = x0.getColumnIndex("name");
            int columnIndex2 = x0.getColumnIndex("origin");
            int columnIndex3 = x0.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (x0.moveToNext()) {
                        if ("c".equals(x0.getString(columnIndex2))) {
                            String string = x0.getString(columnIndex);
                            boolean z = true;
                            if (x0.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            d e2 = e(bVar, string, z);
                            if (e2 == null) {
                                x0.close();
                                return null;
                            }
                            hashSet.add(e2);
                        }
                    }
                    x0.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            x0.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.a;
        if (str == null ? fVar.a != null : !str.equals(fVar.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? fVar.b != null : !map.equals(fVar.b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? fVar.c != null : !set2.equals(fVar.c)) {
            return false;
        }
        Set<d> set3 = this.f1458d;
        if (set3 == null || (set = fVar.f1458d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "TableInfo{name='" + this.a + '\'' + ", columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.f1458d + '}';
    }
}
