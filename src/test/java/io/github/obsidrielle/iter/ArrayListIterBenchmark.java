package io.github.obsidrielle.iter;

import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 3, time = 4)
@Threads(1)
@Fork(1)
@State(value = Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class ArrayListIterBenchmark {
    @Param(value = {"1000", "10000", "100000"})
    private int length;
    private ArrayList<Integer> list;

    public static void main(String[] args) throws RunnerException {
        var opt = new OptionsBuilder()
                .include(ArrayListIterBenchmark.class.getSimpleName())
                .result("result.json")
                .resultFormat(ResultFormatType.JSON)
                .build();
        new Runner(opt).run();
    }

    @Setup(Level.Iteration)
    public void setup() {
        list = new ArrayList<>(length);
        for (int i = 1; i <= length; i++) {
            list.add(i);
        }
    }

    @Benchmark
    public void testStream(Blackhole blockhole) {
        var res = list.stream().reduce(0, Integer::sum);
        blockhole.consume(res);
    }

    @Benchmark
    public void testIter(Blackhole blackhole) {
        var res = new ArrayListIter<>(list).fold(0, Integer::sum);
        blackhole.consume(res);
    }
}
