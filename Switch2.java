public class Switch2 {
    public static void main(String [] args){
        //char x='A';     //prints 65 (65 = char A)
        //int x=65;          //prints 65
        //int x=65536;        //prints wrong
        //byte x=65;          //prints 65 ((65 = char A))
        short x=66 ;      //prints 66 (66 = char B)
        //boolean x =true;  //compilation error. The switch statement in Java does not support boolean values
        /*String x="A";
        double x=65.0; */      //compilation errors because the switch statement only supports char, byte, short, and int data types for its cases.
 

        switch(x){
        case 'A' : System.out.println("65 ");break;
        case 'B' : System.out.println("66 ");break;
        case 'C' : System.out.println("67 ");break; 
        default : System.out.println("wrong ");
        }
   
    }
}
