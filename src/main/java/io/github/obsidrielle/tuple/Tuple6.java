package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple6<T, U, V, W, X, Y> {
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
        Tuple6<?, ?, ?, ?, ?, ?> tuple6 = (Tuple6<?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, tuple6.first) && Objects.equals(second, tuple6.second) && Objects.equals(third, tuple6.third) && Objects.equals(fourth, tuple6.fourth) && Objects.equals(fifth, tuple6.fifth) && Objects.equals(sixth, tuple6.sixth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth);
    }

    @Override
    public String toString() {
        return "Tuple6{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                '}';
    }
}