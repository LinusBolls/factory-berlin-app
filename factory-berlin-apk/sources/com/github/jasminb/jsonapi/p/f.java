package com.github.jasminb.jsonapi.p;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: RelationshipMeta */
public @interface f {
    String value();
}
