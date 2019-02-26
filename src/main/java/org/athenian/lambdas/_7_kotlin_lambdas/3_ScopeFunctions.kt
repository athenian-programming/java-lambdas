package org.athenian.lambdas._7_kotlin_lambdas

class ScopeFunctionTest {

    fun letExample(): Int {
        val str: String = "StringVal"
        val result = str.let {
            println("this: $this")
            println("it: $it")
            42
        }
        return result
    }

    fun alsoExample(): String {
        val str: String = "StringVal"
        val result = str.also {
            println("this: $this")
            println("it: $it")
            42
        }
        return result
    }

    fun runExample(): Int {
        val str: String = "StringVal"
        val result = str.run {
            println("this: $this")
            //println("it: $it")
            42
        }
        return result
    }

    fun applyExample(): String {
        val str: String = "StringVal"
        val result = str.apply {
            println("this: $this")
            //println("it: $it")
            42
        }
        return result
    }

    fun withExample(): Int {
        val str: String = "StringVal"
        val result = with(str) {
            println("this: $this")
            //println("it: $it")
            42
        }
        return result
    }
}

fun main() {
    val obj = ScopeFunctionTest()

    println("let:")
    println("return: ${obj.letExample()}")

    println("\nalso:")
    println("return: ${obj.alsoExample()}")

    println("\nrun:")
    println("return: ${obj.runExample()}")

    println("\napply:")
    println("return: ${obj.applyExample()}")

    println("\nwith:")
    println("return: ${obj.withExample()}")
}
