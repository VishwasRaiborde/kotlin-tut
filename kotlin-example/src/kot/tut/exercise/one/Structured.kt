package kot.tut.exercise.one

class Structured {

	fun calucateQualityOflife(salary: Int, expenditure: Int): Int {
		return salary - expenditure
	}

	fun computeUualityOfLife() {
		
		val salary = 20000
		val expenditure = 100000

		var qualityofLifeFlag: Int = calucateQualityOflife(salary, expenditure)
		if (qualityofLifeFlag > 0) {
			println("goind good mate ! look forward to friday")
		} else if(qualityofLifeFlag < 0){
			println("uninstall all shopping app !")
		}
	}
}

/*if the class has a structure i.e has a starting and closing braces the main method goes outside the class body in kotlin */
fun main(args: Array<String>) {
	var obj = Structured()
	obj.computeUualityOfLife()
}