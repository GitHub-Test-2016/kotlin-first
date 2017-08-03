package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    returnTest()
    returnTest1()
}

/**
 * 普通
 */
fun returnTest() {
    for (i in 1..10) {
        if (i == 3) continue    //等于3 结束本次循环
        println(i)
        if (i > 5) break     //大于5跳出循环
    }
}

fun returnTest1() {
    loop@ for (i in 1..10) {
        if (i == 2) break@loop
        println(i)
    }
}