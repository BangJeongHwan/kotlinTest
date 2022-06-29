package com.brett.lec02.kotlin

fun main(){
//    println("hello kotlin")
    /**
     * safe call
     * null 이 아니면 실행하고
     * null 이면 실행하지 않는다(그대로 null)
     **/
    var str : String? = "ABC"
    // println(str.length)
    // 에러 발생 : Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    str = null
    println(str?.length) // null 이면 null

    /**
     * Elvis 연산 (?:)
     * 앞의 결과가 null 이면 뒤의 값을 사용
     */
    println(str?.length?:0) // null 이면 0

    startsWithA4("ABC") // true
    startsWithA4("BC") // false
    startsWithA4(null) // Exception in thread "main" java.lang.NullPointerException

}

fun startsWithA1(str : String?) : Boolean{
    /*
    if(str == null){
        return throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
    */
    // kotlin스럽게 변경
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str : String?) : Boolean?{
    /*
    if(str == null){
        return null
    }
    return str.startsWith("A")
     */
    // kotlin스럽게 변경
    return str?.startsWith("A")
}

fun startsWithA3(str : String?) : Boolean{
    /*
    if(str == null){
        return false
    }
    return str.startsWith("A")
    */
    // kotlin스럽게 변경
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str : String?) : Boolean{
    // null이 아님을 단언
    return str!!.startsWith("A")
}