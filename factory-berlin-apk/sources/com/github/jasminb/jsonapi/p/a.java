package com.github.jasminb.jsonapi.p;

import com.github.jasminb.jsonapi.StringIdHandler;
import com.github.jasminb.jsonapi.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Id */
public @interface a {
    Class<? extends l> value() default StringIdHandler.class;
}
