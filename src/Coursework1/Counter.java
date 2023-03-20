package Coursework1;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final int id;

    public Counter() {
        id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }
}

