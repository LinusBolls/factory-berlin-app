package kotlin.e0;

/* compiled from: KotlinReflectionNotSupportedError.kt */
public class b extends Error {
    public b() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
