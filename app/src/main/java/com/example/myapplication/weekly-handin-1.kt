fun main() {
    println("Opgave 1: Enter your age")
    println(checkPermissionToVote(readln().toInt()))

    println("Opgave 2: Print Max and Min")
    printMax()
    printMin()

    println("Opgave 3: Calculate Average")
    println(calculateAverage(mutableListOf(1, 2, 4)))

    println("Opgave 4: FizzBuzz")
    fizzBuzz()

    println("Opgave 5: CPR-Number")
    println(checkCPRValidity(readln()))

    println("Opgave 6: Abbreviate Your Name.")
    abbreviateName(readln())

    println("Opgave 7: Enter your grade.")
    println(convertToLetterGrade(readln().toInt()))

    println("Opgave 8: Filter list by length.")
    println(filterWordsByLength(mutableListOf("Horse", "Dog", "Bunny", "Cat" ), 4))
}

// *** OPGAVE 1***

/*A person is elligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is elligible to vote.
Let the user input their age. Get inspiration in the terminal output below:
 */

fun checkPermissionToVote(inputAge: Int): String {
    if (inputAge >= 18) {
        println("You're eligible to vote!")
    } else {
        println("You're not eligible to vote yet!")
    }
    return ""
}

// *** OPGAVE 2***

// Define two functions to print the maximum and the minimum number respectively among three numbers
val threeNumbers = listOf(1,2,3)

fun printMax () {
    println("Max: ${threeNumbers.max()}")

}

fun printMin () {
    println("Min: ${threeNumbers.min()}")
}

// *** OPGAVE 3***

// Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
fun calculateAverage (list: MutableList<Int>): Int {
    return list.sum() / list.size
}

// *** OPGAVE 4***

/* Write a method that returns if a user has input a valid CPR number.

A valid CPR number has:

10 Digits.

The first 2 digits are not above 31.

The middle 2 digits are not above 12.

The method returns true if the CPR number is valid, false if it is not. */

fun checkCPRValidity (cpr: String): Boolean {
    val day = cpr.substring(0,2).toInt()
    val month = cpr.substring(2,4).toInt()

    if (day in 0..31 && month in 0.. 12 && cpr.length == 10) {
        return true
    }

    return false

}



// *** OPGAVE 5***

/* Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”. */
fun fizzBuzz (): String {

    for (i in 1..100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
    return ""
}


// *** OPGAVE 6***

/* Write a program that takes your full name as input and displays the abbreviations of the first
and middle names except the last name which is displayed as it is.
For example, if your name is Robert Brett Roser, then the output should be R.B. Roser. Or Benjamin Dalsgaard Hughes will be B.D. Hughes */

fun abbreviateName (name: String): String {

    val arrayOfNames = name.split(" ") 

    val firstName = arrayOfNames[0]
    val lastName = arrayOfNames[arrayOfNames.size - 1]

    val firstNameAbbreviation = firstName[0].uppercase()

    if (arrayOfNames.size > 2) {
        val middleName = arrayOfNames[1]
        val middleNameAbbreviation = middleName[0].uppercase()
        println("${firstNameAbbreviation}. ${middleNameAbbreviation}. $lastName")

    } else {
        println("$firstNameAbbreviation. $lastName")
    }
    return ""
}

// *** OPGAVE 7***

/* Write a program that takes a numerical grade (0-100) as input and prints out the corresponding american letter grade.
Implement a function calculateGrade that takes an integer parameter representing the grade and returns a string representing the letter grade according to the following scale:
90-100: "A"

80-89: "B"

70-79: "C"

60-69: "D"

Below 60: "F"
*/

fun convertToLetterGrade (numericalGrade: Int): String {

    when {
        numericalGrade in 90..100 -> return "Grade: A"
        numericalGrade in 80..89 -> return "Grade: B"
        numericalGrade in 70..79 -> return "Grade: B"
        numericalGrade in 60..69 -> return "Grade: B"
        numericalGrade < 60 -> return "Grade: B"
    }
    return ""
}


// *** OPGAVE 8***

/*Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
and returns a list containing only the words that have a length greater than or equal to the specified minimum length.
Use filter function and lambda expressions
 */

fun filterWordsByLength (list: MutableList<String>, minimumLengthOfWord: Int): List<String> {
    return list.filter { element -> element.length >= minimumLengthOfWord }
}




