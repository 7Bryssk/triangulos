/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telatriangulo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class TelaTriangulo {



	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o tipo do triangulo");

		System.out.println("Informa o valor do lado a");

		double a = sc.nextDouble();

		System.out.println("Informa o valor do lado b");

		double b = sc.nextDouble();

		System.out.println("Informa o valor do lado c");

		double c = sc.nextDouble();



		Set<String> propriedades = new HashSet<String>();
                negocio negocio = new negocio();
                
                propriedades=negocio.validartriangulo(a, b, c);
                
		System.out.println("Propriedades do triangulo ->");

		for (String valor : propriedades) {

			System.out.println(valor);

		}

	}

}