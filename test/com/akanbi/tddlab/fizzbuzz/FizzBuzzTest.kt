package com.akanbi.tddlab.fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    private val fizzBuzz: FizzBuzz = FizzBuzz()

    @Test
    fun `should return buzz when multiplier of five`() {
        assertEquals("buzz", fizzBuzz.sayWhatYourIs(5))
    }

    @Test
    fun `should return fizz when multiplier of three`() {
        assertEquals("fizz", fizzBuzz.sayWhatYourIs(3))
    }

    @Test
    fun `should return fizzbuzz when multiplier of both`() {
        assertEquals("fizzbuzz", fizzBuzz.sayWhatYourIs(15))
    }

    @Test
    fun `should return the same number when is not multiplier of three or five`() {
        assertEquals("2", fizzBuzz.sayWhatYourIs(2))
    }

    @Test
    fun `should return fizz because nine is multiplier of three`() {
        assertEquals("fizz", fizzBuzz.sayWhatYourIs(9))
    }

    @Test
    fun `should return buzz because ten is multiplier of five`() {
        assertEquals("buzz", fizzBuzz.sayWhatYourIs(10))
    }

    @Test(expected = IllegalArgumentException::class)
    fun `should return exception when multiplier negative`() {
        fizzBuzz.sayWhatYourIs(-3)
    }
}