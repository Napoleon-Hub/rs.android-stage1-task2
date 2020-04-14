package subtask1

import java.util.*


class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val textThisMonth = textOfMonth(day, month)
        return if (textThisMonth == "Такого дня не существует") "Такого дня не существует"
        else (day + textThisMonth + getDayOfWeek(day, month, year))
    }

    private fun getDayOfWeek(day: String, month: String, year: String): String {
        var dayOfWeek = ""
        val newCal: Calendar = Calendar.getInstance()
        newCal[year.toInt(), (month.toInt() - 1), day.toInt(), 0, 0] = 0
        newCal.time = newCal.time
        when (newCal[Calendar.DAY_OF_WEEK]) {
            1 -> dayOfWeek = "воскресенье"
            2 -> dayOfWeek = "понедельник"
            3 -> dayOfWeek = "вторник"
            4 -> dayOfWeek = "среда"
            5 -> dayOfWeek = "четверг"
            6 -> dayOfWeek = "пятница"
            7 -> dayOfWeek = "суббота"
        }
        return dayOfWeek
    }

    private fun textOfMonth(day: String, month: String): String {
        var wordOfMonth = ""
        when (month.toInt()) {
            1 -> if (day.toInt() in 1..31) wordOfMonth = " января, "
            2 -> wordOfMonth = if (day.toInt() in 1..28) " февраля, " else "Такого дня не существует"
            3 -> if (day.toInt() in 1..31) wordOfMonth = " марта, "
            4 -> if (day.toInt() in 1..30) wordOfMonth = " апреля, "
            5 -> if (day.toInt() in 1..31) wordOfMonth = " мая, "
            6 -> if (day.toInt() in 1..30) wordOfMonth = " июня, "
            7 -> if (day.toInt() in 1..31) wordOfMonth = " июля, "
            8 -> if (day.toInt() in 1..31) wordOfMonth = " августа, "
            9 -> if (day.toInt() in 1..30) wordOfMonth = " сентября, "
            10 -> if (day.toInt() in 1..31) wordOfMonth = " октября, "
            11 -> if (day.toInt() in 1..30) wordOfMonth = " ноября, "
            12 -> if (day.toInt() in 1..31) wordOfMonth = " декабря, "
            else -> wordOfMonth = "Такого дня не существует"
        }
        return wordOfMonth
    }
}
