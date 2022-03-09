package blocNotas;

import java.util.Arrays;
import java.util.Objects;

public class Bloc {

	private int numNotas;
	private String nombre;
	private static final int NUMERO_NOTAS_MAXIMO = 10;
	private Nota[] notas;

	public Bloc(String nombre) {
		super();
		this.nombre = nombre;
		this.notas=new Nota[NUMERO_NOTAS_MAXIMO];
		this.numNotas=0;
	}

	public String getNota(int num) {
		String resul="";
		resul=notas[num].getTexto();
		return resul;
	}
	
	public void updateNota(int num,String texto) {
		notas[num].setTexto(texto);
	}
	
	public void addNota(String texto) {
		boolean igual=false;
		int i=0;
		Nota n1=new Nota(texto);
		while(i<NUMERO_NOTAS_MAXIMO && !igual) {
			if(notas[i].getTexto().equals(n1.getTexto())) {
				igual=true;
				System.out.println("Nota existente");
			}
			i++;
		}
		if(!igual) {
			notas[i]=n1;
		}
	}
	
	public void activa(int num) {
		//notas[num] necesito la clase hija??
	}

	public void desactiva(int num) {
		
	}

	public String getNombre() {
		return nombre;
	}

	public static int getNumeroNotasMaximo() {
		return NUMERO_NOTAS_MAXIMO;
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloc other = (Bloc) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public String ordenaBloc() {
		Nota resul[]=new Nota[numNotas];
		Arrays.sort(resul);
		return resul.toString();
	}
	
	
}
