/*
The challenge:
You are making a car parking software that needs to calculate and output the amount due based on the number of hours the car was parked.
The fee is calculated based on the following price structure:
- the first 5 hours are billed at $1 per hour.
- after that, each hour is billed at $0.5 per hour.
- for each 24 hours, there is a flat fee of $15.

This means, that, for example, if a car parked for 26 hours, the bill should be 15+(2*0.5) = 16.0, because it was parked for 24 hours plus 2 additional hours.

Sample Input:
8

Sample Output:
6.5

Explanation: The first 5 hours are billed at $1/hour, which results in $5. After that, the next 3 hours are billed at $0.5/hour = $1.5.
So, the total would be $5+$1.5 = $6.5
The output should be a Double, even if the amount is a round number.
*/

// begin the program with main
fun main(args: Array<String>) {
    // variable to read user input
    var hours = readLine()!!.toInt()
    // set total value as a float
    var total: Double = 0.0

    // calculate parking fee for up to 5 hours
    if (hours <= 5){
        total = hours * 1.0
    }
    
    // calculate parking fee for more than 5 but less than 24 hours
    else if (hours in 6 until 24){
        total = 5.0 + ((hours -5.0) * 0.5)
    }
    
    // calculate parking fee for more than 24 hours, the daily rate plus $0.50 per hour
    else {
        total = (hours / 24 * 15) + ((hours % 24) * 0.5)
    }
    println(total)
}
