import java.util.Random;

public class RandomeNumbersOdd {
    public static void main(String[] args) {
        Random random = new Random();
        
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(101); 
            
            if (randomNumber % 2 != 0) { 
                System.out.println(randomNumber);
            }
        }
    } 
}
