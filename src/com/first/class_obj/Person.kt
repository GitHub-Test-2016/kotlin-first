package com.first.class_obj

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
class Person {
    var lastName: String = "zhang"
        get() = field.toUpperCase()
        set

    var no: Int = 100
        get() = field
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }
    var heiht: Float = 145.46f
        private set
}

fun main(args: Array<String>) {
    var person: Person = Person()
    person.lastName = "wang"
    println("lastName:${person.lastName}")

    person.no = 9
    println("no:${person.no}")

    person.no = 20
    println("no:${person.no}")

    println(person.heiht)
}