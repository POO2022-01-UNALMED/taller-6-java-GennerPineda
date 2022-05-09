package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	public static int numCamioneta;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		numCamioneta ++;
	}
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolvo(boolean volco) {
		this.volco = volco;
	}
	public static int getNumCamionetas() {
		return numCamioneta;
	}
	public static void setNumCamionetas(int c) {
		numCamioneta = c;
	}
	

}
