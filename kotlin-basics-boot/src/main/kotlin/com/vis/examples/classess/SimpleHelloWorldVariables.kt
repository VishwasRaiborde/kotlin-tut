package com.vis.examples.classess

class SimpleHelloWorldVariables{

    /*val and var both are used to declare a variable. var is like general variable and its known as a mutable variable in kotlin and can be assigned multiple times. val is like constant variable and its known as immutable in kotlin and can be initialized only single time*/
    val firstName = "vishwas";
    val lastName :String = "raiborde";
    var designation = "Developer";
    var salary = 0 ;


    fun promoteEmployee(){

        if (designation.isBlank()){
            println("a very basic employee")
        }else if (designation.equals("Developer")){
            designation = "Sr Developer";
            salary = salary + ((salary%30)*100)
        }else if (designation.equals("Sr Developer")){
            designation = "Super Sr Developer";
            salary = salary + (salary%30)
        }else if (designation.equals("Super Sr Developer")){
            designation = "Super Most Sr Developer";
            salary = salary + (salary%30)
        }else{
            designation ="End of Ladder of Development"
            salary = salary + (salary%30)
        }
    }

    fun printPromotedValue(){
        println("Congratulation ${firstName} ${lastName} you have been promoted to " + designation +"and new salary value of " + salary)
    }

}

fun main (args:Array<String>){
    var promotion = SimpleHelloWorldVariables()
    promotion.designation ="Developer";
    promotion.salary= 100_000
    promotion.promoteEmployee()
    promotion.printPromotedValue()

    promotion.designation ="Sr Developer";
    promotion.promoteEmployee()
    promotion.printPromotedValue()

    promotion.designation ="Super Sr Developer";
    promotion.promoteEmployee()
    promotion.printPromotedValue()

    promotion.designation ="Super Most Sr Developer";
    promotion.promoteEmployee()
    promotion.printPromotedValue()
}