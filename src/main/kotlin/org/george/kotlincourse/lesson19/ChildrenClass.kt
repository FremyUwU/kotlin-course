package org.george.kotlincourse.lesson19





    class ChildrenClass(
        val privateVal: String,
        protectedVal: String,
        // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
        publicVal: String //потому что он в BaseClass объявлен как val, ChildrenClass - наследник BaseClass
    ) : BaseClass(privateVal, protectedVal, privateVal) {

        // объясни, почему в main() доступна функция getAll() хотя её здесь нет -> ChildrenClass - наследник BaseClass

        // проверь, что выводится на печать при вызове функции printText()
        // и объясни, почему не происходит переопределение метода privatePrint()
        private fun privatePrint() {
            println("Печать из класса ChildrenClass")
        }
        fun setProtectedField(value : String) {
            protectedField = value
        }
    }


