object Pangram {

    fun isPangram(input: String): Boolean {

        return !('a'..'z').map { it in input.toLowerCase() }.contains(false)
    }
}
