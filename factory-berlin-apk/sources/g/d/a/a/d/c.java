package g.d.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class c implements SharedPreferences {

    /* renamed from: d  reason: collision with root package name */
    private static char[] f9693d;
    private final boolean a;
    /* access modifiers changed from: private */
    public SharedPreferences b;
    private Context c;

    public class a implements SharedPreferences.Editor {
        protected SharedPreferences.Editor a;

        public a() {
            this.a = c.this.b.edit();
        }

        public a a() {
            this.a.clear();
            return this;
        }

        public void apply() {
            this.a.apply();
        }

        public a b(String str, boolean z) {
            this.a.putString(c.this.f(str), c.this.c(Boolean.toString(z)));
            return this;
        }

        public a c(String str, float f2) {
            this.a.putString(c.this.f(str), c.this.c(Float.toString(f2)));
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
            a();
            return this;
        }

        public boolean commit() {
            return this.a.commit();
        }

        public a d(String str, int i2) {
            this.a.putString(c.this.f(str), c.this.c(Integer.toString(i2)));
            return this;
        }

        public a e(String str, long j2) {
            this.a.putString(c.this.f(str), c.this.c(Long.toString(j2)));
            return this;
        }

        public a f(String str, String str2) {
            this.a.putString(c.this.f(str), c.this.c(str2));
            return this;
        }

        public a g(String str) {
            this.a.remove(c.this.f(str));
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
            b(str, z);
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f2) {
            c(str, f2);
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i2) {
            d(str, i2);
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j2) {
            e(str, j2);
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
            f(str, str2);
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.a.putStringSet(c.this.f(str), c.d(c.this, set));
            return this;
        }

        public /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
            g(str);
            return this;
        }
    }

    public c(Context context, SharedPreferences sharedPreferences, boolean z) {
        this.b = sharedPreferences;
        this.c = context;
        this.a = z;
    }

    static /* synthetic */ Set d(c cVar, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(cVar.c((String) it.next()));
        }
        return hashSet;
    }

    private static char[] e() {
        char[] cArr = f9693d;
        if (cArr != null) {
            return cArr;
        }
        throw new IllegalAccessException("Please add a key");
    }

    /* access modifiers changed from: private */
    public String f(String str) {
        return this.a ? c(str) : str;
    }

    private byte[] g() {
        String string = Settings.Secure.getString(this.c.getContentResolver(), "android_id");
        if (string == null) {
            string = "ROBOLECTRICYOUAREBAD";
        }
        return Arrays.copyOf(string.getBytes("utf-8"), 8);
    }

    private String h(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                bArr = Base64.decode(str, 0);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            bArr = new byte[0];
        }
        SecretKey generateSecret = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(new PBEKeySpec(e()));
        Cipher instance = Cipher.getInstance("PBEWithMD5AndDES");
        instance.init(2, generateSecret, new PBEParameterSpec(g(), 20));
        return new String(instance.doFinal(bArr), "utf-8");
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        byte[] bArr;
        if (str != null) {
            try {
                bArr = str.getBytes("utf-8");
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
                throw new RuntimeException(e2);
            } catch (InvalidKeySpecException e3) {
                e3.printStackTrace();
                throw new RuntimeException(e3);
            } catch (IllegalBlockSizeException e4) {
                e4.printStackTrace();
                throw new RuntimeException(e4);
            } catch (BadPaddingException e5) {
                e5.printStackTrace();
                throw new RuntimeException(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                e6.printStackTrace();
                throw new RuntimeException(e6);
            } catch (InvalidKeyException e7) {
                e7.printStackTrace();
                throw new RuntimeException(e7);
            } catch (UnsupportedEncodingException e8) {
                e8.printStackTrace();
                throw new RuntimeException(e8);
            } catch (NoSuchPaddingException e9) {
                e9.printStackTrace();
                throw new RuntimeException(e9);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                throw new RuntimeException(e10);
            }
        } else {
            bArr = new byte[0];
        }
        SecretKey generateSecret = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(new PBEKeySpec(e()));
        Cipher instance = Cipher.getInstance("PBEWithMD5AndDES");
        instance.init(1, generateSecret, new PBEParameterSpec(g(), 20));
        return new String(Base64.encode(instance.doFinal(bArr), 2), "utf-8");
    }

    public boolean contains(String str) {
        return this.b.contains(f(str));
    }

    public Map<String, String> getAll() {
        Map<String, ?> all = this.b.getAll();
        Set<String> keySet = all.keySet();
        HashMap hashMap = new HashMap(keySet.size());
        for (String next : keySet) {
            String h2 = this.a ? h(next) : next;
            Object obj = all.get(next);
            if (obj != null) {
                hashMap.put(h2, h(obj.toString()));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = this.b.getString(f(str), (String) null);
        return string != null ? Boolean.parseBoolean(h(string)) : z;
    }

    public float getFloat(String str, float f2) {
        String string = this.b.getString(f(str), (String) null);
        return string != null ? Float.parseFloat(h(string)) : f2;
    }

    public int getInt(String str, int i2) {
        String string = this.b.getString(f(str), (String) null);
        return string != null ? Integer.parseInt(h(string)) : i2;
    }

    public long getLong(String str, long j2) {
        String string = this.b.getString(f(str), (String) null);
        return string != null ? Long.parseLong(h(string)) : j2;
    }

    public String getString(String str, String str2) {
        String string = this.b.getString(f(str), (String) null);
        return string != null ? h(string) : str2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.b.getStringSet(f(str), set);
        if (stringSet != null) {
            set = new HashSet<>();
            for (String h2 : stringSet) {
                set.add(h(h2));
            }
        }
        return set;
    }

    /* renamed from: i */
    public a edit() {
        return new a();
    }

    public void j(String str) {
        f9693d = str.toCharArray();
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
