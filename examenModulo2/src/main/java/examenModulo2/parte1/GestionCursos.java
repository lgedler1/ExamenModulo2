package examenModulo2.parte1;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.Map.Entry;



public class GestionCursos {

	public static void main(String[] args) {
		Master faces1 = new Master("Economia Mundial", "FEC025635", 20, false);
		Master faces2 = new Master("Integraciones", "FEC051615", 20, true);
		Master ade1 = new Master("Tecnologias finacieras", "FEC053493531", 15, true);

		Map< String , Master>  mapaMaster = new HashMap< String , Master>();
		
		mapaMaster.put(faces1.getCodIdentificador(), faces1);
		mapaMaster.put(faces2.getCodIdentificador(), faces2);
		mapaMaster.put(ade1.getCodIdentificador(), ade1);
		
		//Prueba de numero maximo de cupos.
		 try {
			faces1.setCupoDisponible(21);
		} catch (ExepControCupo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<Entry<String,Master>> codigoMasters = mapaMaster.entrySet();
		for (Entry<String, Master> entry : codigoMasters) {
			System.out.println(entry);
		}
		
		//eliminar registro a partir de la clave:
		mapaMaster.remove(faces2.getCodIdentificador());
		System.out.println("\n\n");
		
		
		Set<Entry<String,Master>> codigoMastersprueba = mapaMaster.entrySet();
		for (Entry<String, Master> entry : codigoMastersprueba) {
			System.out.println(entry.getValue().devuelveNombre());
		}
		
		

	}

}
