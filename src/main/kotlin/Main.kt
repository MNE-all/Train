fun main() {
    println("РЖД")
    println("Составление плана поездов:")
    var trains = mutableListOf<Train>()
    var userChoose: String
    do {
        trains.add(Train())
        trains.last().send()


        println("Для продолжения нажмите Enter")
        println("Для выхода введите EXIT")
        userChoose = readln()
    } while (userChoose.uppercase() != "EXIT")
}