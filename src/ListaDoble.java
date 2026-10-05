public class ListaDoble {

    private Nodo cabeza;

    public ListaDoble() {
        cabeza = null;
    }

    // Inserta un estudiante manteniendo el orden
    // ascendente según su puntaje socioeconómico.
    public void insertarOrdenado(Estudiante estudiante) {

        Nodo nuevo = new Nodo(estudiante);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        // TODO:
        // Recorrer la lista para encontrar la posición
        // correspondiente al puntaje del nuevo estudiante.

        Nodo actual = cabeza;

        while (actual.siguiente != null &&
                actual.estudiante.getPuntaje() <= estudiante.getPuntaje()) {
            actual = actual.siguiente;
        }

        // Implementación inicial.
        // En la siguiente etapa se completarán todos
        // los casos de inserción.
    }

    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.estudiante);
            actual = actual.siguiente;
        }
    }
}