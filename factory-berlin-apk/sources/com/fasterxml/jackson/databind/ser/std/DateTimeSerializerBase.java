package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    protected DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        AtomicReference<DateFormat> atomicReference;
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference<>();
        }
        this._reusedCustomFormat = atomicReference;
    }

    /* access modifiers changed from: protected */
    public void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, boolean z) {
        if (z) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(jsonFormatVisitorWrapper, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    /* access modifiers changed from: protected */
    public boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (serializerProvider != null) {
            return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    /* access modifiers changed from: protected */
    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._customFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet((Object) null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.writeString(andSet.format(date));
        this._reusedCustomFormat.compareAndSet((Object) null, andSet);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        _acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType, _asTimestamp(jsonFormatVisitorWrapper.getProvider()));
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        SimpleDateFormat simpleDateFormat;
        Locale locale;
        TimeZone timeZone;
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides == null) {
            return this;
        }
        JsonFormat.Shape shape = findFormatOverrides.getShape();
        if (shape.isNumeric()) {
            return withFormat(Boolean.TRUE, (DateFormat) null);
        }
        if (findFormatOverrides.hasPattern()) {
            if (findFormatOverrides.hasLocale()) {
                locale = findFormatOverrides.getLocale();
            } else {
                locale = serializerProvider.getLocale();
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(findFormatOverrides.getPattern(), locale);
            if (findFormatOverrides.hasTimeZone()) {
                timeZone = findFormatOverrides.getTimeZone();
            } else {
                timeZone = serializerProvider.getTimeZone();
            }
            simpleDateFormat2.setTimeZone(timeZone);
            return withFormat(Boolean.FALSE, simpleDateFormat2);
        }
        boolean hasLocale = findFormatOverrides.hasLocale();
        boolean hasTimeZone = findFormatOverrides.hasTimeZone();
        boolean z = true;
        boolean z2 = shape == JsonFormat.Shape.STRING;
        if (!hasLocale && !hasTimeZone && !z2) {
            return this;
        }
        DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormat = (StdDateFormat) dateFormat;
            if (findFormatOverrides.hasLocale()) {
                stdDateFormat = stdDateFormat.withLocale(findFormatOverrides.getLocale());
            }
            if (findFormatOverrides.hasTimeZone()) {
                stdDateFormat = stdDateFormat.withTimeZone(findFormatOverrides.getTimeZone());
            }
            return withFormat(Boolean.FALSE, stdDateFormat);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            serializerProvider.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", new Object[]{dateFormat.getClass().getName()}));
        }
        SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) dateFormat;
        if (hasLocale) {
            simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), findFormatOverrides.getLocale());
        } else {
            simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
        }
        TimeZone timeZone2 = findFormatOverrides.getTimeZone();
        if (timeZone2 == null || timeZone2.equals(simpleDateFormat.getTimeZone())) {
            z = false;
        }
        if (z) {
            simpleDateFormat.setTimeZone(timeZone2);
        }
        return withFormat(Boolean.FALSE, simpleDateFormat);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(_asTimestamp(serializerProvider) ? "number" : "string", true);
    }

    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return false;
    }

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);
}
