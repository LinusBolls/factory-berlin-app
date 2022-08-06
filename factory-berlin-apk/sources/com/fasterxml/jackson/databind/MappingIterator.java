package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MappingIterator<T> implements Iterator<T>, Closeable {
    protected final boolean _closeParser;
    protected final DeserializationContext _context;
    protected final JsonDeserializer<T> _deserializer;
    protected final JsonParser _parser;
    protected final JsonStreamContext _seqContext;
    protected int _state;
    protected final T _updatedValue;

    static {
        new MappingIterator((JavaType) null, (JsonParser) null, (DeserializationContext) null, (JsonDeserializer<?>) null, false, (Object) null);
    }

    protected MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == null) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            this._seqContext = null;
            this._state = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (!z || !jsonParser.isExpectedStartArrayToken()) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        } else {
            jsonParser.clearCurrentToken();
        }
        this._seqContext = parsingContext;
        this._state = 2;
    }

    /* access modifiers changed from: protected */
    public <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    /* access modifiers changed from: protected */
    public <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    /* access modifiers changed from: protected */
    public void _resync() {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() != this._seqContext) {
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY || nextToken == JsonToken.END_OBJECT) {
                    if (jsonParser.getParsingContext() == this._seqContext) {
                        jsonParser.clearCurrentToken();
                        return;
                    }
                } else if (nextToken == JsonToken.START_ARRAY || nextToken == JsonToken.START_OBJECT) {
                    jsonParser.skipChildren();
                } else if (nextToken == null) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    public void close() {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e2) {
            _handleMappingException(e2);
            throw null;
        } catch (IOException e3) {
            _handleIOException(e3);
            throw null;
        }
    }

    public boolean hasNextValue() {
        JsonToken nextToken;
        JsonParser jsonParser;
        int i2 = this._state;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            _resync();
        } else if (i2 != 2) {
            return true;
        }
        if (this._parser.getCurrentToken() == null && ((nextToken = this._parser.nextToken()) == null || nextToken == JsonToken.END_ARRAY)) {
            this._state = 0;
            if (this._closeParser && (jsonParser = this._parser) != null) {
                jsonParser.close();
            }
            return false;
        }
        this._state = 3;
        return true;
    }

    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e2) {
            throw new RuntimeJsonMappingException(e2.getMessage(), e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3.getMessage(), e3);
        }
    }

    public T nextValue() {
        T t;
        int i2 = this._state;
        if (i2 != 0) {
            int i3 = 2;
            i3 = 1;
            if ((i2 == i3 || i2 == i3) && !hasNextValue()) {
                _throwNoSuchElement();
                throw null;
            }
            try {
                if (this._updatedValue == null) {
                    t = this._deserializer.deserialize(this._parser, this._context);
                } else {
                    this._deserializer.deserialize(this._parser, this._context, this._updatedValue);
                    t = this._updatedValue;
                }
                return t;
            } finally {
                this._state = i3;
                this._parser.clearCurrentToken();
            }
        } else {
            _throwNoSuchElement();
            throw null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
