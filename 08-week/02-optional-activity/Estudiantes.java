class Nodo {
    String nombre; // El dato
    Nodo siguiente; // El enlace al próximo nodo

    // Constructor para facilitar la creación del nodo
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null; // Por defecto apunta a null
    }
}

public class Estudiantes {
    public static void main(String[] args) {
        // 1. Creamos los 4 nodos con los nombres de los estudiantes que hayamos elegidos
        Nodo estudiante1 = new Nodo("Daniel");
        Nodo estudiante2 = new Nodo("Esteban");
        Nodo estudiante3 = new Nodo("Isabella");
        Nodo estudiante4 = new Nodo("Alex");

        // 2. en este paso se establece la "Cabeza" (Head)
        Nodo cabeza = estudiante1;

        // 3. Conectamos los nodos (Los enlaces)
        estudiante1.siguiente = estudiante2;
        estudiante2.siguiente = estudiante3;
        estudiante3.siguiente = estudiante4;
        // El estudiante4 ya apunta a null por el constructor

        // 4. Código para mostrar la lista en consola (Opcional)
        System.out.println("Lista Enlazada de Estudiantes:");
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.nombre + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}