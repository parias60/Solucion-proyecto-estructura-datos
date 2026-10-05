import java.util.Stack;

public class PilaUndo {

    private Stack<Nodo> pila;

    public PilaUndo() {
        pila = new Stack<>();
    }

    public void push(Nodo nodo) {
        pila.push(nodo);
    }

    public Nodo pop() {
        if (pila.isEmpty()) {
            return null;
        }

        return pila.pop();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }
}