package g.d.a.a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class c {
    private static final char[] c = "0123456789abcdef".toCharArray();
    private byte[] a;
    private b[] b;

    public c(String str) {
        if (str != null && str.length() == 36) {
            String lowerCase = str.toLowerCase();
            String[] split = lowerCase.split("-");
            if (split.length == 5) {
                String str2 = split[1];
                String str3 = split[2];
                String str4 = str2 + str3;
                if (str2.length() == 4 && str3.length() == 4) {
                    byte[] d2 = a.d(str2);
                    byte[] d3 = a.d(str3);
                    byte[] d4 = a.d(str4);
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        byte[] copyOfRange = Arrays.copyOfRange(instance.digest(instance.digest(instance.digest(instance.digest(d2)))), 0, 4);
                        byte[] copyOfRange2 = Arrays.copyOfRange(instance.digest(instance.digest(instance.digest(instance.digest(Arrays.copyOfRange(instance.digest(instance.digest(instance.digest(instance.digest(d3)))), 0, 8))))), 0, 2);
                        byte[] copyOfRange3 = Arrays.copyOfRange(instance.digest(instance.digest(Arrays.copyOfRange(instance.digest(instance.digest(Arrays.copyOfRange(instance.digest(instance.digest(Arrays.copyOfRange(instance.digest(instance.digest(d4)), 0, 12))), 0, 10))), 0, 6))), 0, 6);
                        String str5 = a(copyOfRange) + "-" + str2 + "-" + str3 + "-" + a(copyOfRange2) + "-" + a(copyOfRange3);
                        if (str5.equals(lowerCase)) {
                            this.a = d4;
                            if (str5.equals("e190425c-5241-4e44-6610-53bf48fbc75a")) {
                                b[] bVarArr = new b[2];
                                this.b = bVarArr;
                                bVarArr[0] = b.API_FUNCTION_BASICBYAPPKEY;
                                bVarArr[1] = b.API_FUNCTION_NOTIFICATIONS;
                                return;
                            }
                            b[] bVarArr2 = new b[1];
                            this.b = bVarArr2;
                            bVarArr2[0] = b.API_FUNCTION_BASICBYAPPKEY;
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = c;
            cArr[i3] = cArr2[b2 >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] b() {
        return this.a;
    }
}
