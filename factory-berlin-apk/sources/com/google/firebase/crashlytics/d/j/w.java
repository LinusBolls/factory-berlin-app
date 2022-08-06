package com.google.firebase.crashlytics.d.j;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList */
public final class w<E> implements List<E>, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    private final List<E> f4074g;

    private w(List<E> list) {
        this.f4074g = Collections.unmodifiableList(list);
    }

    public static <E> w<E> a(List<E> list) {
        return new w<>(list);
    }

    public static <E> w<E> d(E... eArr) {
        return new w<>(Arrays.asList(eArr));
    }

    public boolean add(E e2) {
        return this.f4074g.add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.f4074g.addAll(collection);
    }

    public void clear() {
        this.f4074g.clear();
    }

    public boolean contains(Object obj) {
        return this.f4074g.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f4074g.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.f4074g.equals(obj);
    }

    public E get(int i2) {
        return this.f4074g.get(i2);
    }

    public int hashCode() {
        return this.f4074g.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f4074g.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f4074g.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f4074g.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f4074g.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.f4074g.listIterator();
    }

    public boolean remove(Object obj) {
        return this.f4074g.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f4074g.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f4074g.retainAll(collection);
    }

    public E set(int i2, E e2) {
        return this.f4074g.set(i2, e2);
    }

    public int size() {
        return this.f4074g.size();
    }

    public List<E> subList(int i2, int i3) {
        return this.f4074g.subList(i2, i3);
    }

    public Object[] toArray() {
        return this.f4074g.toArray();
    }

    public void add(int i2, E e2) {
        this.f4074g.add(i2, e2);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        return this.f4074g.addAll(i2, collection);
    }

    public ListIterator<E> listIterator(int i2) {
        return this.f4074g.listIterator(i2);
    }

    public E remove(int i2) {
        return this.f4074g.remove(i2);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f4074g.toArray(tArr);
    }
}
