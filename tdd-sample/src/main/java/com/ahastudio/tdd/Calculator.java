package com.ahastudio.tdd;

import java.util.stream.IntStream;

public class Calculator {

    // return (x + 1) + 1) + 1)
    public int plus(int x, int y) {
        if( y == 0 )
            return x;
        else
            return plus(x + 1, y - 1);
    }

    public int minus(int x, int y) {
        if( y == 0 )
            return x;
        else
            return minus(x - 1, y - 1);

    }

    public int multiply(int x, int y) {
        return IntStream.generate(() -> 0).limit(y)
                .reduce(0, (a, e) -> plus(a, x)) ;

    }


    public int fibonacci(int x) {
        if( x == 1 || x == 2 ) {
            return 1;
        }
        return fibonacci(x - 2 ) + fibonacci(x - 1 );
    }
}
