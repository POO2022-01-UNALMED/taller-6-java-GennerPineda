package vehiculos;
import java.util.*;

public class Fabricante {
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		listaFabricantes.add(this);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return this.pais;
	}
	public static Fabricante fabricaMayorVentas() {
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
