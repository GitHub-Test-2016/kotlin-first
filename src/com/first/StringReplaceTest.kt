package com.first

/**
 * 变量的定义，引用
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {

    /**
     * $ 表示一个变量名或者变量值
     * $varName 表示变量值
     * ${varName.fun()} 表示变量的方法返回值
     */
    var a = 1
    var s1 = "a is $a"
    println(s1)

    a = 2
    var s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    var s3 = s1.replace("is", "was")
    println(s3)
    var s4 = "$s3, but now is $a"
    println(s4)
}