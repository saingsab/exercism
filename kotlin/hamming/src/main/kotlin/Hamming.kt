object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Any {
        require(leftStrand.length == rightStrand.length) { "left and right strands must be of equal length" }

        var distance = 0
        for (i in leftStrand.indices ) {
            if (leftStrand[i] != rightStrand[i]) {
                distance++
            }
        }
        return distance
    }
}
