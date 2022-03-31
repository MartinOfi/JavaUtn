package entidades;

public class Vendedor extends Empleado {
	private float porcenCommission;
	private int totalSales;

	public float getPorcenCommission() {
		return porcenCommission;
	}

	public void setPorcenCommission(float porcenCommission) {
		this.porcenCommission = porcenCommission;
	}

	public int getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}

	public Vendedor() {

	}

	public Vendedor(int dni, String name, String lastName, String mail, double salary, float porcenCommission,
			int totalSales) {
		super(dni, name, lastName, mail, salary);
		this.porcenCommission = porcenCommission;
		this.totalSales = totalSales;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + (getPorcenCommission() * getTotalSales() / 100);
	}
}