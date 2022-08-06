package de.baimos.core.util.filter;

public class a {
    private static ThreadLocal a = new ThreadLocal();

    public static void a() {
        a.set((Object) null);
    }

    public static void a(ConnectionParameters connectionParameters) {
        a.set(connectionParameters);
    }
}
