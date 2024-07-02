
object Acronym {
    fun senitizer(phrase: String): String {
        return phrase.replace("_", "")
                    .split(" ", "-", "_")
                    .filter { it.isNotEmpty() }
                    .map { it.first().uppercaseChar() }
                    .joinToString("")
    }

    fun generate(phrase: String) : String {
        val acronym = senitizer(phrase)
        return acronym
    }
}
