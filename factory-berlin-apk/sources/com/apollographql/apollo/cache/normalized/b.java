package com.apollographql.apollo.cache.normalized;

import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.k;

/* compiled from: ApolloStoreOperation.kt */
public abstract class b<T> {
    public static final a b = new a((DefaultConstructorMarker) null);
    private final AtomicBoolean a = new AtomicBoolean();

    /* compiled from: ApolloStoreOperation.kt */
    public static final class a {

        /* renamed from: com.apollographql.apollo.cache.normalized.b$a$a  reason: collision with other inner class name */
        /* compiled from: ApolloStoreOperation.kt */
        static final class C0051a implements Executor {

            /* renamed from: g  reason: collision with root package name */
            public static final C0051a f1826g = new C0051a();

            C0051a() {
            }

            public final void execute(Runnable runnable) {
            }
        }

        /* renamed from: com.apollographql.apollo.cache.normalized.b$a$b  reason: collision with other inner class name */
        /* compiled from: ApolloStoreOperation.kt */
        public static final class C0052b extends b<T> {
            final /* synthetic */ Object c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0052b(a aVar, Object obj, Executor executor) {
                super(executor);
                this.c = obj;
            }

            /* access modifiers changed from: protected */
            public T d() {
                return this.c;
            }
        }

        private a() {
        }

        public final Executor a() {
            return C0051a.f1826g;
        }

        public final <T> b<T> b(T t) {
            return new C0052b(this, t, a());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    protected b(Executor executor) {
        k.f(executor, "dispatcher");
        new AtomicReference();
    }

    private final void a() {
        if (!this.a.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public static final <T> b<T> b(T t) {
        return b.b(t);
    }

    public final T c() {
        a();
        try {
            return d();
        } catch (Exception e2) {
            throw new ApolloException("Failed to perform store operation", e2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract T d();
}
