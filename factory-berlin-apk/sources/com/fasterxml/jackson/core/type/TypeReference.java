package com.fasterxml.jackson.core.type;

import java.lang.reflect.Type;

public abstract class TypeReference<T> implements Comparable<TypeReference<T>> {
    public abstract Type getType();
}
