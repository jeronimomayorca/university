public static void main(String[]args){
        int num1 = 0;
        int num2 = 0;

        screen.println("Ingrese el primer numero");
        num1 = keyboard.nextInt();

        screen.println("Ingrese el segundo numero");
        num2 = keyboard.nextInt();

        isMultiple = functions.isMultiple(num1, num2)

        if (isMultiple)
            screen.println(num1 + " es un multiplo de " + num2);
        else
            screen.println(num1 + " no es multiplo de " + num2);
        }