package com.first.basic

/**
 * for 循环 ".."、"step"、"downTo"、"until"
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    println("循环输出：")
    for (i in 1..4)
        println(i)
    println("-------------------")
    println("设置步长：")
    for (i in 1..4 step 2)
        println(i)
    println("-------------------")
    println("使用 downTo")
    for (i in 4 downTo 1 step 2)
        println(i)
    println("-------------------")
    println("使用 until")
    for (i in 1 until 4) //i in [1, 4) 包括1 不包括4
        println(i)

}