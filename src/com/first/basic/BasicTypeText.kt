package com.first.basic

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {

    /**
     * kotlin 不支持8进制写法
     */

    /**
     * 数字可以使用下划线标识更清楚
     */
    var oneMillion = 1_000_000
    var vreditCardNumber = 1234_5678_9012_1234L
    var socialSecutrityNumber = 999_99_9999L

    compareNumber()

    println(transToInt('8'))
}

/**
 * 比较两个数字：kotlin 中没有基本数据类型，只有封装的数字类型
 * 需要注意，比较两个数字时，要区别是比较数值还是对象
 */
fun compareNumber() {

    var a: Int = 10000
    println(a === a) //值相等，对象地址也相等

    var boxedA: Int? = a
    var anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) //false ,值相等，但是对象地址不一样
    println(boxedA == anotherBoxedA) //true ,值相等
}

/**
 * 字符串转换为数字
 *
 */
fun transToInt(str: Char): Int {
    if (str !in '0'..'9') {
        throw IllegalArgumentException("Out of range")
    }
    return str.toInt() - '0'.toInt()
}


