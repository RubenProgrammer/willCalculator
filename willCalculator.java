
import java.util.Scanner;

public class willCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt(); // llama al metodo mas abajo
        int num2 = getInt();
        char operation = getOperation(); //get operation entiende que operador se introduce y se asegura que sea entero CHAR
        int result = calc(num1, num2, operation); // la palabra calc relaciona los valores y operation
        System.out.println(" El resultado de la operacion: " + result);

    }



    public static int getInt(){ //metodo para introducir numero
    System.out.println("Introduzca un numero");
    int num;
    if(scanner.hasNext()){ //devuelve true si introduzco valor
        num = scanner.nextInt();

    } else {
        System.out.println(" No has introducido un numero entero, repite");
        scanner.next();// recursividad--una funcion llama a otra funcion, scanner llama a next.
        num = getInt();

    }
    return num;
}
public static char getOperation(){ // metodo para la operacion
    System.out.println("mete la operacion");
    char operation;
    if(scanner.hasNext()){
        operation = scanner.next().charAt(0);
    } else {
        System.out.println("Ha cometido un error al entrar en la operación. Inténtalo de nuevo.");
        scanner.next();//recursividad
        operation = getOperation();
    }
    return operation;
}
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("La operación no se reconoce. Repite .");
                result = calc(num1, num2, getOperation());//recursividad
        }
        return result;
    }
}


