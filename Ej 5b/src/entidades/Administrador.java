package entidades;

public class Administrador extends Empleado {
	private int hsExtra;
	private int hsMonth;

	public int getHsExtra() {
		return hsExtra;
	}

	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}

	public int getHsMonth() {
		return hsMonth;
	}

	public void setHsMonth(int hsMonth) {
		this.hsMonth = hsMonth;
	}

	public Administrador() {

	}
	
	public Administrador(int dni, String name, String lastName, String mail, double salary, int hsExtra, int hsMonth) {
		super(dni, name, lastName, mail, salary);
		this.hsExtra = hsExtra;
		this.hsMonth = hsMonth;
	}

	@Override
	public double getSalary() {
		return (super.getSalary() * (getHsExtra() * 1.5 + getHsMonth()) / getHsMonth());
	}

}