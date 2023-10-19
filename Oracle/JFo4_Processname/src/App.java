public class App {
    public static void main(String[] args) throws Exception {
        ComputeMetode methods = new ComputeMetode();
        System.out.println("Temp in celsius is " + methods.fToC(100.4));
        System.out.println("Hypotenuse is " + methods.hypotenuse(6, 8));
        System.out.println("The sum of the dice values is " + methods.roll());
    }
}
