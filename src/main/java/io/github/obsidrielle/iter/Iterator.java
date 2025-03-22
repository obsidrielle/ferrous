package io.github.obsidrielle.iter;

import io.github.obsidrielle.Option;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public interface Iterator<T> {
    Option<T> next();

    default <B> B fold(B init, BiFunction<B, T, B> fn) {
        var acc = init;
        var item = this.next();

        while (item.isSome()) {
            acc = fn.apply(acc, item.unwrap());
            item = this.next();
        }
        return acc;
    }

    default Option<T> last() {
        return this.fold(null, (prev, nxt) -> Option.some(nxt));
    }

    default Filter<T> filter(Predicate<T> predicate) {
        return new Filter<T>(this, predicate);
    }
}