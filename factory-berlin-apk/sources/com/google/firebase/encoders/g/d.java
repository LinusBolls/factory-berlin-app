package com.google.firebase.encoders.g;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
public final class d implements com.google.firebase.encoders.f.b<d> {

    /* renamed from: e  reason: collision with root package name */
    private static final com.google.firebase.encoders.b<Object> f4154e = a.b();

    /* renamed from: f  reason: collision with root package name */
    private static final com.google.firebase.encoders.d<String> f4155f = b.b();

    /* renamed from: g  reason: collision with root package name */
    private static final com.google.firebase.encoders.d<Boolean> f4156g = c.b();

    /* renamed from: h  reason: collision with root package name */
    private static final b f4157h = new b((a) null);
    /* access modifiers changed from: private */
    public final Map<Class<?>, com.google.firebase.encoders.b<?>> a = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, com.google.firebase.encoders.d<?>> b = new HashMap();
    /* access modifiers changed from: private */
    public com.google.firebase.encoders.b<Object> c = f4154e;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f4158d = false;

    /* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
    class a implements com.google.firebase.encoders.a {
        a() {
        }

        public String a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        public void b(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.a, d.this.b, d.this.c, d.this.f4158d);
            eVar.i(obj, false);
            eVar.r();
        }
    }

    /* compiled from: com.google.firebase:firebase-encoders-json@@16.1.0 */
    private static final class b implements com.google.firebase.encoders.d<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* renamed from: b */
        public void a(Date date, e eVar) {
            eVar.d(a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f4155f);
        m(Boolean.class, f4156g);
        m(Date.class, f4157h);
    }

    static /* synthetic */ void i(Object obj, c cVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public /* bridge */ /* synthetic */ com.google.firebase.encoders.f.b a(Class cls, com.google.firebase.encoders.b bVar) {
        l(cls, bVar);
        return this;
    }

    public com.google.firebase.encoders.a f() {
        return new a();
    }

    public d g(com.google.firebase.encoders.f.a aVar) {
        aVar.a(this);
        return this;
    }

    public d h(boolean z) {
        this.f4158d = z;
        return this;
    }

    public <T> d l(Class<T> cls, com.google.firebase.encoders.b<? super T> bVar) {
        this.a.put(cls, bVar);
        this.b.remove(cls);
        return this;
    }

    public <T> d m(Class<T> cls, com.google.firebase.encoders.d<? super T> dVar) {
        this.b.put(cls, dVar);
        this.a.remove(cls);
        return this;
    }
}
