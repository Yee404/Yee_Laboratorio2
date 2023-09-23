// Universidad del Valle de Guatemala
//Nombre: María José Yee Vidal      Carnet: 231193
//Materia: Programación Orientada a Objetos     Sección: 11
//Fecha: 22/09/2023
// Descripción: programa para asignar horarios a cursos, personalizable para cada sede.
// Recursos consultados: https://youtu.be/Xr6_7zGJis4?si=BHWGz-OlAdRdFeRx;
// Nota: no compila.

package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Main(){
    
    public static void main(String[] args) throws FileNotFoundException{
        
        CSVReader csvReader = new CSVReader(new FileReader(new File(Salones.csv)));
        List<String[]> allData = csvReader.readAll();
        allData.get(1)[2] = "10";

        CSVWriter csvWriter = new CSVWriter(new File(new File(Salones.csv)));
        CSVWriter
        

    }

}

//_______________________________
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
        
        // Horario[14 horas][5 días]
        Horario[][] horario = new Horario[14][5];

        System.out.println("¿Qué desea realizar?");
        System.out.println("0. Mostrar horario por sede.");
        System.out.println("1. Agregar curso al horario.");
        int opcion = scanner.nextInt();
        scanner.nextLine();