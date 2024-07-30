object CryptoSquare {

    fun ciphertext(plaintext: String): String {

        if (plaintext.isEmpty()) return ""
        // Step 1: Normalize the input
        val normalizedText = plaintext.filter { it.isLetterOrDigit() }.lowercase()

        // Step 2: Determine the number of columns (c) and rows (r)
        val c = kotlin.math.ceil(kotlin.math.sqrt(normalizedText.length.toDouble())).toInt()
        val r = if (c * (c - 1) >= normalizedText.length) c - 1 else c

        // Step 3: Create the rectangle
        val rectangle = List(r) { row ->
            normalizedText.substring(row * c, kotlin.math.min((row + 1) * c, normalizedText.length))
        }

        // Step 4: Read down the columns to form the encoded message
        val encodedMessage = StringBuilder()
        for (col in 0 until c) {
            for (row in 0 until r) {
                if (col < rectangle[row].length) {
                    encodedMessage.append(rectangle[row][col])
                } else {
                    encodedMessage.append(' ')
                }
            }
        }

        // Step 5: Format the encoded message into chunks of r length, separated by spaces
        return encodedMessage.toString().chunked(r).joinToString(" ")
    }

}
