import java.util.*;

 public class RandomNumbers1{
    public static void main(String args[]){
        Random random = new Random();

        for(int i = 0; i < 10; i++){ 
            int value = random.nextInt(100); 
            System.out.println(value);
        }
    } 
}
