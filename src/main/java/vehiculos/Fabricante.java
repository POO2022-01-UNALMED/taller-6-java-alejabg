package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;

public class Fabricante{
    
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<>();
   
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        Fabricante.listaFabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
		ArrayList<String> nombres = new ArrayList<>();
		for (Vehiculo vehiculo : Vehiculo.getListaVehiculos()) {
			nombres.add(vehiculo.getFabricante().getNombre());
		}
		HashMap<String, Integer> dic = new HashMap<>();
		for (int x = 0; x < nombres.size(); x++) {
			String nombre = nombres.get(x);
			if (dic.containsKey(nombre)) {
				dic.put(nombre, dic.get(nombre) + 1);
			}else {
				dic.put(nombre, 1);
			}
		}
		
		String x = "";
		int mayor = 0;
		for (HashMap.Entry<String, Integer> entry : dic.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				x = entry.getKey();
			}
		}

		for (Fabricante fabricante : Fabricante.getListaFabricantes()) {
			if (fabricante.getNombre() == x) {
				return fabricante;
			}
		}
        return null;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void setListaFabricantes(ArrayList<Fabricante> listaFabricantes) {
        Fabricante.listaFabricantes = listaFabricantes;
    } 
    public static ArrayList<Fabricante> getListaFabricantes() {
        return Fabricante.listaFabricantes;
    }

}
