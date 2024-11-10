package org.george.kotlincourse.lesson19

class SlotMachine {
    var color : String = "black" //цвет
    val model : String = "A1b12"    //модель
    private var status : Boolean = false//включен
    private var os : Boolean = false//ОС загружена
    val games = mutableListOf("Battle Toads", "Castlevania")//список доступных игр
    val joyStick : Boolean = true//наличие джойстика
    private var money : Int = 10000//баланс вырученных средств
    var owner : String = "Somebody"//владелец
    val number : String = "8 800 555 35 35"//телефон поддержки.

    fun turnOn() {//включить
        status = true
    }
    fun turnOff() {//выключить
        status = false
    }
    fun osOn() {//загрузить ОС
        os = true
    }
    fun osOff() {//завершить работу ОС
        os = false
    }
    fun games() {//показать список игр
        games.forEach { println(it) }
    }
    fun playGame(game : String) {//включить игру
        if(games.contains(game)) println("Playing " + game)
        else println("There is no such game")
    }
    fun pay(money : Int) {//оплатить игровой сеанс
        this.money += money
    }
    fun getCash(money : Int) : Int {//открыть сейф и выдать наличные
        if(this.money < money){
            println("Not enough cash")
            return 0
        }
        else {this.money -= money
              return money}
    }
    fun getPrize(prize : Int) : Int {//выплатить выигрыш
        if (prize < money) {return prize
            money -=prize}
        else return 0
    }

}