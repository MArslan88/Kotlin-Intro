fun main(args: Array<String>) {

    /*
    var (mutable: value can be reassign)
    val (immutable: value can not be reassign)
     */
//    var name = "Arslan"     // mutable
//    val name2 = "Danish"    // immutable
//    name = "Tanzeel"
//
//    println(name)
//    println(name2)


    /*
    String templates
     */

    var name1 = "Ronny"
    var name2 = "Mickey"

    println("Both $name1 and $name2 are best friends");
    println("${name1.toUpperCase()} is older than $name2");


    // IF-ELSE statements ----------------------------
    val a=205
    val b=195

    val great = if(a>b)
        "$a is greater"
    else
        "$b is greater"
    println("$great")



}