package com.first

/**
 * 调用可能返回 null 的方法
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
//    if (args.size < 2) {
//        println("Two Integers expected")
//        return
//    }

    var x = parseInt("1")
    var y = parseInt("10")

    if (x != null && y != null) {
        println(x * y)
    }


}

fun parseInt(str: String): Int? {
    return str.toInt()
}