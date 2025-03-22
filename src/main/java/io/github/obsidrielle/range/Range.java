package io.github.obsidrielle.range;

import io.github.obsidrielle.Option;
import io.github.obsidrielle.iter.Iterator;

/**
 * [start, end)
 */
public class Range implements Iterator<Integer> {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Range(int start) {
        this.start = start;
        this.end = Integer.MAX_VALUE;
    }


    @Override
    public Option<Integer> next() {
        return null;
    }
}
