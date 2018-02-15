package academy.learnprogramming.ifexpression


fun main(args: Array<String>) {

//    var num: Int
//
//    if (someCondition) {
//        num = 50
//    }
//    else {
//        num = 592
//    }
//
//    num = someCondition ? 50 : 592

    val someCondition = 20 < 22

    //val num = if (someCondition) 50 else 592

    println("The result of the expression is ${if (someCondition) {
        println("something")
        50
    }
    else {
        println("something else")
        592
    }}")

    var x = if (someCondition) {
        println("something")

    }
    else {
        println("something")

    }
    println(x.javaClass)


//    else {
//        println("something else")
//
//    }

    //println(num2)
}