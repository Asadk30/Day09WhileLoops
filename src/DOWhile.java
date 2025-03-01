public class DOWhile {
    public static void main(String[] args) {
        System.out.println("FOR LOOP");
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("WHILE LOOP");
        int j = 0;
        while (j < 6) {
            System.out.println(j);
            j++;
        }

        System.out.println("DO-WHILE LOOP");
        int h = 0;
        do {
            System.out.println(h);
            h++;
        } while (h < 6);
    }
}