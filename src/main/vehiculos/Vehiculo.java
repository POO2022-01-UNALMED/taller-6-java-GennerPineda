package taller6POO;
import java.util.*;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();

	static int cantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos ++;
		listaFabricantes.add(this.fabricante);
	
		
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPuertas() {
		return this.puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.numAutomoviles+"\nCamionetas: "+ Camioneta.numCamioneta+ "\nCamiones: "+ Camion.numCamion;
	}
	
	public Fabricante fabricaMayorVentas() {
		ArrayList<Integer> count = new ArrayList<Integer>(); 
		for (int i = 0; i < listaFabricantes.size(); i++) {
			int k = 0;
			for (int j = 0; j< listaFabricantes.size(); j++) {
				if (listaFabricantes.get(i) == listaFabricantes.get(j)) {
					k++;
				}
			}
			count.add(k);
		}
		int indiceMayor = 0;
		for (int r = 1; r < count.size(); r++) {
			if (count.get(r) > count.get(indiceMayor)) {
				indiceMayor = r;
			}
		}
		return listaFabricantes.get(indiceMayor);
		
	}

}
