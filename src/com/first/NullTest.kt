package com.first

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {
    //类型后边加？ 表示可为空
    var age: String? = "123"
    println(age)

    //!! 抛出空指针异常
    var ages = age!!.toInt()
    println(ages)

    //抛出空指针
//    age = null
//    var ages1 = age!!.toInt()
//    println(ages1)

    //不作处理返回 null
    var ages1 = age?.toInt()
    println(ages1)

    //返回 null
//    age = null
//    var ages2 = age?.toInt()
//    println(ages2)

    //?: 空判断处理
    var ages3 = age?.toInt() ?: -1
    println(ages3)

//    age = null
//    var ages4 = age?.toInt() ?: -1
//    println(ages4)
//
}