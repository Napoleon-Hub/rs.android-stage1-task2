package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val massOfCharArray : CharArray = inputString.toCharArray()
        var resultString = ""
        var contOfString = ""
        var index = 0
        var counter = 0
        var decision : Boolean = true
        var counter1 = 1
        for (alp in 'a'..'z'){
            for (elem in massOfCharArray){
                if (elem == alp || elem == alp.toTitleCase()) break
                if (counter1 == massOfCharArray.size) decision = false
                counter1++
            }
            counter1 = 1
        }
        val massOfStringArray : ArrayList<String> = arrayListOf(" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",
            " "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "
            ," "," "," "," "," "," ")
        if (decision){
            for(elem in massOfCharArray){
                if(elem == ' ') {
                    if (contOfString == "") massOfStringArray[index] = contOfString
                    else massOfStringArray[index] = counter.toString() + contOfString
                    counter = 0
                    index++
                    contOfString = ""
                }
                else if (elem == 'a'|| elem == 'o' || elem == 'u' || elem == 'e' || elem == 'i' || elem == 'y') {
                    contOfString += elem.toTitleCase()
                    counter++
                } else contOfString += elem
            }
            massOfStringArray[index] = counter.toString() + contOfString
            for(number in '0'..'6'){
                for (elem in massOfStringArray){
                    if(elem == " ") break
                    val massElemChar  = elem.toCharArray()
                    if(elem != ""){
                        if (massElemChar[0] == number){
                            resultString += if (resultString == "") elem
                            else " $elem"
                        }
                    }
                }
            }
        } else{
            for(elem in massOfCharArray){
                if(elem == ' ') {
                    if (contOfString == "") massOfStringArray[index] = contOfString
                    else {
                        massOfStringArray[index] = counter.toString() + contOfString
                        counter = 0
                        index++
                        contOfString = ""
                    }
                }
                else if (elem == 'b'|| elem == 'c' || elem == 'd' || elem == 'g' || elem == 'h' || elem == 'j'
                    || elem == 'k'|| elem == 'l'|| elem == 'm'|| elem == 'n'|| elem == 'p'|| elem == 'q'|| elem == 'r'|| elem == 's'
                    || elem == 't'|| elem == 'v'|| elem == 'w'|| elem == 'x'|| elem == 'z'|| elem == 'B'|| elem == 'C'|| elem == 'D'
                    || elem == 'f'|| elem == 'F'|| elem == 'G'|| elem == 'H'|| elem == 'J'|| elem == 'K'|| elem == 'L'|| elem == 'M'
                    || elem == 'N'|| elem == 'P'|| elem == 'Q'|| elem == 'R'|| elem == 'S'|| elem == 'T'|| elem == 'V'|| elem == 'W'
                    || elem == 'X'|| elem == 'Z') {
                    contOfString += elem.toTitleCase()
                    counter++
                } else if(elem != '\n') contOfString += elem
            }
            if(contOfString != "") massOfStringArray[index] = counter.toString() + contOfString
            for(number in '0'..'8'){
                for (elem in massOfStringArray){
                    if(elem == " ") break
                    val massElemChar  = elem.toCharArray()
                    if(elem != ""){
                        if (massElemChar[0] == number){
                            resultString += if (resultString == "") elem
                            else " $elem"
                        }
                    }
                }
            }

        }
        return resultString
    }
}
