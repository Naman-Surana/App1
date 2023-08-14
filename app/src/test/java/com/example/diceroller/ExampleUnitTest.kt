package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
fun generates_no(){
    val dice=Dice(6)
        val resultant=dice.roll()
        assertTrue("There was an error in roll",resultant in 1..6)
}
}
