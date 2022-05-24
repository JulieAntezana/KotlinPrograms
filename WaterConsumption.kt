/*
The challenge:
Each day a family consumes 15 liters of water.
Given the number of years as input, you need to calculate and output the amount of water consumed in that period.

Sample Input
5

Sample Output
27375

The water consumption in 5 years would be: 5*365*15 = 27375
*/

// begin with main
fun main(args: Array<String>) {
    // create variable to read user input
    var years = readLine()!!.toInt()
    // print the result of operator expression
    println(years*365*15)
    
}
