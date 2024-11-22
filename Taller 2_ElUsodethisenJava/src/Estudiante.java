public class Estudiante {
    private String nombre;
    private int edad;

    
    public Estudiante() {
        this("Desconocido", 0); 
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; 
        this.edad = edad; 
    }

    
    public void mostrarEstudiante() {
        System.out.println("Nombre del estudiante: " + this.nombre + ", Edad: " + this.edad);
    }

   
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(); 
        estudiante1.mostrarEstudiante(); // Imprime: Nombre del estudiante: Desconocido, Edad: 0

        Estudiante estudiante2 = new Estudiante("Juan", 20); 
        estudiante2.mostrarEstudiante(); // Imprime: Nombre del estudiante: Juan, Edad: 20
    }
}