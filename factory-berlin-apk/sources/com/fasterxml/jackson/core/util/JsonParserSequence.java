package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

public class JsonParserSequence extends JsonParserDelegate {
    protected final boolean _checkForExistingToken;
    protected boolean _hasToken;
    protected int _nextParserIndex;
    protected final JsonParser[] _parsers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected JsonParserSequence(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this._checkForExistingToken = z;
        if (z && this.delegate.hasCurrentToken()) {
            z2 = true;
        }
        this._hasToken = z2;
        this._parsers = jsonParserArr;
        this._nextParserIndex = 1;
    }

    public static JsonParserSequence createFlattened(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof JsonParserSequence;
        if (z2 || (jsonParser2 instanceof JsonParserSequence)) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
            if (jsonParser2 instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser2).addFlattenedActiveParsers(arrayList);
            } else {
                arrayList.add(jsonParser2);
            }
            return new JsonParserSequence(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
        }
        return new JsonParserSequence(z, new JsonParser[]{jsonParser, jsonParser2});
    }

    /* access modifiers changed from: protected */
    public void addFlattenedActiveParsers(List<JsonParser> list) {
        int length = this._parsers.length;
        for (int i2 = this._nextParserIndex - 1; i2 < length; i2++) {
            JsonParser jsonParser = this._parsers[i2];
            if (jsonParser instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    public void close() {
        do {
            this.delegate.close();
        } while (switchToNext());
    }

    public JsonToken nextToken() {
        JsonParser jsonParser = this.delegate;
        if (jsonParser == null) {
            return null;
        }
        if (this._hasToken) {
            this._hasToken = false;
            return jsonParser.currentToken();
        }
        JsonToken nextToken = jsonParser.nextToken();
        return nextToken == null ? switchAndReturnNext() : nextToken;
    }

    public JsonParser skipChildren() {
        if (this.delegate.currentToken() != JsonToken.START_OBJECT && this.delegate.currentToken() != JsonToken.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                return this;
            }
            if (nextToken.isStructStart()) {
                i2++;
            } else if (nextToken.isStructEnd() && i2 - 1 == 0) {
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken switchAndReturnNext() {
        JsonToken nextToken;
        do {
            int i2 = this._nextParserIndex;
            JsonParser[] jsonParserArr = this._parsers;
            if (i2 >= jsonParserArr.length) {
                return null;
            }
            this._nextParserIndex = i2 + 1;
            JsonParser jsonParser = jsonParserArr[i2];
            this.delegate = jsonParser;
            if (this._checkForExistingToken && jsonParser.hasCurrentToken()) {
                return this.delegate.getCurrentToken();
            }
            nextToken = this.delegate.nextToken();
        } while (nextToken == null);
        return nextToken;
    }

    /* access modifiers changed from: protected */
    public boolean switchToNext() {
        int i2 = this._nextParserIndex;
        JsonParser[] jsonParserArr = this._parsers;
        if (i2 >= jsonParserArr.length) {
            return false;
        }
        this._nextParserIndex = i2 + 1;
        this.delegate = jsonParserArr[i2];
        return true;
    }
}
