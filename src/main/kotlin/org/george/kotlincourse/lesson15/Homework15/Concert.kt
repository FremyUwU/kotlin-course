package org.george.kotlincourse.lesson15.Homework15

class Concert(
    var Group : String,
    var Location : String,
    var Price : Int,
    var Capacity : Int
) {
    private var soldTickets : Int = 500

    fun showInfo() {
        println("Gorup: $Group Location $Location Price $Price available tcikets: ${Capacity-soldTickets}")
    }

    fun buyTicket() {
        if (Capacity > soldTickets) {
            soldTickets++
            println("You bought a ticket")
        }else
            println("No available tickets")
    }
}