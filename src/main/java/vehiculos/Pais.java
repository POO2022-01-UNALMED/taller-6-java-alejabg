package vehiculos;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    private static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
    int vehiculos;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.vehiculos = 0;
    }
    
    public static Pais paisMasVendedor(){
		Pais ganador = new Pais(null);
		
		for(Pais pais: listaPaises) {
			if(ganador.vehiculos < pais.vehiculos) {
				ganador = pais;
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
}
