package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val musOfCharArray = a.toCharArray()
        val musOfCharArray2 = b.toCharArray()
        val musOfCharArrayResult = CharArray(musOfCharArray2.size)
        var index = 0
        for (elem in musOfCharArray) {
            for (element in musOfCharArray2) {
                if (elem.toTitleCase() == element) {
                    musOfCharArrayResult[index] = element
                    index++
                    continue
                }
            }
        }
        return if (musOfCharArrayResult.contentEquals(musOfCharArray2)) "YES"
        else "NO"
    }
}
