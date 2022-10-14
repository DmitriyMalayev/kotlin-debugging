import kotlin.random.Random

fun getRandomInt() = Random.nextInt()

fun main() {
    for (i in 0..4) {
        val random = getRandomInt()
        val isEven = random.rem(2) == 1
        when(isEven) {
            true -> println("$random is even")
            false -> println("$random is odd")
        }
    }

}


// .rem
// Calculates the remainder of truncating division of this value by the other value.
//The result is either zero or has the same sign as the dividend and has the absolute value less than the absolute value of the divisor.