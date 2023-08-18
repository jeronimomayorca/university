import java.io.PrintStream;
import java.util.Scanner;

import static functions.isMultiple.isMultiple;

public class main {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[]args){
        int num1=0;
        int num2=0;
        boolean isMultiple=false;
        screen.println("ingrese el primer numero");
        num1= keyboard.nextInt();
        screen.println("ingrese el segundo numero");
        num2= keyboard.nextInt();

        //isMultiple=multiplos.isMultiple(num1,num2);

        if(isMultiple(num1,num2))
            screen.println(num1 +" es un multiplo de "+num2);
        else
            screen.println(num1+" No es multiplo de "+num2);

    }


}