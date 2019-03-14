package primefactors.main

class PrimeFactors {
    fun factorize(numberToFactorize: Int): ArrayList<Int> {
        val primeFactors: ArrayList<Int> = arrayListOf()
        while (true) {
            val aFactor = findAFactor(numberToFactorize)

            primeFactors.add(aFactor)
            numberToFactorize = numberToFactorize / aFactor
        }
        return primeFactors
    }


    fun findAFactor(number: Int): Int {
        for (i in 2..number) {
            if (number % i == 0) {
                return i;
            }
        }
        return number
    }
}