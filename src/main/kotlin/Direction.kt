val directions = arrayOf("Чудово",
    "Лебяжье", "Краснофлотск", "Котлы",  "Усть-Луга", "Лигово", "Мга",
    "Веймарн", "Ивангород", "Сланцы", "Псков", "Новгород", "Шапки", "Тосно", "Дно")


class Direction() {

    private val startPoint = directions.random()
    private val endPoint = endPoint()

    fun get(): String {
        return "$startPoint - $endPoint"
    }

    private fun endPoint(): String {
        var point: String
        do{
            point = directions.random()
        }while (point == startPoint)
        return point
    }
}