package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{

    private static ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
    private  int puestos;
  
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        listaAutomoviles.add(this);
    }

    public static ArrayList<Automovil> getListaAutomoviles() {
        return listaAutomoviles;
    }
    public static void setListaAutomoviles(ArrayList<Automovil> listaAutomoviles) {
        Automovil.listaAutomoviles = listaAutomoviles;
    }

    public int getPuestos() {
        return puestos;
    }
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
