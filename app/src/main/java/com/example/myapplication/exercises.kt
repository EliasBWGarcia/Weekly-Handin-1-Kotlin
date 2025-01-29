import kotlin.math.max
import kotlin.math.min


fun main () {
    println("Opgave 1")
    val height: Double = 5.5
    val width: Double = 8.5
    println(areaAndPerimeterOfRectangle(height, width))

    println("Opgave 2")
    val userInputInt1 = readln().toInt()
    val userInputInt2 = readln().toInt()
    println(twoIntegers(userInputInt1,userInputInt2))

    println("Opgave 3")
    println(filterFunc())

    println("Opgave 4")
    val inputStrings = listOf("apple", "banana", "kiwi", "strawberry", "pear")
    val result = findStringLength(inputStrings)
    println(result)

    println("Opgave 5")
    val temperatures = listOf(32, 50, 100, 212)
    println(convertFahrenheitToCelsius(temperatures))

    println("Opgave 6")
    greetPerson("Neil", {name -> "I love $name"})
    greetPerson("Neil", {name -> "Dear $name"})

}

// Write variables to represent a rectangle:
//
//Height of 8.5
//
//Width of 5.5
//
//Create a function that computes the area and the perimeter of the rectangle and print the results

fun areaAndPerimeterOfRectangle (height: Double, width: Double): String {
    val area: Double = width * height
    val perimeter: Double = 2 * (area)

    return "Computed area: $area. Computed perimeter: $perimeter"
}


// Write a Kotlin function that takes two integers and then prints
//
//the sum
//
//the difference
//
//the product
//
//the average
//
//the distance (the difference between integer, can only be positive)
//
//the maximum (the larger of the two integers)
//
//the minimum (smaller of the two integers)
//The two inputs should come from user input


fun twoIntegers (integer1: Int, integer2: Int): String {
    val sum = integer1 + integer2
    val difference = integer1 - integer2
    val average = sum / 2
    val maximum = listOf(integer1, integer2).max()
    val minimum = listOf(integer1, integer2).min()

    return "sum: $sum, difference: $difference, average: $average, maximum: $maximum, minimum: $minimum"
}

// Write a function that uses the filter function to filter all numbers of the list below greater than 10

fun filterFunc (): List<Int> {
    val prices = mutableListOf(3, 6, 87, 99, 100, 101, -6)

    return prices.filter { num -> num > 10 }
}


// Write a function that takes an array of strings and returns an array with each strings length - if the strings has a length above 5 otherwise return 0 on the index.

fun findStringLength (list: List<String>): List<Int> {

    return list.map { element -> when {element.length > 5 -> element.length else -> 0}}

}

// Write a function that takes a list of degrees in fahrenheit and returns and array with each degree in celcius.
//
//Hint: Use the map function.

fun convertFahrenheitToCelsius (list: List<Int>): List<Double> {
    return list.map { element -> (element - 32) / 1.8 }
}

// Define a function called greetPerson.
//
//It should take two parameters:
//
//A String representing the person's name.
//
//A function ((String) -> String) that generates the greeting message.
//
//The function should print the generated greeting.
//
//Test the greetPerson function by:
//
//Passing a lambda function that adds "Hello" before the name.
//
//Passing a lambda function that adds "Welcome, dear" before the name.

fun greetPerson (name: String, greeting: (String) -> String) {
   println(greeting("$name"))
    println(greeting("$name"))
}