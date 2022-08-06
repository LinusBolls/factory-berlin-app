package com.google.gson;

import com.google.gson.internal.k;
import com.google.gson.stream.c;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement */
public abstract class l {
    public i a() {
        if (g()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n d() {
        if (j()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public o e() {
        if (k()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean g() {
        return this instanceof i;
    }

    public boolean i() {
        return this instanceof m;
    }

    public boolean j() {
        return this instanceof n;
    }

    public boolean k() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.b0(true);
            k.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
