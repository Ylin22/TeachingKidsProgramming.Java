package org.teachingkidsprogramming.recipes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest
{
  @Test
  public void test1Produces1()
  {
    assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void test2Produces2()
  {
    assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3ProducesFizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4Produces4()
  {
    assertEquals("4", FizzBuzz.convert(4));
  }
  @Test
  public void testMultiplesOf3ProducesFizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void test5ProducesBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void testMultiplesOf5ProducesBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(10));
  }
  @Test
  public void test15ProducesFizzBuzz()
  {
    assertEquals("FizzBuzz", FizzBuzz.convert(15));
  }
  @Test
  public void testMultiplesOf3And5ProducesFizzBuzz()
  {
    assertEquals("FizzBuzz", FizzBuzz.convert(30));
  }
}
