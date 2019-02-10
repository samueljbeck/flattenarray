package com.samuelbeck.flattennestedarray

/*
 * Created by samueljbeck on 2/9/19.
 */

//FlattenArray is a class to flatten nested arrays
class FlattenArray {

    //flattenArray will take any input, but will return an array
    fun flattenArray(input: Any) : Array<Any> {
        val flatArray = ArrayList<Any>()

        if (input is Array<*>) { // if the input is an array loop through the items and flatten them
            for (item in input) {
                if (item is Array<*>) {
                    flatArray.addAll(flattenArray(item))
                } else {
                    if (item is Number || item is String)  // only add strings and numbers
                    flatArray.add(item)
                }
            }
        } else {
            if (input is Number || input is String)  // only add strings and numbers
            flatArray.add(input)
        }
        return flatArray.toArray()!!
    }

}