import java.util.*;

public class Estudiante {
    private String nombre;
    private String grado;
    private String seccion;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, String grado, String seccion) {
        this.nombre = nombre;
        this.grado = grado;
        this.seccion = seccion;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double promedio() {
        double suma = 0;
        for (double n : notas) suma += n;
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    public String getNombre() { return nombre; }
    public String getGrado() { return grado; }
    public String getSeccion() { return seccion; }
    public ArrayList<Double> getNotas() { return notas; }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " | Grado: " + grado + " | Seccion: " + seccion + " | Nota: " + promedio();
    }
}