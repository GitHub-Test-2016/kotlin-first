package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    whileTest()
}

fun whileTest() {
    println("使用 while:")
    var x = 5
    while (x > 0) {
        println(x--)
    }
    println("使用 do-While:")
    var y = 5
    do {
        println(y--)
    } while (y > 0)

    println("使用 do-While:至少执行一次")
    var z = 5
    do {
        println(z--)
    } while (z > 5)
}