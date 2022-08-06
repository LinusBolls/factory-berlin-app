package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;

public class DataFormatReaders {
    public abstract DataFormatReaders with(DeserializationConfig deserializationConfig);

    public abstract DataFormatReaders withType(JavaType javaType);
}
