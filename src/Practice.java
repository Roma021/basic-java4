import java.util.Random;
public class Practice {

    public static void main(String[] args) {
        Random r = new Random();
        for (int x = 1; x <= 6; x++) {
            int randomNum = 1 + r.nextInt(6);
            System.out.println("Random Number: " + randomNum);
        }
        for (int y = 1; y < 11; y++) {
            System.out.println("Count is: " + y);


        }
    }
}
