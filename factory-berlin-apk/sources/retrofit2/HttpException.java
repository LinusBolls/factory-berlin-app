package retrofit2;

public class HttpException extends RuntimeException {
    public HttpException(q<?> qVar) {
        super(a(qVar));
        qVar.b();
        qVar.f();
    }

    private static String a(q<?> qVar) {
        v.b(qVar, "response == null");
        return "HTTP " + qVar.b() + " " + qVar.f();
    }
}
