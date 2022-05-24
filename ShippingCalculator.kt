/*
The challenge:
You are working on a eCommerce website and need to make a shipping cost calculator based on the order amount.
The store uses the following cost structure:
For orders in the US:
- $75+ orders have free shipping
- orders less than $75 have a shipping fee of 10% of the total order amount.

For international orders, there is a 15% shipping fee, with a maximum of $50. This means that the maximum shipping fee for an international order is $50.

You need to complete the given shippingCost() function, which takes the order amount and a Boolean indicating whether the order is international or not, and returns the shipping cost for that order.
The return amount should be a Double.

Sample Input:
140.0
true

Sample Output:
21.0
The order is for $140 and is international. So, the shipping cost would be 15%, which is $21.
*/

// define function to calculate shipping costs with two arguments
// the amount argument is a double (float) type and the international rate argument is Boolean
fun shippingCost(amount: Double, international: Boolean): Double {

// set variable for the cost as a double
var cost = 0.0   
    // calculate the cost to ship international, 15% of the order amount, up to $50
    if (international) {
        cost = if (amount*0.15 < 50.0) amount*0.15 else 50.0
    }
    // calculate the cost to ship domestic, 10% of the order amount, or free if order is $75 or more.
    else if(amount < 75.0) {
        cost = amount*0.1
    }    
    return cost  
}

// begin the program with main 
fun main(args: Array<String>) {
    // set a total variable to read user input as a float
    val total = readLine()!!.toDouble()
    // set an international to read user input as a Boolean
    val international = readLine()!!.toBoolean()
    // call the shippingCost function, calculate the fee and print
    println(shippingCost(total, international))
}
