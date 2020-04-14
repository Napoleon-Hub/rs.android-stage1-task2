package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val fibonacciArray : IntArray = intArrayOf(0,1,1,2,3,5,8,13,21,34,55,89,144,233)
        var resultArray : IntArray = IntArray(3)
        for (elem in fibonacciArray.indices){
            if (fibonacciArray[elem]*(fibonacciArray[elem+1]) == n) {
                resultArray = intArrayOf(fibonacciArray[elem],fibonacciArray[elem+1],1)
                break
            }
            if (fibonacciArray[elem]*(fibonacciArray[elem+1]) > n) {
                resultArray = intArrayOf(fibonacciArray[elem],fibonacciArray[elem+1],0)
                break
            }
        }
        return resultArray
    }
}
