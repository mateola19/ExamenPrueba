package Examen;

import java.util.Objects;

public class Ejercicio implements Comparable<Ejercicio> {
	
	public String nombreEj;
	public String muscEjercitado;
	public int CaloriasQuem;
	
	public Ejercicio() {
		
	}
	
	public Ejercicio(String nombreEj, String muscEjercitado, int CaloriasQuem) {
		this.nombreEj = nombreEj;
		this.muscEjercitado = muscEjercitado;
		this.CaloriasQuem = CaloriasQuem;
	}
	
	

	public String getNombreEj() {
		return nombreEj;
	}

	public void setNombreEj(String nombreEj) {
		this.nombreEj = nombreEj;
	}

	public String getMuscEjercitado() {
		return muscEjercitado;
	}

	public void setMuscEjercitado(String muscEjercitado) {
		this.muscEjercitado = muscEjercitado;
	}

	public int getCaloriasQuem() {
		return CaloriasQuem;
	}

	public void setCaloriasQuem(int caloriasQuem) {
		CaloriasQuem = caloriasQuem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CaloriasQuem, muscEjercitado, nombreEj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio other = (Ejercicio) obj;
		return CaloriasQuem == other.CaloriasQuem && Objects.equals(muscEjercitado, other.muscEjercitado)
				&& Objects.equals(nombreEj, other.nombreEj);
	}

	@Override
	public int compareTo(Ejercicio o) {
		int ordenNatural = Integer.compare(this.CaloriasQuem, o.getCaloriasQuem());
		if (ordenNatural != 0) {
			return ordenNatural;
		}
		
		ordenNatural = this.muscEjercitado.compareTo(o.getMuscEjercitado());
		if (ordenNatural != 0) {
			return ordenNatural;
		}
		return 0;
	}
	
	
	

}

