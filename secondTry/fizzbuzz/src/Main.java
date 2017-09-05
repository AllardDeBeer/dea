public class Main {
    public static void main(String[] args) {
        int fizz = 2;
        int buzz = 3;
        int start = 1;
        int end = 100;
        for (int counter = start; counter <= end; counter++) {
            if (counter % (fizz * buzz) == 0) System.out.println("FizzBuzz");
            else if (counter % fizz == 0) System.out.println("Fizz");
            else if (counter % buzz == 0) System.out.println("Buzz");
            else System.out.println(counter);
        }

    }
}
