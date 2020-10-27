package com.akanbi.tddlab.fizzbuzz

import java.lang.IllegalArgumentException

class FizzBuzz {

    fun sayWhatYourIs(multiplier: Int): String {
        if (isMultiplierNegative(multiplier))
            throw IllegalArgumentException("Multiplier negative!")

        return buildResult(multiplier)
    }

    private fun buildResult(multiplier: Int): String {
        val result = StringBuilder()
        if (isMultiplierByThree(multiplier))
            result.append("fizz")
        if (isMultiplierByFive(multiplier)) {
            result.append("buzz")
        }
        return formatResult(result, multiplier)
    }

    private fun formatResult(result: StringBuilder, multiplier: Int): String = when {
        result.isBlank() -> multiplier.toString()
        else -> result.toString()
    }

    private fun isMultiplierNegative(multiplier: Int) = multiplier < 0

    private fun isMultiplierByFive(multiple: Int) = multiple % 5 == 0

    private fun isMultiplierByThree(multiple: Int) = multiple % 3 == 0
}