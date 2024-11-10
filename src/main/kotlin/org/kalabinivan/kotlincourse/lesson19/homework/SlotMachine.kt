package org.kalabinivan.kotlincourse.lesson19.homework

open class SlotMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean,
    private var osIsLoaded: Boolean,
    val games: List<String>,
    val checkController: Boolean,
    private var balance: Double,
    private var owner: String,
    val techSupportPhone: String) {

    private var pin = "1111"


    fun turnOn(isOn: Boolean) {
        this.isOn = true
        loadOs()
    }

    fun turnOff(isOn: Boolean) {
        this.isOn = false
        shutDownOs()
    }

    private fun loadOs() {
    }

    private fun shutDownOs() {

    }

    fun listOfGames(games: List<String>): List<String> {
        return games
    }

    fun loadGame(games: List<String>, game: String): String {
        games.firstOrNull { it == game }
        return "Запускаю $game"
    }

    fun payForGame(cash: Int) {
        balance += cash
    }

    protected fun openSafe(pin: String, balance: Int): Int {
        if (pin != this.pin) throw Exception("Wrong Pin")
        return balance
    }

    protected fun congrat(balance: Int, prize: Int): String {
        if (prize < balance)
            {
            return "Ваш выигрыш составил $prize рублей "
        }
        return "Недостаточно средств. Обратитесь к администрации"
    }
}
