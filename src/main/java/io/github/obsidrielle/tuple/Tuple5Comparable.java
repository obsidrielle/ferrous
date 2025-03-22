package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple5Comparable<T extends Comparable<T>, U extends Comparable<U>, V extends Comparable<V>,
        W extends Comparable<W>, X extends Comparable<X>>
        implements Comparable<Tuple5Comparable<T, U, V, W, X>> {
    private T first;
    private U second;
    private V third;
    private W fourth;
    private X fifth;

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

    public X getFifth() {
        return fifth;
    }

    public void setFifth(X fifth) {
        this.fifth = fifth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple5Comparable<?, ?, ?, ?, ?> that = (Tuple5Comparable<?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first)
                && Objects.equals(second, that.second)
                && Objects.equals(third, that.third)
                && Objects.equals(fourth, that.fourth)
                && Objects.equals(fifth, that.fifth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth);
    }

    @Override
    public String toString() {
        return "Tuple5Comparable{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                '}';
    }

    @Override
    public int compareTo(Tuple5Comparable<T, U, V, W, X> o) {
        int cmp = first.compareTo(o.first);
        if (cmp != 0) return cmp;
        cmp = second.compareTo(o.second);
        if (cmp != 0) return cmp;
        cmp = third.compareTo(o.third);
        if (cmp != 0) return cmp;
        cmp = fourth.compareTo(o.fourth);
        if (cmp != 0) return cmp;
        return fifth.compareTo(o.fifth);
    }
}