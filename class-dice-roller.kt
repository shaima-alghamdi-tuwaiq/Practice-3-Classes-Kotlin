fun main() {
    //create an object 
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")
}

class Dice (val numSides: Int) { // Primary Constructor 

    fun roll(): Int {
        // generate a random number between 1 and 6
        return (1..numSides).random()
    }
}
