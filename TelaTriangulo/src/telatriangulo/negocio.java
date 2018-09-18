/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telatriangulo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bruno
 */
public class negocio {
    public HashSet<String> validartriangulo(double a,double b,double c){
        
        HashSet<String> propriedades = new HashSet<String>();
        
        double hipotenusa = a;

		if (hipotenusa < b) {

			hipotenusa = b;

		}

                
                
		if (hipotenusa < c) {

			hipotenusa = c;

		}

		if ((a + b + c - hipotenusa) > hipotenusa) {

			propriedades.add("Válido");

			if (a == b || b == c || c == a) {

				if (a == b && b == c) {

					propriedades.add("Equilátero");

				} else {

					propriedades.add("Isósceles");

				}

			}

			if (a != b && b != c && c != a) {

				propriedades.add("Escaleno");

			}

			if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa

					* hipotenusa) {

				propriedades.add("Retângulo");

			}

		} else {

			propriedades.add("Inválido");

		}
                
                return propriedades;
    }
}
