package blocNotas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota {

	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	private static int codigoSiguiente=1;

	public Nota(String texto) {
		super();
		this.texto = texto;
		this.fechaCreacion=LocalDateTime.now();
		this.fechaUltimaModificacion=LocalDateTime.now();
		this.codigo=codigoSiguiente;
		codigoSiguiente++;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean resul=false;
		if(fechaCreacion!=fechaUltimaModificacion) {
			resul=true;
		}
		return resul;
	}
	
	public boolean isEmpty() {
		boolean resul=false;
		if(texto.isEmpty()) {
			resul=true;
		}
		return resul;
	}
	
	public boolean isCreadoAnterior(Nota n1) throws NotaAlarmaException {
		if (n1==null) {
			throw new NotaAlarmaException("No existe fecha");
		}
		boolean resul=false;
		if(n1.fechaCreacion.isBefore(this.fechaCreacion)) {
			resul=true;
		}
		return resul;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
	}

	@Override
	public String toString() {
		return "Nota [codigo=" + codigo + ", texto=" + texto + ", fechaCreacion=" + fechaCreacion
				+ ", fechaUltimaModificacion=" + fechaUltimaModificacion + "]";
	}
	
	public int CompareTo(Nota n1) {
		int resul=0;
		if(this.getCodigo()>n1.getCodigo()) {
			resul=1;
		}
		else if(this.getCodigo()<n1.getCodigo()) {
			resul=-1;
		}
		return resul;
		
	}

}
