public class HomeWork {
    public static void main(String[] args) {
        countdownTimer(11);
    }

    public static void countdownTimer(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }

    }
}

/*
Create a method that implements a countdown timer. The method should take an integer and use a while loop
to count down from that number until it gets to 0. Print each number (this method should be void). Lastly,
invoke this method in your main() method.
 */