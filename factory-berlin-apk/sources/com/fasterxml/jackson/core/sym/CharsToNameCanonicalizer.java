package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

public final class CharsToNameCanonicalizer {
    /* access modifiers changed from: private */
    public Bucket[] _buckets;
    private boolean _canonicalize;
    private final int _flags;
    private boolean _hashShared;
    private int _indexMask;
    /* access modifiers changed from: private */
    public int _longestCollisionList;
    private BitSet _overflows;
    private final CharsToNameCanonicalizer _parent;
    private final int _seed;
    /* access modifiers changed from: private */
    public int _size;
    private int _sizeThreshold;
    /* access modifiers changed from: private */
    public String[] _symbols;
    private final AtomicReference<TableInfo> _tableInfo;

    static final class Bucket {
        public final int length;
        public final Bucket next;
        public final String symbol;

        public Bucket(String str, Bucket bucket) {
            this.symbol = str;
            this.next = bucket;
            this.length = bucket != null ? 1 + bucket.length : 1;
        }

        public String has(char[] cArr, int i2, int i3) {
            if (this.symbol.length() != i3) {
                return null;
            }
            int i4 = 0;
            while (this.symbol.charAt(i4) == cArr[i2 + i4]) {
                i4++;
                if (i4 >= i3) {
                    return this.symbol;
                }
            }
            return null;
        }
    }

