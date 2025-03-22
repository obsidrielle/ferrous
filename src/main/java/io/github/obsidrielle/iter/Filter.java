package io.github.obsidrielle.iter;

import io.github.obsidrielle.Option;

import java.util.function.Predicate;

public class Filter<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private final Predicate<T> predicate;

    public Filter(Iterator<T> iterator, Predicate<T> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public Option<T> next() {
        return null;
    }
}
