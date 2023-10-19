public class ComputeMetode {

    // Convert Fahrenheit to Celsius
    public double fToC(double degreesF) {
        return (degreesF - 32) * 5.0 / 9.0;
    }

    // Compute the hypotenuse of a right triangle
    public double hypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    // Simulate the roll of two dice and return their sum
    public int roll() {
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;
        return die1 + die2;
    }
}
