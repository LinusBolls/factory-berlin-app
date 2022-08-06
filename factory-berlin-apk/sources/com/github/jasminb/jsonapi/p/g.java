package com.github.jasminb.jsonapi.p;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Type */
public @interface g {
    String path() default "";

    String value();
}
