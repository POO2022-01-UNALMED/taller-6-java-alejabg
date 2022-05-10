package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    
    private int ejes;
    private static ArrayList<Camion> listaCamiones = new ArrayList<Camion>();

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Camion.listaCamiones.add(this);
    }

    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static ArrayList<Camion> getListaCamiones() {
        return listaCamiones;
    }
    public static void setListaCamioes(ArrayList<Camion> listaCamiones) {
        Camion.listaCamiones = listaCamiones;
    }
}
