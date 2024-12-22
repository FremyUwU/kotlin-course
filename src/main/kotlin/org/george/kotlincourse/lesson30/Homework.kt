package org.george.kotlincourse.lesson30

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).
enum class TestStatuses() {
    PASS,
    BRPKEN,
    FAILURE,
}
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
enum class RealEstateTypes (val HumanReadable : String) {
    STUDIO("Студия"),
    ONE_ROOM_APT("Однокомнатная квартира"),
    TWO_ROOM_APT("Двухкомнатная квартира"),
    THREE_ROOM_APT("Трехкомнатная квартира"),
    LUXUTY_APT("Квартира с четырьмя и более комнатами"),
    VILLA("Вилла"),
    HOUSE("Дом"),
    ;

}
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес(массу) планеты.
enum class Planets(val distance : Double, val weight : Double) {
    MERCURY(0.387, 3.3e23),
    VENUS(0.723, 4.867e24),
    EARTH(1.0, 5.974e24),
    MARS(1.524, 6.42e23),
    JUPITER(5.203, 1898e24),
    SATUTN(9.582, 568e24),
    URANUS(19.218, 86.8e24),
    NEPTUNE(30.070, 102e24),

}
//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке возрастания длины названия enum.
fun printReaTitle(){
    RealEstateTypes.entries
        .sortedBy {it.name.length}
        .forEach { println(it.HumanReadable) }
}
//Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает Enum со статусом прохождения теста
// в зависимости от того как выполнится принятая лямбда.
// Если без исключений - pass, если будет AssertionError - failure, прочие исключения  - broken.

//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.