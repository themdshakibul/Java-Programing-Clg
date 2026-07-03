public class IfElseDemo {
    /*
        Simple if else statement
        if-else statement
        if-else-if ladder
        Nested if-statement
    */

    public static void main(String[] args) {
        //  initialize a variable with int value. if the variable is even the print even.

        int num = 10;
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        /*
            mark, mark >= 90 A+
            mark <90 and mark > 80 > a
            mark < 80 and mark > 70 B
            not applicable
        */
        int mark =69;
        if(mark >= 90){System.out.println("A+");}
        else if(mark > 80){System.out.println("A-");}
        else if(mark > 70){System.out.println("B");}
        else{System.out.println("not applicable");}



        // Nested if els statement

        int n = 8;

        if(n >= 0){
            if(n % 2 == 1){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }else{
            System.out.println("Negative");
        }



        // Switch statement


        int number = 13;

        switch ((number % 2)){
            case 0:
                System.out.println("Event number the switch");
                break;
            default:
                System.out.println("Odd number the switch");
        }

    }
}