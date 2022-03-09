package blocNotas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota {

	private LocalDateTime fechaAlarma;
	private int minutosRepetir;
	private boolean activado;
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;

	public NotaAlarma(String texto,LocalDateTime fecha,boolean activado) {
		super(texto);
		setFechaAlarma(fecha);
		this.activado=activado;
		this.minutosRepetir=MINUTOS_REPETIR_POR_DEFECTO;
	}

	public NotaAlarma(String texto,LocalDateTime fecha,int minutos) {
		super(texto);
		this.fechaAlarma=fecha;
		this.minutosRepetir=minutos;
	}

	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}

	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public void activar() {
		this.activado=true;
	}
	
	public void desactivar() {
		this.activado=false;
	}
	
	public boolean isActivado() {
		boolean resul=false;
		if(this.activado) {
			resul=true;
		}
		return resul;
	}

	@Override
	public String toString() {
		return "NotaAlarma [fechaAlarma=" + fechaAlarma + ", minutosRepetir=" + minutosRepetir + ", activado="
				+ activado + "]";
	}
	
	
	
}
