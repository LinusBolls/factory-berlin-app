package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class LRUMap<K, V> implements Serializable {
    protected final transient ConcurrentHashMap<K, V> _map;
    protected final transient int _maxEntries;

    public LRUMap(int i2, int i3) {
        this._map = new ConcurrentHashMap<>(i2, 0.8f, 4);
        this._maxEntries = i3;
    }

    public void clear() {
        this._map.clear();
    }

    public V get(Object obj) {
        return this._map.get(obj);
    }

    public V put(K k2, V v) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                if (this._map.size() >= this._maxEntries) {
                    clear();
                }
            }
        }
        return this._map.put(k2, v);
    }

    public V putIfAbsent(K k2, V v) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                if (this._map.size() >= this._maxEntries) {
                    clear();
                }
            }
        }
        return this._map.putIfAbsent(k2, v);
    }
}
