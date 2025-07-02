import java.util.ArrayList;

public class EstudianteController {
    private ArrayList<Estudiante> lista;
    private ArrayList<String> simuladorArchivo; // simula líneas de archivo

    public EstudianteController() {
        lista = new ArrayList<>();
        simuladorArchivo = new ArrayList<>();
    }

    public void agregar(Estudiante e) {
        lista.add(e);
    }

    public void guardarSimulado() {
        simuladorArchivo.clear();
        for (Estudiante e : lista) {
            StringBuilder linea = new StringBuilder();
            linea.append(e.getNombre()).append(",")
                 .append(e.getGrado()).append(",")
                 .append(e.getSeccion()).append(",");
            for (Double nota : e.getNotas()) {
                linea.append(nota).append(";");
            }
            simuladorArchivo.add(linea.toString());
        }
    }

    public void cargarSimulado() {
        lista.clear();
        for (String linea : simuladorArchivo) {
            String[] partes = linea.split(",");
            if (partes.length >= 4) {
                Estudiante e = new Estudiante(partes[0], partes[1], partes[2]);
                String[] notas = partes[3].split(";");
                for (String n : notas) {
                    if (!n.isEmpty()) {
                        e.agregarNota(Double.parseDouble(n));
                    }
                }
                lista.add(e);
            }
        }
    }

    public void mostrar() {
        for (Estudiante e : lista) {
            System.out.println(e);
        }
    }
}