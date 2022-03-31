package entidades;

public class Alumno extends Persona {
	private int legajo;

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Alumno() {
		this.setLegajo(123456);
	}
	@Override
	public String getDetalle(boolean mostrarDatosSensibles) {
		return super.getDetalle(mostrarDatosSensibles) + " - Legajo: " + this.getLegajo();
	}
}
