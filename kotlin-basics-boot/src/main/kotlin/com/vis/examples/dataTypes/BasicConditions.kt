package com.vis.examples.dataTypes


class BasicConditions {
    /*val and var both are used to declare a variable. var is like general variable and its known as a mutable variable in kotlin and can be assigned multiple times. val is like constant variable and its known as immutable in kotlin and can be initialized only single time*/
    val firstName = "vishwas";
    val lastName: String = "raiborde";
    var designation = "Developer";
    var salary = 0;

    fun promoteEmployeewithBasicWhenCondition(designation: String) {
        when (designation) {
            "" -> println("a very basic employee")
            "Developer" -> {
                this.designation = "Sr Developer";
                this.salary = salary + ((salary % 30) * 100);
            }
            "Sr Developer" -> {
                this.designation = "Super Sr Developer";
                this.salary = salary + (salary % 30);
            }
            "Super Sr Developer" -> {
                this.designation = "Super Most Sr Developer";
                this.salary = salary + (salary % 30);
            }

        }
    }

    fun printPromotedValue() {
        println("Congratulation ${firstName} ${lastName} you have been promoted to " + designation + "and new salary value of " + salary)
    }
}


fun main(args: Array<String>) {
    var promotion = BasicConditions()

    promotion.salary = 100_000_00
    promotion.promoteEmployeewithBasicWhenCondition("Developer")
    promotion.printPromotedValue()

    promotion.promoteEmployeewithBasicWhenCondition("Sr Developer")
    promotion.printPromotedValue()

    promotion.promoteEmployeewithBasicWhenCondition("Super Sr Developer")
    promotion.printPromotedValue()

    promotion.promoteEmployeewithBasicWhenCondition("Super Most Sr Developer")
    promotion.printPromotedValue()
}