public class Main {

    public static void main(String[] args) {

        ListaDoble estudiantes = new ListaDoble();

        Estudiante e1 = new Estudiante(
                1, "Juan", 2.5
        );

        Estudiante e2 = new Estudiante(
                2, "Maria", 4.0
        );

        estudiantes.insertarOrdenado(e1);
        estudiantes.insertarOrdenado(e2);

        System.out.println("Estudiantes registrados:");
        estudiantes.mostrar();

        System.out.println("\nSistema de Residencias UNAL iniciado.");
    }
}