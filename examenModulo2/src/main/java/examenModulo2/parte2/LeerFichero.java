package examenModulo2.parte2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {

		LeerFichero files = new LeerFichero();
		String nombreArchivo = "./FicheroEjercicio2.txt";

		Path filePath = Paths.get(nombreArchivo);

		if (Files.exists(filePath)) {
		} else {
			System.out.println("El archivo no existe en la ruta proporcionada.");
		}

		try {
			files.leerImprimeLineas(nombreArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<Integer, String> lineasConJava =files.lineasJava(nombreArchivo);
		for (Map.Entry<Integer, String> entry : lineasConJava.entrySet()) {
            System.out.println("Línea " + entry.getKey());
        }
		for (Map.Entry<Integer, String> entry : lineasConJava.entrySet()) {
            System.out.println("Línea " + entry.getKey() +" el numero de caracteres es "+(entry.getKey() + entry.getValue().length()));
        }

	}

	public String leerImprimeLineas(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			System.out.println(linea);
			sb.append(linea + "\n");
		}

		return sb.toString();
	}

	public  Map<Integer, String>  lineasJava(String nombreArchivo) {
		Map<Integer, String> lineasConJava = new HashMap<Integer, String>();
		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			int numeroDeLinea = 1;

			while ((linea = br.readLine()) != null) {
				if (linea.contains("Java")) {
					lineasConJava.put(numeroDeLinea, linea);
				}
				numeroDeLinea++;
			} return lineasConJava;
			
		} catch (IOException e) {
			
		}return lineasConJava;
	}
}
