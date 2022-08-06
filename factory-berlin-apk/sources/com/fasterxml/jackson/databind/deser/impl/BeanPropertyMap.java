package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        this._caseInsensitive = z;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this._aliasDefs = map;
        this._aliasMapping = _buildAliasMapping(map);
        init(collection);
    }

    private Map<String, String> _buildAliasMapping(Map<String, List<PropertyName>> map) {
        if (map == null || map.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            for (PropertyName simpleName : (List) next.getValue()) {
                String simpleName2 = simpleName.getSimpleName();
                if (this._caseInsensitive) {
                    simpleName2 = simpleName2.toLowerCase();
                }
                hashMap.put(simpleName2, str);
            }
        }
        return hashMap;
    }

    private final SettableBeanProperty _find2(String str, int i2, Object obj) {
        if (obj == null) {
            return _findWithAlias(this._aliasMapping.get(str));
        }
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i4 + 1];
        }
        if (obj2 != null) {
            int i5 = (i3 + (i3 >> 1)) << 1;
            int i6 = this._spillCount + i5;
            while (i5 < i6) {
                Object obj3 = this._hashArea[i5];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i5 + 1];
                }
                i5 += 2;
            }
        }
        return _findWithAlias(this._aliasMapping.get(str));
    }

    private SettableBeanProperty _find2ViaAlias(String str, int i2, Object obj) {
        int i3 = this._hashMask + 1;
        int i4 = ((i2 >> 1) + i3) << 1;
        Object obj2 = this._hashArea[i4];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i4 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i5 = (i3 + (i3 >> 1)) << 1;
        int i6 = this._spillCount + i5;
        while (i5 < i6) {
            Object obj3 = this._hashArea[i5];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i5 + 1];
            }
            i5 += 2;
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this._propsInOrder[i2] == settableBeanProperty) {
                return i2;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private SettableBeanProperty _findWithAlias(String str) {
        if (str == null) {
            return null;
        }
        int _hashCode = _hashCode(str);
        int i2 = _hashCode << 1;
        Object obj = this._hashArea[i2];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i2 + 1];
        }
        if (obj == null) {
            return null;
        }
        return _find2ViaAlias(str, _hashCode, obj);
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    private List<SettableBeanProperty> _properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z, collection, map);
    }

    private static final int findSize(int i2) {
        if (i2 <= 5) {
            return 8;
        }
        if (i2 <= 12) {
            return 16;
        }
        int i3 = 32;
        while (i3 < i2 + (i2 >> 2)) {
            i3 += i3;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r3 = r0.unwrappingDeserializer(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty _rename(com.fasterxml.jackson.databind.deser.SettableBeanProperty r2, com.fasterxml.jackson.databind.util.NameTransformer r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0003
            return r2
        L_0x0003:
            java.lang.String r0 = r2.getName()
            java.lang.String r0 = r3.transform(r0)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r2.withSimpleName(r0)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.getValueDeserializer()
            if (r0 == 0) goto L_0x001f
            com.fasterxml.jackson.databind.JsonDeserializer r3 = r0.unwrappingDeserializer(r3)
            if (r3 == r0) goto L_0x001f
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r2.withValueDeserializer(r3)
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap._rename(com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.util.NameTransformer):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i2 = 0;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i2);
                i2++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            int hashCode = str.hashCode() & this._hashMask;
            int i2 = hashCode << 1;
            Object obj = this._hashArea[i2];
            if (obj == str || str.equals(obj)) {
                return (SettableBeanProperty) this._hashArea[i2 + 1];
            }
            return _find2(str, hashCode, obj);
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    /* access modifiers changed from: protected */
    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z ? name.toLowerCase() : name;
    }

    public boolean hasAliases() {
        return !this._aliasDefs.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int findSize = findSize(size);
        this._hashMask = findSize - 1;
        int i2 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[(i2 * 2)];
        int i3 = 0;
        for (SettableBeanProperty next : collection) {
            if (next != null) {
                String propertyName = getPropertyName(next);
                int _hashCode = _hashCode(propertyName);
                int i4 = _hashCode << 1;
                if (objArr[i4] != null) {
                    i4 = ((_hashCode >> 1) + findSize) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = propertyName;
                objArr[i4 + 1] = next;
            }
        }
        this._hashArea = objArr;
        this._spillCount = i3;
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    public Iterator<SettableBeanProperty> iterator() {
        return _properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i2];
            if (settableBeanProperty2 != null) {
                if (z || !(z = propertyName.equals(objArr[i2 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (z) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (SettableBeanProperty settableBeanProperty : this._propsInOrder) {
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i2 = 1; i2 <= length; i2 += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i2] == settableBeanProperty) {
                objArr[i2] = settableBeanProperty2;
                this._propsInOrder[_findFromOrdered(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(next.getName());
            sb.append('(');
            sb.append(next.getType());
            sb.append(')');
            i2 = i3;
        }
        sb.append(']');
        if (!this._aliasDefs.isEmpty()) {
            sb.append("(aliases: ");
            sb.append(this._aliasDefs);
            sb.append(")");
        }
        return sb.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z) {
        if (this._caseInsensitive == z) {
            return this;
        }
        return new BeanPropertyMap(this, z);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i2];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i2, _findFromOrdered(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, _hashCode(propertyName));
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList(r0);
        for (SettableBeanProperty settableBeanProperty : this._propsInOrder) {
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs);
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i2, int i3) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i2] = settableBeanProperty;
        settableBeanPropertyArr2[i3] = settableBeanProperty;
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i2) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i3 = this._hashMask + 1;
        int i4 = i2 << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i4] != null) {
            i4 = ((i2 >> 1) + i3) << 1;
            if (objArr2[i4] != null) {
                int i5 = this._spillCount;
                i4 = ((i3 + (i3 >> 1)) << 1) + i5;
                this._spillCount = i5 + 2;
                if (i4 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i4] = str;
        objArr3[i4 + 1] = settableBeanProperty;
    }

    protected BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this._caseInsensitive = z;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
