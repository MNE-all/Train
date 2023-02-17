class Train {
    private val direction = Direction()
    private val soldTickets: Int = (5..201).random()
    private var inWay = false
    private var wagons = mutableListOf<RailwayCarriage>()

    init {
        println("Шаг 1 - Создать направление")
        println("Маршрут поезда ${direction.get()}")

        println("Шаг 2 - Продать билеты")
        println("Продано $soldTickets билетов")
        do {
            wagons.add(RailwayCarriage())
        } while (wagons.sumOf { i -> i.seatAmount } < soldTickets)


        println("Шаг 3 - Собрать состав")
        var tickets = soldTickets
        for (wagon in wagons) {
            tickets -= wagon.seatAmount
            println("Вагон №${wagons.indexOf(wagon)} \tВместимость ${wagon.seatAmount} чел. " +
                    "\tЗанято мест ${if (tickets < 0) wagon.seatAmount + tickets else wagon.seatAmount}")
        }
        println("Поезд из ${wagons.count()} вагона(ов) готов к отправке")
    }

    fun send(){
        if (!inWay){
            inWay = true
            println("4. Поезд ${direction.get()}, состоящий из ${wagons.count()} вагонов отправлен.")

        }
        else {
            println("Поезд уже в пути")
        }
    }
}
