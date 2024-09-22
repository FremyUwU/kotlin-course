package org.george.kotlincourse.lesson5

class Homework5 {
    fun soundAttenuation(intensivity : Double, attenuation : Double?) : Double {
       var attenuation = attenuation ?: 0.5
        return intensivity * attenuation
    }
    fun delivery(price : Double?) : Double {
        var cost : Double = 20.0 // Стоимость доставки, меняется в зависимости от региона
        var price  = price ?: 50.0
        var insurance : Double
        if(price != 50.0){
            insurance = price * 0.005
        } else {
            insurance = 50.0
        }
        return cost + insurance
    }
    fun main() {
    println(soundAttenuation(10.0, 0.7))
    println(soundAttenuation(10.0, null))
    println(delivery(100.0).toString() + "$")
    println(delivery(null).toString() + "$")
    }

}