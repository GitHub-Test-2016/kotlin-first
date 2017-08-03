package com.first

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
class Greeter(val name: String){
    fun greet(){
        println("Hello, $name")
    }
}


fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}