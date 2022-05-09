package vehiculos;

import java.util.ArrayList;

public class Pais {
	String nombre;
	static ArrayList<Pais> listaPaises = new ArrayList<Pais>();
	public Pais(String nombre) {
		this.nombre = nombre;
		listaPaises.add(this);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public static Pais paisMasVendedor() {
		ArrayList<Integer> count = new ArrayList<Integer>(); 
		for (int i = 0; i < listaPaises.size(); i++) {
			int k = 0;
			for (int j = 0; j< listaPaises.size(); j++) {
				if (listaPaises.get(i) == listaPaises.get(j)) {
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
		return listaPaises.get(indiceMayor);
	}

}
