import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Leer el archivo Salon.csv
            CSVReader reader = new CSVReader(new FileReader("Salon.csv"));
            String[] nextLine;
            List<Salon> salones = new ArrayList<>();

            while ((nextLine = reader.readNext()) != null) {
                int idSede = Integer.parseInt(nextLine[0]);
                char edificio = nextLine[1].charAt(0);
                int nivel = Integer.parseInt(nextLine[2]);
                int idSalon = Integer.parseInt(nextLine[3]);
                int capacidad = Integer.parseInt(nextLine[4]);

                salones.add(new Salon(idSede, edificio, nivel, idSalon, capacidad));
            }

            // Leer el archivo Cursos.csv
            reader = new CSVReader(new FileReader("Cursos.csv"));
            List<Curso> cursos = new ArrayList<>();

            while ((nextLine = reader.readNext()) != null) {
                int idCurso = Integer.parseInt(nextLine[0]);
                int idSede = Integer.parseInt(nextLine[1]);
                String nombreCurso = nextLine[2];
                int horario = Integer.parseInt(nextLine[3]);
                int duracion = Integer.parseInt(nextLine[4]);
                String dias = nextLine[5];
                int cantidadEstudiantes = Integer.parseInt(nextLine[6]);

                cursos.add(new Curso(idCurso, idSede, nombreCurso, horario, duracion, dias, cantidadEstudiantes));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
