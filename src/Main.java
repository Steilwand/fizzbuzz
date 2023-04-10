public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        word game to teach kids about division!
        Replacing any number divisible by three (3) with the term "Fizz Buzz!"

        Here's a little programm for doing it in java.
         */

        for(int i = 1; i <= 100; i++){

            if( i % 3 == 0){
                System.out.println("Fizz Buzz!");
                continue;
            }

            System.out.println(i);

        }



    }
}