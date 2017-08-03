package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    println(ifElseTest(2))
    println(ifElseToValue(2))
}

/**
 * 普通的 if-else
 */
fun ifElseTest(a: Int): Int {
    var max: Int
    if (a > 1) {
        max = a
    } else {
        max = 1
    }
    return max
}

/**
 * 作为表达式直接赋值给变量
 */
fun ifElseToValue(a: Int): Int {
    val max = if (a > 1) a else 1
    return max
}

