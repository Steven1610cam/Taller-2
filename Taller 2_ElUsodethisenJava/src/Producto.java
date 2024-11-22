public class Producto {
    private String nombre;
    private double precio;

    
    public Producto(String nombre, double precio) {
        this.nombre = nombre; 
        this.precio = precio; 
    }

    
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + this.nombre + ", Precio: " + this.precio);
    }

    
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1200.50);
        producto1.mostrarProducto(); // Imprime: Nombre del producto: Laptop, Precio: 1200.5
    }
}