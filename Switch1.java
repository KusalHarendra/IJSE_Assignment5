class Switch1{
   public static void main(String [] args){
        //int x = 1; //prints 1 2 3
        //int x = 2; //prints 2 3
        //int x = 3; //prints 3
        //int x = 4; //prints 4 3 2 1
        int x = 0; //prints 4 3 2 1
       //int x = 5; //prints 4 3 2 1

        switch(x){
            default : System.out.print("4 ");
            case 1 : System.out.print("1 ");
            case 2 : System.out.print("2 ");
            case 3 : System.out.print("3 "); 
        }
   }
}