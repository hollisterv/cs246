//Calculates how much disneyland will cost
fun firstCalculation(){
    var dailyTicket = 124
    var nightlyStay = 475
    var dailyCost = 150

    //finding the total price of one person for the ticket and stay
    var totalTicket = dailyTicket * 3
    var totalNightly = nightlyStay * 3 

    //finding total price for one person
    var totalMe = totalTicket + totalNightly

    //total price for two people
    var totalPrice = totalMe * 2

    //total price for two people and eating and souvenirs
    var totalUs = totalPrice + (dailyCost * 3)

    println("The total cost for you and Charlie is " + totalUs + " it is expensive possible")
    println("Now what do you need to be saving each day for the next 12 months?\n")

    //sending to second function
    budgetSavings(totalUs)
}

//calculates the monthly savings budget to pay for disneyland
fun budgetSavings(totalUs: Int){
    var monthlySavings = totalUs / 12
    println("We have concluded that you will be saving " + monthlySavings + " each month.")
    println("feel free to buy those churros and mickey ears! you deserve it this year!")

}


fun main(){
    //introduction paragraph
    val intro1 = "You are taking a trip to Disneyland! Congratulations! You plan to have \nyour visit for three days. "
    val intro2 = " With you is your significant other, we will call\n them Charlie."
    val intro3 = "Charlie really wants to stay in the Disney Grand Hotel for \nextra Disney magic. "
    val intro4 = "You have agreed to go one year from today. Since it is\n so expensive you decide to make a monthly"
    val intro5 = "budget so you can save as you go!\n Lets break down the prices! It costs $124 a day to go to the parks. "
    val intro6 = "It costs $475\n a night to sleep at the grand hotel. Not to mention, you will probably be spending\n "
    val intro7 = "about $150 a day on food and souvenirs.\n\n"

    println(intro1 + intro2 + intro3 + intro4 + intro5 + intro6 + intro7)

    //sending to first function
    firstCalculation()
}