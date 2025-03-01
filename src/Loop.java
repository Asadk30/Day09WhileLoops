public class Loop {
    public static void main(String[] args) {
        int randomNum = (int) Math.floor(Math.random() * 101);
        System.out.println("Random Num: " + randomNum);
        while (randomNum % 5 != 0) {
            System.out.println(randomNum);
            randomNum = (int) Math.floor(Math.random() * 101);
        }
        System.out.println("Divisible by 5: " + randomNum);

        int randomNum2 = (int) Math.floor(Math.random() * 51);
        System.out.println("random num: " + randomNum2);
        while (randomNum2 % 3 != 0);{
            System.out.println(randomNum2);
            randomNum2 = (int) Math.floor(Math.random() * 51);
            {
                System.out.println("divisible by 3" + randomNum2);
            }
        }
    }
}
