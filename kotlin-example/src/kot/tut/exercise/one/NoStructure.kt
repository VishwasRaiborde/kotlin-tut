package kot.tut.exercise.one

fun printSomething (){
	println("hello world please stop using plastic , primitive life was the best")
}

fun callPrintFunction (){
	printSomething()
}

/*if the class does not have  a structure i.e has no starting and closing braces the main method goes parallel with other functions in  kotlin */
fun  main (args: Array<String>){
	callPrintFunction()
}


