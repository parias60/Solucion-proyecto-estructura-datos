public class ColaCircular {

    private String[] solicitudes;
    private int frente;
    private int fin;
    private int tamaño;

    public ColaCircular(int capacidad) {
        solicitudes = new String[capacidad];
        frente = 0;
        fin = 0;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño == solicitudes.length;
    }

    public void enqueue(String solicitud) {

        if (estaLlena()) {
            System.out.println("La cola está llena.");
            return;
        }

        solicitudes[fin] = solicitud;
        fin = (fin + 1) % solicitudes.length;
        tamaño++;
    }

    public String dequeue() {

        if (estaVacia()) {
            return null;
        }

        String solicitud = solicitudes[frente];
        frente = (frente + 1) % solicitudes.length;
        tamaño--;

        return solicitud;
    }
}