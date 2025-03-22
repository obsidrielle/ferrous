package io.github.obsidrielle;

import java.util.Objects;

public final class Option<T> {
    private final T val;

    private Option(T val) {
        this.val = val;
    }

    private Option() {
        this.val = null;
    }

    public static <T> Option<T> some(T val) {
        return new Option<>(val);
    }

    @Override
    public String toString() {
        if (this.isSome()) {
            return "Option { Some(" + this.val + ") }";
        }
        return "Option { None }";
    }

    public static <T> Option<T> none() {
        return new Option<T>();
    }

    public boolean isSome() {
        return this.val != null;
    }

    public boolean isNone() {
        return !isSome();
    }

    public T unwrap() {
        return this.val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Option<?> option = (Option<?>) o;
        return Objects.equals(val, option.val);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(val);
    }
}
