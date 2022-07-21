fun main(){
    val marks = 130

    val result = if(marks < 105 && marks > 80){
        "Cutoff not cleared( 2nd Exam)"
    }else if(marks in 105..130){
        "Cutoff cleared"
    }else if(marks in 130..180){
        "Cutoff cleared (No fee)"
    }else{
        "Cutoff not cleared"
    }
    println(result)
}