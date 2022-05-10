package vehiculos;

import java.util.ArrayList;

public class Fabricante{
    
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
    int vehiculos;
   
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        listaFabricantes.add(this);
        this.vehiculos = 0;
    }

    public static Fabricante fabricaMayorVentas(){
		Fabricante ganador = new Fabricante(null, null);	
		for(Fabricante fabricante: listaFabricantes) {
			if(ganador.vehiculos < fabricante.vehiculos) {
				ganador = fabricante;
			}
		}	
		return ganador;
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
