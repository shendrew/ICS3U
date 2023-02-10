public class Variables {
    public static void main(String[] args) {
        // declare the 3 variables needed in the program
        int value1, value2;
        double answer;

        // assign each variable a starting value
        value1 = 4;
        value2=12;

        // output  to the screen the two values
        System.out.println("The first value is " + value1);
        System.out.println("The second value is " + value2);

        // output to the screen the product of the 2 numbers
        answer = value1 * value2;
        System.out.println(value1 + " x " + value2 + " = " + answer);
    }
}