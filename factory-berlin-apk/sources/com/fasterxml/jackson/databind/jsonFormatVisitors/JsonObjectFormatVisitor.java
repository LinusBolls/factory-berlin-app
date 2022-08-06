package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;

public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {
    void optionalProperty(BeanProperty beanProperty);

    void property(BeanProperty beanProperty);
}