    private CharsToNameCanonicalizer(int i2) {
        this._parent = null;
        this._seed = i2;
        this._canonicalize = true;
        this._flags = -1;
        this._hashShared = false;
        this._longestCollisionList = 0;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(64));
    }

    private String _addSymbol(char[] cArr, int i2, int i3, int i4, int i5) {
        if (this._hashShared) {
            copyArrays();
            this._hashShared = false;
        } else if (this._size >= this._sizeThreshold) {
            rehash();
            i5 = _hashToIndex(calcHash(cArr, i2, i3));
        }
        String str = new String(cArr, i2, i3);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this._flags)) {
            str = InternCache.instance.intern(str);
        }
        this._size++;
        String[] strArr = this._symbols;
        if (strArr[i5] == null) {
            strArr[i5] = str;
        } else {
            int i6 = i5 >> 1;
            Bucket bucket = new Bucket(str, this._buckets[i6]);
            int i7 = bucket.length;
            if (i7 > 100) {
                _handleSpillOverflow(i6, bucket);
            } else {
                this._buckets[i6] = bucket;
                this._longestCollisionList = Math.max(i7, this._longestCollisionList);
            }
        }
        return str;
    }

    private String _findSymbol2(char[] cArr, int i2, int i3, Bucket bucket) {
        while (bucket != null) {
            String has = bucket.has(cArr, i2, i3);
            if (has != null) {
                return has;
            }
            bucket = bucket.next;
        }
        return null;
    }

    private void _handleSpillOverflow(int i2, Bucket bucket) {
        BitSet bitSet = this._overflows;
        if (bitSet == null) {
            BitSet bitSet2 = new BitSet();
            this._overflows = bitSet2;
            bitSet2.set(i2);
        } else if (!bitSet.get(i2)) {
            this._overflows.set(i2);
        } else if (!JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this._flags)) {
            this._canonicalize = false;
        } else {
            reportTooManyCollisions(100);
            throw null;
        }
        this._symbols[i2 + i2] = bucket.symbol;
        this._buckets[i2] = null;
        this._size -= bucket.length;
        this._longestCollisionList = -1;
    }

    private static int _thresholdSize(int i2) {
        return i2 - (i2 >> 2);
    }

    private void copyArrays() {
        String[] strArr = this._symbols;
        this._symbols = (String[]) Arrays.copyOf(strArr, strArr.length);
        Bucket[] bucketArr = this._buckets;
        this._buckets = (Bucket[]) Arrays.copyOf(bucketArr, bucketArr.length);
    }

    public static CharsToNameCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i2 = tableInfo.size;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i2 != tableInfo2.size) {
            if (i2 > 12000) {
                tableInfo = TableInfo.createInitial(64);
            }
            this._tableInfo.compareAndSet(tableInfo2, tableInfo);
        }
    }

    private void rehash() {
        int i2 = r1 + r1;
        if (i2 > 65536) {
            this._size = 0;
            this._canonicalize = false;
            this._symbols = new String[64];
            this._buckets = new Bucket[32];
            this._indexMask = 63;
            this._hashShared = false;
            return;
        }
        Bucket[] bucketArr = this._buckets;
        this._symbols = new String[i2];
        this._buckets = new Bucket[(i2 >> 1)];
        this._indexMask = i2 - 1;
        this._sizeThreshold = _thresholdSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (String str : this._symbols) {
            if (str != null) {
                i3++;
                int _hashToIndex = _hashToIndex(calcHash(str));
                String[] strArr = this._symbols;
                if (strArr[_hashToIndex] == null) {
                    strArr[_hashToIndex] = str;
                } else {
                    int i5 = _hashToIndex >> 1;
                    Bucket bucket = new Bucket(str, this._buckets[i5]);
                    this._buckets[i5] = bucket;
                    i4 = Math.max(i4, bucket.length);
                }
            }
        }
        int i6 = r1 >> 1;
        for (int i7 = 0; i7 < i6; i7++) {
            for (Bucket bucket2 = bucketArr[i7]; bucket2 != null; bucket2 = bucket2.next) {
                i3++;
                String str2 = bucket2.symbol;
                int _hashToIndex2 = _hashToIndex(calcHash(str2));
                String[] strArr2 = this._symbols;
                if (strArr2[_hashToIndex2] == null) {
                    strArr2[_hashToIndex2] = str2;
                } else {
                    int i8 = _hashToIndex2 >> 1;
                    Bucket bucket3 = new Bucket(str2, this._buckets[i8]);
                    this._buckets[i8] = bucket3;
                    i4 = Math.max(i4, bucket3.length);
                }
            }
        }
        this._longestCollisionList = i4;
        this._overflows = null;
        if (i3 != this._size) {
            throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this._size), Integer.valueOf(i3)}));
        }
    }

    public int _hashToIndex(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return (i4 + (i4 >>> 3)) & this._indexMask;
    }

    public int calcHash(char[] cArr, int i2, int i3) {
        int i4 = this._seed;
        int i5 = i3 + i2;
        while (i2 < i5) {
            i4 = (i4 * 33) + cArr[i2];
            i2++;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public String findSymbol(char[] cArr, int i2, int i3, int i4) {
        if (i3 < 1) {
            return "";
        }
        if (!this._canonicalize) {
            return new String(cArr, i2, i3);
        }
        int _hashToIndex = _hashToIndex(i4);
        String str = this._symbols[_hashToIndex];
        if (str != null) {
            if (str.length() == i3) {
                int i5 = 0;
                while (str.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str;
                    }
                }
            }
            Bucket bucket = this._buckets[_hashToIndex >> 1];
            if (bucket != null) {
                String has = bucket.has(cArr, i2, i3);
                if (has != null) {
                    return has;
                }
                String _findSymbol2 = _findSymbol2(cArr, i2, i3, bucket.next);
                if (_findSymbol2 != null) {
                    return _findSymbol2;
                }
            }
        }
        return _addSymbol(cArr, i2, i3, i4, _hashToIndex);
    }

    public int hashSeed() {
        return this._seed;
    }

    public CharsToNameCanonicalizer makeChild(int i2) {
        return new CharsToNameCanonicalizer(this, i2, this._seed, this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public void release() {
        CharsToNameCanonicalizer charsToNameCanonicalizer;
        if (maybeDirty() && (charsToNameCanonicalizer = this._parent) != null && this._canonicalize) {
            charsToNameCanonicalizer.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    /* access modifiers changed from: protected */
    public void reportTooManyCollisions(int i2) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this._size + ") now exceeds maximum, " + i2 + " -- suspect a DoS attack based on hash collisions");
    }

    protected static CharsToNameCanonicalizer createRoot(int i2) {
        return new CharsToNameCanonicalizer(i2);
    }

    public int calcHash(String str) {
        int length = str.length();
        int i2 = this._seed;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 33) + str.charAt(i3);
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    private static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i2, int i3, String[] strArr, Bucket[] bucketArr) {
            this.size = i2;
            this.longestCollisionList = i3;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public static TableInfo createInitial(int i2) {
            return new TableInfo(0, 0, new String[i2], new Bucket[(i2 >> 1)]);
        }

        public TableInfo(CharsToNameCanonicalizer charsToNameCanonicalizer) {
            this.size = charsToNameCanonicalizer._size;
            this.longestCollisionList = charsToNameCanonicalizer._longestCollisionList;
            this.symbols = charsToNameCanonicalizer._symbols;
            this.buckets = charsToNameCanonicalizer._buckets;
        }
    }

    private CharsToNameCanonicalizer(CharsToNameCanonicalizer charsToNameCanonicalizer, int i2, int i3, TableInfo tableInfo) {
        this._parent = charsToNameCanonicalizer;
        this._seed = i3;
        this._tableInfo = null;
        this._flags = i2;
        this._canonicalize = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2);
        String[] strArr = tableInfo.symbols;
        this._symbols = strArr;
        this._buckets = tableInfo.buckets;
        this._size = tableInfo.size;
        this._longestCollisionList = tableInfo.longestCollisionList;
        int length = strArr.length;
        this._sizeThreshold = _thresholdSize(length);
        this._indexMask = length - 1;
        this._hashShared = true;
    }
}
