public class Main {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i < 100; i++) {
            counter++;
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 7 == 0) {
                System.out.println("Bazz");
            } else {
                System.out.println(counter);
            }
        }
    }
}