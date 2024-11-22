public class Persona {
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre; // Uso correcto de `this`
    }

    // Método estático que intenta usar `this`
    public static void mostrarNombre() {
        // System.out.println("Nombre: " + this.nombre); // Esto generará un error de compilación
        // Error: No se puede usar `this` en un contexto estático
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        // persona.mostrarNombre(); // Esto no funcionará porque mostrarNombre es estático
    }
}