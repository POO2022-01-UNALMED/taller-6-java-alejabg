package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    
    private boolean volco;
    private static ArrayList<Camioneta> listaCamionetas = new ArrayList<Camioneta>();

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.listaCamionetas.add(this);
    }

    public boolean isVolco() {
        return volco;
    }
    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static ArrayList<Camioneta> getListaCamionetas() {
        return listaCamionetas;
    }
    public static void setListaCamioes(ArrayList<Camioneta> listaCamionetas) {
        Camioneta.listaCamionetas = listaCamionetas;
    }
}