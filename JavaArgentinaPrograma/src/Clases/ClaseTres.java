package Clases;


import java.util.Scanner;

public class ClaseTres {

	public static void main(String[] args) {
		//Ejercicio N° 1
		//Punto a
		Scanner in = new Scanner(System.in);
		String frase = ""; //Aqui el usuario ingresara la cadena de texto
		char letra; //Aqui el usuario ingresara la letra que quiere buscar
		char comparador; //Con esta variable se comparará si la letra esta en la cadena 
		int contador = 0; //Con esta variable se contará la cantidad de apariociones de la letra
		
		System.out.println("Ingrese una palabra u oracion");
		frase = in.nextLine(); //Con este metodo se pueden introducir datos desde el teclado
		frase = frase.replace(" ", ""); //Con este metodo se eliminan los espacios en la cadena de texto
		while(frase.length() <= 0 || frase.equals(" ")) { //Condicional para que la cadena de texto no quede vacía
			System.out.println("ERROR! La cadena de caracteres está vacia");
			System.out.println("Ingrese una palabra u oracion");
			frase = in.nextLine();
			frase = frase.replace(" ", "");
		}
		
		System.out.println("Ingrese la letra que quiere contar");
		letra = in.next().charAt(0);
		
		frase = frase.toLowerCase(); //Pasa la cadena de texto a minusculas
		
		if(frase.indexOf(letra) != -1) { //Condicional para saber si la letra que se busca se encuentra por lo menos una vez en la cadena
			
		for(int i = 0; i < frase.length(); i++) { //Ciclo para recorrer la cadena de texto
		comparador = frase.charAt(i); //Se almacena temporalmente cada caracter de la cadena
		if(comparador == letra) { //Se compara el caracter almacenado con el caracter ingresado
			contador++;
			}
	
		}
		System.out.println("La letra " + letra + " se repite " + contador + " veces.");
		}else {
			System.out.println("No existe la letra en la cadena de caracteres");
		}
		System.out.println("**************************************************************");
		
		
//		/*Punto b*/
		System.out.println("");
		System.out.println("Punto b");
		System.out.println("");
		int num1 = 0, temporal = 0, opcion = 0; //Definimos las variables
		int vector[] = new int[3]; //Definimos la longitud del vector
		
		for(int i = 0; i < vector.length; i++) { //Ciclo para recorrer el vector
			System.out.println("Ingrese un número para la posicion " + i);
			num1 = in.nextInt(); //Solicitamos al usuario que ingrese un número
			vector[i] = num1; //Asignamos ese número a la posición correspondiente del vector
		}
		
		System.out.println("Si desea ordenar el array de menor a mayor presione 1");
		System.out.println("Si desea ordenar el array de mayor a menor presione 2");
		opcion = in.nextInt(); //almacenamos una opcion para elegir el metodo de ordenamiento
		
		switch(opcion) {
		case 1: 	//De menor a mayor	
		       for (int i = 0; i < vector.length - 1; i++) { //Este ciclo recorre el vector - 1 posicion
		          for (int j = 1; j < vector.length - i; j++) { //Este ciclo es para comparar los elementos del vector
		             if (vector[j-1] > vector[j]) { //Condicional para intercambiar los elementos adyacentes
		                temporal = vector[j-1]; //Se almacena el valor del vector[j - 1] en una variable temporal
		                vector[j-1] = vector[j]; //Se reemplaza el valor de el vector[j - 1] por el valor del vector[j] 
		                vector[j] = temporal; //El valor del vector[j - 1] almacenado en la variable temporal reemplaza el valor del vector[j]
		             }
		          }
		       }
			
		
			break;
		
		case 2: 
		       for (int i = 0; i < vector.length - 1; i++) { //Este ciclo recorre el vector - 1 posicion
			          for (int j = 1; j < vector.length - i; j++) { //Este ciclo es para comparar los elementos del vector
			             if (vector[j-1] < vector[j]) { //Condicional para intercambiar los elementos adyacentes
			                temporal = vector[j-1]; //Se almacena el valor del vector[j - 1] en una variable temporal
			                vector[j-1] = vector[j]; //Se reemplaza el valor de el vector[j - 1] por el valor del vector[j] 
			                vector[j] = temporal; //Se reemplaza el valor de el vector[j - 1] por el valor del vector[j] 
			             }
			          }
			       }
				
			break;
		
		default: System.out.println("ERROR! La opción seleccionada no existe!");
		 	break;
		}
		
		
		for(int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]); // Mostramos el vector ya ordenado
		}
		System.out.println("*******************************************************************");

		//punto c
		System.out.println("");
		System.out.println("Punto c");
		System.out.println("");
		int longitud = 0, numRedondeado = 0, parametro = 0, acumulador = 0; //variables enteras
		double random = 0; //varable de tipo real
		System.out.println("Ingrese la longitud del vector");
		longitud = in.nextInt();
		System.out.println("Ingrese el numero a partir del que quiere sumar");
		parametro = in.nextInt();
		
		int array[] = new int[longitud]; //Declaramos un vector con la longitud que ingresamos por teclado
		for(int i = 0; i < array.length; i++) { //Recorremos el vector
			random = Math.random(); //generamos un número random mayor que 0 y menor que 1 
			random = (random * 10) + 1; //generamos un numero entre 1 y 11, pero sigue siendo un número real
			numRedondeado = (int) Math.round(random); //Con el metodo round se redondea el número i al agregar (int) antes del metodo, se transforma en entero
			array[i] = numRedondeado; //Agregamos estos números generados al azar a cada posicion del vector 
			if(array[i] > parametro) { //Condicional para saber si el valor dentro del array es mayor al número que se quiere sumar
				acumulador += array[i]; //Sumar los valores que cumplan la condicion
			}
		}
		for(int i = 0; i < array.length; i++) { //Ciclo para mostrar el array
			System.out.print("[" + array[i] + "] ");
		}
		System.out.println("");
		System.out.println("La suma de los valores a partir de " +  parametro + " es " + acumulador); //Muetra el valor de los números sumados
		System.out.println("");
		System.out.println("************************************************************************");
		
		//Punto N° 2
		System.out.println("");
		System.out.println("Punto 2");
		System.out.println("");
		String nombres = ""; //Variable que almacena los nombres
		
		
		System.out.println("ingrese 10 nombres separados por un espacio:");
		nombres = in.nextLine();
		
		
		String[] arreglo = nombres.split(" "); //El método split genera un vector a partir de separar una cadena de texto dependiendo del valor que queremos cortar
		System.out.println("El vector con los nombres ingresados es:");
		for(int i = 0; i < arreglo.length; i++) { //Recorremos el vector creado
			System.out.print("[" + arreglo[i] + "] "); //Mostramos los elementos del vector
		}
	}
}
