

package polimorfismo;


public class CalculadoraEspecial implements InterfazCalculadora{


    @Override
    public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2/2;
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return numero1 - numero2/2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return (numero1 * numero2)/2;
    }

    @Override
    public int dividirEnteros(int numero1, int numero2) {
        return (numero1 / numero2)/ 2;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        return Math.sqrt(numero1)/ 2;
    }
    

    
}
