package com.first.basic

/**
 * 类型检测及自动类型转换（is/!is）
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
fun main(args: Array<String>) {

    println(getStringLength("123"))
    println(getStringLength1("123"))
    println(getStringLength2("123"))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    if (obj !is String) {
        return null
    }
    return null
}

fun getStringLength1(obj: Any): Int? {
    if (obj !is String)
        return null
    // 在这个分支中, `obj` 的类型会被自动转换为 `String`
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}