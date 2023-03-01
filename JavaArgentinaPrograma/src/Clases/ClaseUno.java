package Clases;

import java.util.Scanner;

public class ClaseUno {

	public static void main(String[] args) {
		//Ejercicio a
		int a = 1, b = 15, eleccion = 0;
		Scanner in = new Scanner(System.in);
		/*System.out.println("Ejercicio a:");
		while(a <= b) {
			System.out.print(a + ", ");
			a++;
		}
		System.out.println("");
		System.out.println("***************************************************");*/
		
		//Ejercicios b y c
		a = 1;
		b = 15;
		/*System.out.println("Ejercicios b y c:");
		
		System.out.println("Si desea mostrar lon números pares presione 1");
		System.out.println("Si desea mostrar los números impares presione 2");
		eleccion = in.nextInt();

		if(eleccion == 1) {
			while(a <= b){
				if(a % 2 == 0) {
				System.out.print(a + ", ");
				
				}
				a++;
			}
		}
		a = 1;
		b = 15;
		if(eleccion == 2) {
			while(a <= b){
				if(a % 2 != 0) {
				System.out.print(a + ", ");
				
				}
				a++;
			}
		}
		System.out.println("");
		System.out.println("*****************************************************");*/
		
		//Ejercicio d
		/*a = 1;
		b = 15;
		System.out.println("Ejercicio d:");
		for(int i = b; i >= a; i--) {
			if(i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}*/
		
		//Ejercicio N° 2
		System.out.println("Cálculo de categoria Monotributo");
		int superficie = 0, energia = 0;
		float ingresos = 0;
		System.out.println("");
		System.out.println("Ingrese el monto de sus ingresos sin comas ni puntos:");
		ingresos = in.nextFloat();
		System.out.println("Ingrese la superficie del local:");
		superficie = in.nextInt();
		System.out.println("Ingrese la cantidad de energía que consume:");
		energia = in.nextInt();
		
		if(ingresos <= 748782 && superficie <= 30 && energia <= 3330) {
			System.out.println("Usted pertenece a la categoria A");
		} else if(ingresos <= 1112459 && superficie <= 45 && energia <= 5000) {
			System.out.println("Usted pertenece a la categoria B");
		} else if(ingresos <= 1557443 && superficie <= 60 && energia <= 6700) {
			System.out.println("Usted pertenece a la categoria C");
		} else if(ingresos <= 1935273 && superficie <= 85 && energia <= 10000) {
			System.out.println("Usted pertenece a la categoria D");
		} else if(ingresos <= 2277684 &&  superficie <= 110 && energia <= 13000) {
			System.out.println("Usted pertenece a la categoria E");
		}
	}
}
