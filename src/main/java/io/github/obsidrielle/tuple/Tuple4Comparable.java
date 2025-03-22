package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple4Comparable<T extends Comparable<T>, U extends Comparable<U>, V extends Comparable<V>, W extends Comparable<W>>
        implements Comparable<Tuple4Comparable<T, U, V, W>> {
    private T first;
    private U second;
    private V third;
    private W fourth;

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

    public W getFourth() {
        return fourth;
    }

    public void setFourth(W fourth) {
        this.fourth = fourth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple4Comparable<?, ?, ?, ?> that = (Tuple4Comparable<?, ?, ?, ?>) o;
        return Objects.equals(first, that.first)
                && Objects.equals(second, that.second)
                && Objects.equals(third, that.third)
                && Objects.equals(fourth, that.fourth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth);
    }

    @Override
    public String toString() {
        return "Tuple4Comparable{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }

    @Override
    public int compareTo(Tuple4Comparable<T, U, V, W> o) {
        int cmp = first.compareTo(o.first);
        if (cmp != 0) return cmp;
        cmp = second.compareTo(o.second);
        if (cmp != 0) return cmp;
        cmp = third.compareTo(o.third);
        if (cmp != 0) return cmp;
        return fourth.compareTo(o.fourth);
    }
}