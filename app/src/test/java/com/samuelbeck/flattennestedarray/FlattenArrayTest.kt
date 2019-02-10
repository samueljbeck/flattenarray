package com.samuelbeck.flattennestedarray

import junit.framework.TestCase.assertTrue
import org.junit.Test

/*
 * Created by samueljbeck on 2/9/19.
 */
class FlattenArrayTest {


    //canFlattenArray will test flattenArray
    @Test
    fun canFlattenArray() {

        val flatten = FlattenArray()

        val sampleTest = arrayOf(arrayOf(1,2, arrayOf("foo")),4)   //[[1,2,['foo']],4] -> [1,2,'foo',4]
        val sampleTestFlattened = arrayOf(1,2,"foo",4)

        val testObject1 = arrayOf(1,2,arrayOf(6,5, arrayOf(5,"two",6)),"stat",6)  //should = 1,2,6,5,5,"two,6,stat,6
        val testObject1Flattened = arrayOf(1,2,6,5,5,"two",6,"stat",6)

        val testObject2 = arrayOf(1.45, arrayOf(1, arrayOf(6.5,"star"),8),"stop") //should = 1.45,1,6.5,"star",8,"stop"
        val testObject2Flattened = arrayOf(1.45,1,6.5,"star",8,"stop")

        val testObject3 = arrayOf(6, null)
        val testObject3Flattened = arrayOf(6)  //drops null object (or any object that is not a number or string




        assertTrue(flatten.flattenArray(sampleTest) contentEquals sampleTestFlattened)

        assertTrue(flatten.flattenArray(testObject1) contentEquals testObject1Flattened)

        assertTrue(flatten.flattenArray(testObject2) contentEquals testObject2Flattened)

        assertTrue(flatten.flattenArray(testObject3) contentEquals testObject3Flattened)  //verify nulls get dropped

        assert(!flatten.flattenArray(testObject1).contentEquals(testObject2Flattened))  // verify flatten fails for bad input

    }

}