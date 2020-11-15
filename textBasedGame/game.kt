fun gamePlay() {
    val story1 = "You lie awake on a sturdy camping cot trying to see into the dark night. \n"
    val story2 = "Looking directly above you, you can see through the uncapped \n"
    val story3 = "tent into the stars. Wondering how you got here, you start to search your\n"
    val story4 = "surroundings. As you sit up, you look directly in front of you. There \n"
    val story5 = "is a backpack full of survival supplies and an unzipped window. \n"
    val story6 = "To your left is a zipped door and to your right is an unzipped door. \n"
    val story7 = "Behind you, the window is zipped. What do you do?\n"

    println(story1 + story2 + story3 + story4 + story5 + story6 + story7)

    var win = false
    do {
        println("(a) pick up the backpack.")
        println("(b) look through the unzipped window.")
        println("(c) unzipp the door to your left.")
        println("(d) walk through the door to your right.")
        println("(e) unzip the window behind you")

        var response = "d"

        if (response == "a"){
            println("a")
            println("You picked up the backpack. It feels like it weighs a million pounds. You put it back down.")
            win = false
            println("YOU LOSE!! My middle school self could have told you not to pick up the backpack.")
        } else if (response == "b"){
            println("b")
            println("A ghost popps up to the window and scares you to death.")
            win = false
            println("YOU LOSE!! Who would have guessed a ghost would have shown up?!")
        } else if (response == "c"){
            println("c")
            println("You unzip the door and walk out with confidence, but unknowingly you fall right off a cliff.")
            win = false
            println("YOU LOSE!! Why did you not look down. ya weirdo!")
        } else if (response == "d"){
            println("d")
            println("You walk through the open door and look up to see the ")
            println("moon spilling its light on you through the trees.")
            win = true
            println("Yay! you beat the first level!")
        } else if (response == "e"){
            println("e")
            println("You turn around to unzip the window. As you were doing this a wolf sneaks into your tent")
            win = false
            println("YOU LOSE!! Do not let you guard down!")
        }

    }while (win != true)

    restartGame()

}

fun restartGame(){
    println("Thanks for playing! Would you like to play again? (y/n)")
    var replay = "n"
    println("n")
    if (replay == "y"){
        println("Let us play again!")
        gamePlay()
    } else if (replay == "n"){
        println("Thank you for playing! Have a nice day!")
    }
}

fun main() {
    //introduction to the game
    val intro1 = "Welcome to ONE ROOM AT A TIME!\n"
    val intro2 = "A text-based puzzle game that walks you through room by room in \n"
    val intro3 = "order to win. You must figure out the right answer \n"
    val intro4 = "to progress through the story, and if you guess wrong. \n"
    val intro5 = "Well, you will find out pretty quickly. We will be providing you \n"
    val intro6 = "with some possible answers, please type on the corresponding key to see \n"
    val intro7 = "if you get it right. If you need a hint, type H. Are you ready to play? (y/n)\n"

    println(intro1 + intro2 + intro3 + intro4 + intro5 + intro6 + intro7)

    //simulating the user saying yes
    println("y\n")
    var startGame = "y"
    if (startGame =="y"){
        gamePlay()
    }else{
        println("You are not ready yet? just choose y when you are ready!")
    }

}