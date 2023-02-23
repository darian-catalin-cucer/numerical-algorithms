fun sqrt(x: Double, epsilon: Double): Double {
    var guess = x / 2.0
    var prevGuess = 0.0
    while (Math.abs(guess - prevGuess) > epsilon) {
        prevGuess = guess
        guess = 0.5 * (guess + x / guess)
    }
    return guess
}
