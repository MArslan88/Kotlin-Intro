fun main(){

//    var name = "Muhammad Arslan"
//    println("Hello $name")
//
//    var myName: String? = "abc"
//
//    println("my new name is : $myName")

//    var age = 17
//    if(age>=18){
//        print("You can vote")
//    }else{
//        print("You cannot vote!")
//    }


//    // we can assign conditional statements into the variable
//    var age = 18
//    val message: String = if(age>=18){
//        return print("You can vote")
//    }else{
//        return print("you cannot vote")
//    }
//    println(message)


//    // when statement is just like a switch statement in java
//    var name = "Arslan"
//    when(name){
//        "Arslan"->{
//            println("i have found your name: $name")
//        }
//        "Hello"->{
//            println("No this one is not your name")
//        }else->{
//            println("jb kuch bhi same na ho to else chale ga")
//        }
//    }


//    // Array in Kotlin
//    var names = arrayOf("Arslan", "Danish", "Tanzeel","Noman")
////    for(name in names){
////        println(name)
////    }
//
//    names.forEach { println(it) }


    // Ranges

//    for (i in 0..3){
//        print(i)
//    }
//    print(" ")
//    for(i in 2..8 step 2){
//        print(i)
//    }
//    print(" ")
//    for(i in 3 downTo 0){
//        print(i)
//    }

//    val x=6
//    if(x in 1..5){
//        print("x is in range from 1 to 5")
//    }
//    println()
//    if(x !in 1..5){
//        print("x is not in range from 1 to 5")
//    }
//    println()
//    if(x !in 6..10){
//        print("x is not in range from 6 to 10")
//    }

    // collection (Map)
    val readOnlyJuiceMenu = mapOf("Apple" to 190, "Mango" to 250, "Kiwi" to 180)
    println(readOnlyJuiceMenu)
    println("The value of apple juice is : ${readOnlyJuiceMenu["Apple"]}")

    for(menu in readOnlyJuiceMenu){
        println("The value of ${menu.key} juice is : ${menu.value}")
    }





}