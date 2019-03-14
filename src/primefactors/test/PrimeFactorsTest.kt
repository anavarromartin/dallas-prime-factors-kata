package primefactors.test

import org.junit.Test
import primefactors.main.PrimeFactors
import kotlin.test.assertEquals

class PrimeFactorsTest {

    @Test
    fun `should return single prime number when input is prime`() {
        assertEquals(arrayListOf(2), PrimeFactors().factorize(2))
        assertEquals(arrayListOf(3), PrimeFactors().factorize(3))
    }

    @Test
    fun `should return multiple factors when input is composite of primes`() {
        assertEquals(arrayListOf(2,2), PrimeFactors().factorize(4))
        assertEquals(arrayListOf(2,3), PrimeFactors().factorize(6))
        assertEquals(arrayListOf(2,2,3), PrimeFactors().factorize(12))

    }
}