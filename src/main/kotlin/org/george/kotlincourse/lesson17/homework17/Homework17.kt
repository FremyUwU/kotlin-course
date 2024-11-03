package org.george.kotlincourse.lesson17.homework17

class Homework17 {
}

//Задание 2

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class MaterialFirst(): Materials() {
    fun toTheBottom(material : String) {
        val currentMaterials = extractMaterial().toMutableList()
        addMaterial(material)
        currentMaterials.forEach{addMaterial(it)}
    }
}

class OneAfterOne(): Materials() {
    fun oneAfterOne(materials: List<String>) {
        val currentMaterials = extractMaterial()
        val result  = mutableListOf<String>()
        val maxSize = maxOf(materials.size, currentMaterials.size)

        for (m in 0 until maxSize){
            if(m < materials.size) addMaterial(materials[m])
            if(m < currentMaterials.size) addMaterial(currentMaterials[m])
        }
    }
}

class Alphabetical(): Materials() {
    fun addAlphabetically(material: String) {
        val currentMaterrials = extractMaterial().toMutableList()
        currentMaterrials.add(material)
        currentMaterrials.sort()
        currentMaterrials.forEach { addMaterial(it) }
    }
}





