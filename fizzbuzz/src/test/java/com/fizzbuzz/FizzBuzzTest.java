package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1ifNumberIs1() {
        assertEquals("1",new FizzBuzz().generate(1,1));
    }

    @Test
    public void shouldReturn2ifNumberIs2() {
        assertEquals("2",new FizzBuzz().generate(2,2));
    }

    @Test
    public void shouldReturnFizzifNumberIs3() {
        assertEquals("Fizz",new FizzBuzz().generate(3,3));
    }
    
    @Test
    public void shouldReturnFizzifNumberIs6() {
        assertEquals("Fizz",new FizzBuzz().generate(6,6));
    }

    @Test
    public void shouldReturnBuzzifNumberIs5() {
        assertEquals("Buzz",new FizzBuzz().generate(5,5));
    }

    @Test
    public void shouldReturnBuzzifNumberIs10() {
        assertEquals("Buzz",new FizzBuzz().generate(10,10));
    }

    @Test
    public void shouldReturnFizzBuzzifNumberIs15() {
        assertEquals("FizzBuzz",new FizzBuzz().generate(15,15));
    }

    @Test
    public void shouldReturnFizzBuzzifNumberIs30() {
        assertEquals("FizzBuzz",new FizzBuzz().generate(30,30));
    }

    @Test
    public void shouldReturn12Fizz4BuzzifNumbersAre1to15() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz",new FizzBuzz().generate(1,15));
    }

}