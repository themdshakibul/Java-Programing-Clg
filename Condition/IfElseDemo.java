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
        */
        int mark = 90;
        if(mark >= 90){
            System.out.println("A+");
        }else if(mark < 90 && mark > 80){
            System.out.println("A");
        }else if(mark < 80 && mark > 70){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
    }
}