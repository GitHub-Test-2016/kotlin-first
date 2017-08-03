package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */

fun main(args: Array<String>) {

    whenTest()
    println()
    whenTest1()
    println()
    println(hasPrefix("prefixXxxx"))
    whenTest2()
}

fun whenTest() {
    //when 当做语句使用
    var x: Int = 1
    when (x) {
        1 -> print("x is $x")
        2 -> print("x is $x")
        else -> {
            print("x is not 1 or 2")
        }
    }
}

/**
 * 多个条件公用一个处理方式
 */
fun whenTest1() {
    var x: Int = 2
    when (x) {
        1, 2 -> print("x is 1 or 2")
        else -> print("x is not 1 or 2")
    }
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}

fun whenTest2(){
    var items = setOf("apple","banana", "kiwi")
    when{
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
