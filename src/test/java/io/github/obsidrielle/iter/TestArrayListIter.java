package io.github.obsidrielle.iter;

import io.github.obsidrielle.Option;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Objects;

public class TestArrayListIter {
    private ArrayList<Integer> array;
    private ArrayListIter<Integer> iter;

    {
        array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        iter = new ArrayListIter<>(array);
    }

    private void resetIter() {
        iter = new ArrayListIter<>(array);
    }

    @Test
    public void testNext() {
        resetIter();

        assert Objects.equals(iter.next(), Option.some(1));
        assert Objects.equals(iter.next(), Option.some(2));
        assert Objects.equals(iter.next(), Option.some(3));
        assert Objects.equals(iter.next(), Option.some(4));
        assert Objects.equals(iter.next(), Option.some(5));
        assert Objects.equals(iter.next(), Option.none());
    }

    @Test
    public void testFold() {
        resetIter();

        assert iter.fold(0, Integer::sum) == 15;
    }

    @Test
    public void testLast() {
        resetIter();

        assert iter.last().equals(Option.some(5));
    }
}
