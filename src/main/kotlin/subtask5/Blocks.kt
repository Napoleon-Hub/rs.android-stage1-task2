package subtask5

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        lateinit var result: Any
        when (blockB) {
            String::class -> {
                var resultString = ""
                for (elem in blockA) {
                    if (elem is String) {
                        resultString += elem
                    }
                }
                result = resultString
            }
            Int::class -> {
                var resultInt = 0
                for (elem in blockA) {
                    if (elem is Int) {
                        resultInt += elem
                    }
                }
                result = resultInt
            }
            LocalDate::class -> {
                var resultLocalDate : LocalDate = LocalDate.parse("1000-10-10")
                for (elem in blockA) {
                    if (elem is LocalDate) {
                        if(resultLocalDate.isBefore(elem)) resultLocalDate = elem
                    }
                }
                result = resultLocalDate.dayOfMonth.toString() + "." + resultLocalDate.monthValue + "." + resultLocalDate.year
            }
        }
        return result
    }
}
