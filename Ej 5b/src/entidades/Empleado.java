package entidades;

public class Empleado {
	private Integer dni;
	private String name;
	private String lastName;
	private String mail;
	private double salary;

	public Empleado() {
		this.name = "";
		this.lastName = "";
		this.mail = "";
	}
	public Empleado(int dni,String name, String lastName, String mail, double salary) {
		this.dni=dni;
		this.name = name;
		this.lastName =lastName ;
		this.mail = mail;
		this.salary =salary;
	}
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}