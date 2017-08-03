package com.first

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */

fun main(args: Array<String>) {

    println(add(1, 2))
    println(sum(1, 2))
    printTest("test")
    vars(1, 2, 3, 4, 5)
    println(lambdaTest(1, 2))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//fun sum(a: Int, b: Int) = a + b
/**
 * public 声明的方法必须说明返回类型
 */
public fun sum(a: Int, b: Int): Int = a + b

/**
 * Unit == void
 */
fun printTest(str: String): Unit = println(str)

/**
 * 变长参数 vararg
 */
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

var lambdaTest: (Int, Int) -> Int = { x, y -> x + y }