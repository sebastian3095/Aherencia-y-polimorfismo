
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Main {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        //calc normal
        CalculadoraNormal calculadoraNormal = new CalculadoraNormal();

        System.out.println("Cliente calculadora normal:\n");
        
        System.out.print("Digite numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite numero 2: ");
        int numero2 = scanner.nextInt();

        int sumaNormal = calculadoraNormal.sumarEnteros(numero1, numero2);
        System.out.println("Suma: "+sumaNormal);

        int restaNormal = calculadoraNormal.restarEnteros(numero1, numero2);
        System.out.println("Resta: "+restaNormal);

        int multiplicacionNormal = calculadoraNormal.multiplicarEnteros(numero1, numero2);
        System.out.println("Multiplicacion: "+multiplicacionNormal);

        int divisionNormal = calculadoraNormal.dividirEnteros(numero1, numero2);
        System.out.println("Division: "+divisionNormal);    
        
        double raizNormal = calculadoraNormal.calcularRaizCuadrada(numero1);
        System.out.println("Raiz: "+raizNormal);
      
        
        
        //calc especial
        CalculadoraEspecial calculadoraEspecial = new CalculadoraEspecial();

        System.out.println("\nCliente calculadora especial:\n");
        
        System.out.print("Digite numero 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite numero 2: ");
        int num2 = scanner.nextInt();

        int sumaEspecial = calculadoraEspecial.sumarEnteros(num1, num2);
        System.out.println("Suma: "+sumaEspecial);

        int restaEspecial = calculadoraEspecial.restarEnteros(num1, num2);
        System.out.println("Resta: "+restaEspecial);

        int multiplicacionEspecial = calculadoraEspecial.multiplicarEnteros(num1, num2);
        System.out.println("Multiplicacion: "+multiplicacionEspecial);
         
        int divisionEspecial = calculadoraEspecial.dividirEnteros(num1, num2);
        System.out.println("Division: "+divisionEspecial);
        
        double raizEspecial = calculadoraEspecial.calcularRaizCuadrada(num1);
        System.out.println("Raiz: "+raizEspecial);
    }

}
