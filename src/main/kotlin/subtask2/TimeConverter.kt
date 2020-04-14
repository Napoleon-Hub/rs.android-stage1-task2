package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        var timeInMinutes = ""
        var timeInHours = ""
        if (hour.toInt() > 24 || minute.toInt() > 60) return ""
        if (minute == "00") return convertHourToWord(hour, minute) + " o' clock"
        if (minute == "15") return "quarter past " + convertHourToWord(hour, minute)
        if (minute == "30") return "half past " + convertHourToWord(hour, minute)
        if (minute == "45") return "quarter to " + convertHourToWord(hour, minute)
        return minutesInThisHour(minute) + convertHourToWord(hour, minute)
    }

    private fun convertHourToWord(hour: String, minute: String): String {
        var converter = ""
        if (minute.toInt() in 0..30) {
            when (hour.toInt()) {
                1 -> converter = "one"
                2 -> converter = "two"
                3 -> converter = "three"
                4 -> converter = "four"
                5 -> converter = "five"
                6 -> converter = "six"
                7 -> converter = "seven"
                8 -> converter = "eight"
                9 -> converter = "nine"
                10 -> converter = "ten"
                11 -> converter = "eleven"
            }
        } else {
            when (hour.toInt()) {
                1 -> converter = "two"
                2 -> converter = "three"
                3 -> converter = "four"
                4 -> converter = "five"
                5 -> converter = "six"
                6 -> converter = "seven"
                7 -> converter = "eight"
                8 -> converter = "nine"
                9 -> converter = "ten"
                10 -> converter = "eleven"
            }
        }
        return converter
    }

    private fun minutesInThisHour(minute: String): String {
        var converter = ""
        val constant1 = " minutes to "
        val constant2 = " minutes past "
        when (minute) {
            "01" -> converter = "one$constant2"
            "05" -> converter = "five$constant2"
            // And so on
            "38" -> converter = "twenty two$constant1"
            "58" -> converter = "two$constant1"
        }
        return converter
    }
}
