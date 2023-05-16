public class Switch4 {
    public static void main(String args[]){
        int a=1;
        final int b=2;
        final int c;
        c=3;
        final char d='A';
        final char e='B';
        int x=1;
        
        switch(x){
            case 65: System.out.println();      //Legal 
            //case a: System.out.println("x = a");         //This line will cause a compilation error. The value of case must be a constant expression, and a is not a constant because its value can change. 
            case b: System.out.println();           //legal. b is a final variable(constant)
            //case c: System.out.println();           //legal. c is a final variable(constant)
            //case f: System.out.println();           // ilegal.compilation error. The variable f is not declared or initialized
            //case e: System.out.println();           //legal
            //case 'A': System.out.println();         //legal 
            //case 1.0: System.out.println();         //illegal
            case (char)66: System.out.println();    //legal

        }
     }
       
}
