fun main() {

    //welcome statement describing purpose of program
    val welcome1 = "Welcome to the Quilt block row calculator. Here you will be able to\n"
    val welcome2 = "calculate how many blocks you want in a specific width row. We will be adding\n"
    val welcome3 = "seam allowance to our calculations so you won't have to! Just follow the steps\n"
    val welcome4 = "to ensure your perfect calculation.\n"
    println(welcome1 + welcome2 + welcome3 + welcome4)

    //asking for how many blocks in a row 
    //and asks for how long you want the quilt
    println("How wide (in inches) would you like the quilt?")
    //adding in variable instead of user input because i dont know how to run it
    //on the output section
    var wide = 40
    println(wide) //pretending that this is user input

    //asking for how many squares in the row
    println("How many squares would you like in the row?")
    var squares = 10
    println(squares)

    //this part is the calculation
    //this calculation tells the user how large their blocks need to be
    val seam = 0.5
    var calculate = (wide / squares) + seam

    //printing the size of the quiltable block to the screen
    val response1 = "We have calculated your result! Your desired quilt width is "
    val response2 = " and you wanted \n"
    val response3 = " squares in this row. You should cut your blocks to be "
    val response4 = " inches, this includes \nyour 1/4 inch seam allowance on both sides."
    println(response1 + wide + response2 + squares + response3 + calculate + response4)

    //continuing with how many rows are needed for the quilt
    //will calculate how many rows needed to finish quilt
    println("\nLet's find out how many rows you need!")
    println("How long (in inches) do you want your quilt to be?")
    var length = 60
    //pretends to receive user response
    println(length)
    
    //calculation
    var totalRows = length / (wide/squares)
    println("\nWe have calculated how many rows will be added to make the " + wide + " X " + length)
    println("quilt! It will take " + totalRows + " rows to complete the quilt!")

    //calculating how many total squares it will take
    var totalSquares = totalRows * squares

    println("\nYou will cut a total of " + totalSquares + " to finish your quilt!") 
}