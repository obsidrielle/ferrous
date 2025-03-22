package io.github.obsidrielle.iter;

import io.github.obsidrielle.Option;

import java.util.ArrayList;

public class ArrayListIter<T> implements Iterator<T> {
    private int idx;
    private final ArrayList<T> array;

    public ArrayListIter(ArrayList<T> array) {
        this.idx = 0;
        this.array = array;
    }

    @Override
    public Option<T> next() {
        if (idx < array.size()) {
            return Option.some(array.get(idx++));
        }

        return Option.none();
    }
}
