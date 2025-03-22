package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple3Comparable<T extends Comparable<T>, U extends Comparable<U>, V extends Comparable<V>>
        implements Comparable<Tuple3Comparable<T, U, V>> {
    private T first;
    private U second;
    private V third;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple3Comparable<?, ?, ?> that = (Tuple3Comparable<?, ?, ?>) o;
        return Objects.equals(first, that.first)
                && Objects.equals(second, that.second)
                && Objects.equals(third, that.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }

    @Override
    public String toString() {
        return "Tuple3Comparable{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public int compareTo(Tuple3Comparable<T, U, V> o) {
        int cmp = first.compareTo(o.first);
        if (cmp != 0) return cmp;
        cmp = second.compareTo(o.second);
        if (cmp != 0) return cmp;
        return third.compareTo(o.third);
    }
}