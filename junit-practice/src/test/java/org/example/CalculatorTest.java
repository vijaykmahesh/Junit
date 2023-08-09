package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static  void beforeAllTest(){

        System.out.println("Before all test runs @beforeAllTest");
    }

    @AfterAll
    public static  void afterAllTest(){

        System.out.println("after all test runs @afterAllTest");
    }



    @BeforeEach
    public void init(){

        System.out.println("Inside init()");
        calculator = new Calculator();

    }

    @AfterEach
    public void cleanUp(){

        System.out.println("After every test method completes");

    }


    @DisplayName("Addition Testing")
    @Test
    public void test_add() {


        Integer sum = calculator.add(23, 25);

        assertEquals(48,sum,"23 + 25 should be equal to 48");

    }

    @Test
    public void test_multiply() {


        Integer mul = calculator.multiply(5, 2);

        assertEquals(10,mul,"5 * 2 should be equal to 10");

    }
}
