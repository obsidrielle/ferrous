package io.github.obsidrielle.tuple;

import java.util.Objects;

public class Tuple2Comparable<T extends Comparable<T>, F extends Comparable<F>>
        implements Comparable<Tuple2Comparable<T, F>> {
    private T first;
    private F second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public F getSecond() {
        return second;
    }

    public void setSecond(F second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple2Comparable<?, ?> that = (Tuple2Comparable<?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Tuple2Comparable{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public int compareTo(Tuple2Comparable<T, F> o) {
        int cmp = first.compareTo(o.first);
        return cmp != 0 ? cmp : second.compareTo(o.second);
    }
}