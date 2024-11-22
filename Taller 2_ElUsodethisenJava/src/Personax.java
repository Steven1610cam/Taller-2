public class Personax {
    private String nombre;

    // Constructor
    public Personax(String nombre) {
        this.nombre = nombre; // Uso correcto de `this`
    }

    
    public void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre); // Uso correcto de `this`
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        persona.mostrarNombre(); // Imprime: Nombre: Juan
    }
}