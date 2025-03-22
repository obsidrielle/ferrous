package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple6Comparable<T extends Comparable<T>, U extends Comparable<U>, V extends Comparable<V>,
        W extends Comparable<W>, X extends Comparable<X>, Y extends Comparable<Y>>
        implements Comparable<Tuple6Comparable<T, U, V, W, X, Y>> {
    private T first;
    private U second;
    private V third;
    private W fourth;
    private X fifth;
    private Y sixth;

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

    public Y getSixth() {
        return sixth;
    }

    public void setSixth(Y sixth) {
        this.sixth = sixth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple6Comparable<?, ?, ?, ?, ?, ?> that = (Tuple6Comparable<?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first)
                && Objects.equals(second, that.second)
                && Objects.equals(third, that.third)
                && Objects.equals(fourth, that.fourth)
                && Objects.equals(fifth, that.fifth)
                && Objects.equals(sixth, that.sixth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public String toString() {
        return "Tuple6Comparable{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                '}';
    }

    @Override
    public int compareTo(Tuple6Comparable<T, U, V, W, X, Y> o) {
        int cmp = first.compareTo(o.first);
        if (cmp != 0) return cmp;
        cmp = second.compareTo(o.second);
        if (cmp != 0) return cmp;
        cmp = third.compareTo(o.third);
        if (cmp != 0) return cmp;
        cmp = fourth.compareTo(o.fourth);
        if (cmp != 0) return cmp;
        cmp = fifth.compareTo(o.fifth);
        if (cmp != 0) return cmp;
        return sixth.compareTo(o.sixth);
    }
}