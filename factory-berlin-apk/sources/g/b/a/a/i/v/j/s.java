package g.b.a.a.i.v.j;

import g.b.a.a.i.v.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class s implements b0.d {
    private final h0 a;

    private s(h0 h0Var) {
        this.a = h0Var;
    }

    public static b0.d b(h0 h0Var) {
        return new s(h0Var);
    }

    public Object a() {
        return this.a.getWritableDatabase();
    }
}
