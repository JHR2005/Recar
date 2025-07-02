
public class Main {
    public static void main(String[] args) {
        EstudianteController ctrl = new EstudianteController();

        Estudiante e1 = new Estudiante("Luis Perez", "3ro", "A");
        e1.agregarNota(12.5);
        e1.agregarNota(14.0);

        Estudiante e2 = new Estudiante("Maria Lopez", "2do", "B");
        e2.agregarNota(16.0);
        e2.agregarNota(15.5);

        Estudiante e3 = new Estudiante("Carlos Ruiz", "4to", "C");
        e3.agregarNota(10.0);
        e3.agregarNota(11.5);

        Estudiante e4 = new Estudiante("Ana Torres", "5to", "A");
        e4.agregarNota(17.0);
        e4.agregarNota(18.0);

        ctrl.agregar(e1);
        ctrl.agregar(e2);
        ctrl.agregar(e3);
        ctrl.agregar(e4);

        ctrl.guardarSimulado();
        ctrl.cargarSimulado();
        ctrl.mostrar();
    }
}
