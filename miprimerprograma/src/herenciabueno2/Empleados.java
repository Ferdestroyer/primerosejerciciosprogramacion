package herenciabueno2;

import java.util.Scanner;


public class Empleados {


protected String nombre;
protected int sueldo;

public Empleados() {
	nombre="";
	sueldo=0;
}


public Empleados(String nombre, int sueldo) {
	this.nombre = nombre;
	this.sueldo = sueldo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getSueldo() {
	return sueldo;
}

public void setSueldo(int sueldo) {
	this.sueldo = sueldo;
}

public void crearempleado(){
	Scanner teclado = new Scanner (System.in);
	System.out.println("Introduce el nombre: ");
	this.nombre = teclado.next();
	System.out.println("Introduce el sueldo : ");
	this.sueldo = teclado.nextInt();
}

public void imprimir(){
	
	System.out.print(" Nombre " + nombre);
	
	System.out.print(" sueldo: " + sueldo);

	System.out.println();
}	



}
