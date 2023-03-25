package Coursework1;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);


    private Counter() {

    }

    public static int getId() {
        return COUNTER.getAndIncrement();
    }
}

