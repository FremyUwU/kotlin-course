package org.george.kotlincourse.lesson20

abstract class TemperatureRegulatableAndOpenable : Openable, TemperatureRegulatable, ProgrammingDevice() {
    override val maxTemperature: Int
        get() = TODO("Not yet implemented")

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun open() {
        TODO("Not yet implemented")
    }

    override fun setTemperature(temp: Int) {
        TODO("Not yet implemented")
    }

    override fun execute() {
        super.execute()
    }

    override fun programAction(action: String) {
        super.programAction(action)
    }
}