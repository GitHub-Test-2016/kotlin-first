package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    forTest()
}

fun forTest() {
    var items = listOf("apple", "banana", "kiwi")
    //按具体值遍历
    for (str in items) {
        println(str)
    }

    // 按索引遍历
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}