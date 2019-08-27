package com.ahastudio.tdd;

// Calculator
// - plus(x,y)
// = > plus (1, 2) = 3
// - minus(x,y)
// - divide(x,y)
// - multiply(x,y)
// - fibonacci(i)
// = > 1 1 2 3 5 8 13 21 34 55

import org.junit.Before;
import org.junit.Test;

import java.time.DayOfWeek;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CalculatorTest  {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void plus() {
        assertThat(calculator. plus(2,3), is(5));
    }

    @Test
    public void minus() {
        assertThat(calculator. minus(6 ,2 ), is(4));
    }

    @Test
    public void multiply() {
         assertThat(calculator.multiply(3, 5), is(15)) ;
    }

    @Test
    public void fibonacci() {
        assertThat(calculator.fibonacci(1), is(1));
        assertThat(calculator.fibonacci(5), is(5 ));
        assertThat(calculator.fibonacci(3), is(2));
        assertThat(calculator.fibonacci(10), is(55));
    }
}


