package com.vis.examples.dataTypes

class BasicLoops {

    //dont explicitly seach for String[] instead use arrayof
    val arrayOfEmployees = arrayOf("vishwas", "vishwas 1", "vishwas 2")

    fun printEmployeeListWithforLoop() {
        println("Using for loop ")
        for (i in arrayOfEmployees.indices)
            println(arrayOfEmployees[i])
    }

    fun printEmployeeListWithWhileLoop() {
        println("Using while loop ")
        var i = 0
        while (i < arrayOfEmployees.size)
            println(arrayOfEmployees[i++])
    }
}

fun main(args: Array<String>) {
    var loop = BasicLoops()
    loop.printEmployeeListWithforLoop()
    loop.printEmployeeListWithWhileLoop()
}