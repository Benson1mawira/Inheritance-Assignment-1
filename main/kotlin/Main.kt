fun main(){
    val myStudents=Student()
    myStudents.gender="males and females"
    myStudents.coarse="Building And Civil"
    println("The class has both ${myStudents.gender} and they are taking ${myStudents.coarse}")
    myStudents.curriculum()
    val boys1=Boys()
    boys1.gender="males"
    boys1.coarse="Building And Civil"
    println("the class has  ${boys1.gender} and they are taking ${boys1.coarse}")
    boys1.football()
    boys1.curriculum()
    val ladies1=Ladies()
    ladies1.gender="females"
    ladies1.coarse="Building And Civil"
    println("the class has ${ladies1.gender} and they are taking ${ladies1.coarse}")
    ladies1.hockey()
    ladies1.curriculum()


    /*In a class of 57 students the teacher was collecting data of her students,
     * The data she required was:
     * The gender of the students
     * The course they are doing
     * the feedback on boys playing football
     * the feedback on the ladies playing hockey
     * the feedback on the curriculum
     * Using inheritance, represent the gender and the course as
     * properties and the feedback as methods*/
}
open class  Student{
    var gender:String=""
    var coarse:String=""
    fun curriculum(){
        println("they are using CBC curriculum")
    }

}
class Boys:Student(){
    fun football(){
        println("the number of boys playing football is 22")
    }

}
class Ladies:Student(){
    fun hockey(){
        println("the ladies playing hockey are 35")
    }

}