package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: MessageLiteToString */
final class s0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() == 0.0f) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals("");
        } else {
            if (obj instanceof i) {
                return obj.equals(i.f3733h);
            }
            if (obj instanceof q0) {
                if (obj == ((q0) obj).d()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    static final void c(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                c(sb, i2, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                c(sb, i2, str, c2);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(l1.c((String) obj));
                sb.append('\"');
            } else if (obj instanceof i) {
                sb.append(": \"");
                sb.append(l1.a((i) obj));
                sb.append('\"');
            } else if (obj instanceof y) {
                sb.append(" {");
                d((y) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                c(sb, i5, "key", entry.getKey());
                c(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    private static void d(q0 q0Var, StringBuilder sb, int i2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : q0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i2, a(str2), y.y(method2, q0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i2, a(str3), y.y(method3, q0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object y = y.y(method4, q0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) y.y(method5, q0Var, new Object[0])).booleanValue();
                    } else if (b(y)) {
                        z = false;
                    }
                    if (z) {
                        c(sb, i2, a(str4), y);
                    }
                }
            }
        }
        if (q0Var instanceof y.c) {
            Iterator<Map.Entry<y.d, Object>> r = ((y.c) q0Var).extensions.r();
            while (r.hasNext()) {
                Map.Entry next = r.next();
                c(sb, i2, "[" + ((y.d) next.getKey()).m() + "]", next.getValue());
            }
        }
        n1 n1Var = ((y) q0Var).unknownFields;
        if (n1Var != null) {
            n1Var.m(sb, i2);
        }
    }

    static String e(q0 q0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(q0Var, sb, 0);
        return sb.toString();
    }
}
