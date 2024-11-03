package org.george.kotlincourse.lesson14

class Homework14 {
    fun main() {
    //Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
        val testTime = mapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
        println(testTime.values.average())

    //Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
        val testMetas = mapOf<String, Int>("test1" to 1, "test2" to 2, "test3" to 3)
        println(testMetas.keys)

    //В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
        val results = mutableMapOf("test1" to "failed", "test2" to "failed")
        results += "test3" to "failed"

    //Посчитайте количество успешных тестов в словаре с результатами.
        println(results.count({it.value == "passed"}))

    //Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
        val bugs = mutableMapOf("bug1" to "fixed", "bug2" to "fixed", "bug3" to "found")
        println(bugs.filterNot({it.value=="fixed"}))

    //Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
        val websites = mutableMapOf("rutracker.org" to "есть доступ", "discord.com" to "нет доступа", "steam.com" to "есть доступ")
        websites.forEach{println("${it.key} is ${it.value}")}

    //Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
        val websitesPing = mutableMapOf("rutracker.org" to 50, "discord.com" to 150, "steam.com" to 100)
        println(websitesPing.filterValues { it > 100 })

    //В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в строке). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    //
    //Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации), получите значение для "browserType". Ответ не может быть null.
        val cofig = mutableMapOf("browserType" to "amigo", "processor" to "pentium", "OS" to "Windows Vista")
        println(cofig.getOrElse("browserType") { "error" })

    //Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
        val apiVer = mapOf("Minecraft" to "1.5.1 beta", "Terraria" to "1.0", "CubeWorld" to "0.5",)
        val newApiVer = apiVer + ("Deep rock Galactic" to "1.3.7")
        println(newApiVer)

    //Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства), получите настройки для конкретной модели или верните настройки по умолчанию.
        val testSettings = mapOf("huawei" to "a2b7c12", "google pixel" to "f13z12", "iphone" to "jre3")
        println(testSettings.getOrDefault("iphone", "a1b1c1"))
        println(testSettings.getOrDefault("samsung", "a1b1c1"))
    //Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
        val errors = mapOf("InterruptedException" to "program is interrupted", "IndexOutOfBoundException" to "index out of bound")
        println(errors.containsKey("InterruptedException"))
        println(errors.containsKey("IOException"))

    //Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
        //
        //У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
        //
        //Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
        //
        //Объедините два неизменяемых словаря с данными о багах.
        //
        //Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
        //
        //Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
        //
        //Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
        //
        //Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
        //
        //Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
        //
        //Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод, например getNameById(id: String))
        //
        //Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
        //
        //Проверьте, пуст ли словарь с ошибками компиляции тестов.
        //
        //Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
        //
        //Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
        //
        //Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
        //
        //Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
}
}