package ui;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.*;

public class main {

	public static void main(String[] args) {
//		Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos o vendedores 
//		y cargar todos los datos respectivos.
//
//		Luego listar los empleados indicando: dni, nombre, apellido y sueldo. El sueldo debe calcularse en el método getSueldo() 
//		de la siguiente forma:
//
//		Si es administrativo: sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes
//		Si es vendedor: sueldoBase + (porcenComision*totalVtas/100)
//		Restricciones
//
//		Utilizar un único array para almacenar a todos los empleados. No usar colecciones dinámicas.
//		Hacer uso de las ventajas de la programación orientada a objetos: herencia, redefinición y polimorfismo.
//		Las clases lógicas (las del diagrama) no pueden tener entrada o salida de datos por pantalla de ningún tipo. 
//		Esto debe ser realizado por otra clase que cree los objetos de las clases lógicas y les asigne los datos necesarios.
		Scanner reader = new Scanner(System.in);
		ArrayList<Empleado> employeeList = employeeLoad(reader);
		extracted(employeeList);

	}

	private static void extracted(ArrayList<Empleado> employeeList) {
		for (Empleado employee : employeeList) {
			System.out.print("DNI");
			System.out.println(employee.getDni());
			System.out.println(employee.getName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getSalary());
			System.out.println();
		}
	}

	private static ArrayList<Empleado> employeeLoad(Scanner reader) {
		ArrayList<Empleado> employeeList = new ArrayList<Empleado>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese dni:");
			int dni = Integer.parseInt(reader.nextLine());
			System.out.println("Ingrese nombre:");
			String name = reader.nextLine();
			System.out.println("Ingrese apellido:");
			String lastName = reader.nextLine();
			System.out.println("Ingrese mail:");
			String mail = reader.nextLine();
			System.out.println("Ingrese el salario:");
			double salary = Float.parseFloat(reader.nextLine());
			System.out.println("Ingrese a si el usuario es administrador o b si es vendedor");
			String option = reader.nextLine();
			if (option.equals("a")) {
				System.out.println("Ingrese las horas extras:");
				int hsExtra = Integer.parseInt(reader.nextLine());
				System.out.println("Ingrese las horas al mes:");
				int hsMonth = Integer.parseInt(reader.nextLine());
				Administrador newEmployee = new Administrador(dni, name, lastName, mail, salary, hsExtra, hsMonth);
				employeeList.add(newEmployee);
			} else {
				System.out.println("Ingrese el porcentaje de comision:");
				float porcenCommission = Float.parseFloat(reader.nextLine());
				System.out.println("Ingrese el total de ventas:");
				int totalSales = Integer.parseInt(reader.nextLine());
				Vendedor newEmployee = new Vendedor(dni, name, lastName, mail, salary, porcenCommission, totalSales);
				employeeList.add(newEmployee);

			}

		}
		return employeeList;
	}
}
