package MainAPP;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import javax.print.attribute.Size2DSyntax;

import Cola.ColaDelCastigo;

public class MainAPP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ColaDelCastigo<Integer> numeros = new ColaDelCastigo<Integer>();

		numeros.add(1);
		numeros.add(3);
		numeros.add(6);
		numeros.add(2);
		numeros.add(6);
		numeros.add(19);
		numeros.add(9);
		numeros.add(21);
		numeros.add(17);
		numeros.add(4);

		
		
// Mostarmos los numero del ArrayList
	System.out.println(numeros);

// Con este numero compruebas la Excepcions ColaExceededSizeException
// 	numeros.add(5); 	

// Realizamos la prueba para comprobar si la cola esta vacia, si esta vacia devolvera true sino retornara false		
// 	System.out.println(numeros.isEmpty()); 

//	Comprobamos que al introducir un valor null nos da la excepcion LlevateTuNullDeAquiException
//	numeros.add(null);

// Comprobamos que al querer borrar nos da la excepcion EElementBlockedException	
//	numeros.remove();

// Compramos el metodo contains, si el numero que introducimos esta en la  cola no devolvera true si no es asi devolvera false	
//	System.out.println(numeros.contains(2));	
//	System.out.println(numeros.contains(50));
		
// Implementamos el metodo poll, este nos muetra el primer numero de la fila y luego lo elimna siendo el siguiente el primero numero de la fila		
//	System.out.println(numeros.poll());
//	System.out.println(numeros.poll());
//s	System.out.println(numeros.poll());
		
// Implementamos el metodo element que devuelve el primer numero de la cola
// 	System.out.println(numeros.element());

// Comprabamos el metodo peek() que nos devuelve la cabeza de la cola sin eliminarla	
//	System.out.println(numeros.peek());
	
	
	
	
	}

}
