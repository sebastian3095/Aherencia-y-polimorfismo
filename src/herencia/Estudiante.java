
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Estudiante extends Persona {
    
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    public Estudiante() {
    }

    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public void calcularPromedio(){
   
        promedioNotas= leerNotas()/numeroMaterias;
        
    }
    
    public double leerNotas(){
        
        double totalNotas=0;
        
        for(int i=0; i<numeroMaterias; i++){
            totalNotas += Double.parseDouble(JOptionPane.showInputDialog("Escribe nota de la materia "+(i+1)));
        }
        return totalNotas;
    
    }
    
    public Estudiante ingresarDatosEstudiante(){
        
        Estudiante nuevoEstudiante = new Estudiante();
        
        String carnet = leerDatoTipoCadena("Ingrese el carnet del estudiante");
        String nombre = leerDatoTipoCadena("Ingrese el nombre del estudinte");
        String apellido = leerDatoTipoCadena("Ingre el apellido del estudiante");
        int edad = leerDatoTipoEntero("Ingrese la edad del estudiante");
        double peso = leerDatoTipoReal("Ingrese el peso del estudiante");
        int numeroDeMaterias = leerDatoTipoEntero("Ingrese el numero de materias del estudiante");
        
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setNumeroMaterias(numeroDeMaterias);
        nuevoEstudiante.calcularPromedio();
        
        return(nuevoEstudiante);
    }
    
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "Carnet: "+carnet+
                                            "\nNumero de materias: "+numeroMaterias+
                                            "\nPromedio: "+promedioNotas);
        
    }
    

}
