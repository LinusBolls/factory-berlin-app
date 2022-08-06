package com.github.jasminb.jsonapi.p;

import com.github.jasminb.jsonapi.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Relationship */
public @interface d {
    String path() default "";

    h relType() default h.SELF;

    String relatedPath() default "";

    boolean resolve() default false;

    boolean serialise() default true;

    boolean serialiseData() default true;

    String value();
}
