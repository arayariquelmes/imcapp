package cl.unab.imcApp;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso=0;
		boolean esValidoPeso=false;
		do {
			System.out.println("Ingrese peso");
			String pesoTxt = sc.nextLine().trim();
			if(Validacion.esDoubleValido(pesoTxt)) {
				peso = Double.parseDouble(pesoTxt);
				if(peso > 0) {
					esValidoPeso = true;
				} else {
					esValidoPeso = false;
					System.out.println("El Peso debe ser mayor que 0");
				}
			}else {
				esValidoPeso = false;
				System.out.println("El Peso debe ser numérico");
			}
			
		}while(!esValidoPeso);
		
		double altura=0;
		boolean esValidoAltura = false;
		do {
			System.out.println("Ingrese estatura");
			String alturaTxt = sc.nextLine().trim();
			if(Validacion.esDoubleValido(alturaTxt)) {
				altura = Double.parseDouble(alturaTxt);
				if(altura >0) {
				  esValidoAltura = true;	
				} else {
					esValidoAltura = false;
					System.out.println("La altura debe ser mayor que 0");
				}	
			}else {
				esValidoAltura = false;
				System.out.println("La altura debe ser numérica");
			}
			
		}while(!esValidoAltura);
		
		double imc = calcularIMC(peso, altura);
		System.out.println(getEstado(imc));
	}
	
	private static double calcularIMC(double peso, double estatura) {
			return peso/(estatura*estatura);
	}
	
	private static String getEstado(double imc) {
		String resultado="";
		if(imc <=15.0) {
			resultado="Delgadez muy severa";
		} else if(imc >15.0 && imc <=15.9) {
			resultado = "Delgadez Severa";
		} else if(imc >=16.0 && imc <=18.4) {
			resultado = "Delgadez";
		} else if(imc >=18.5 && imc <=24.9) {
			resultado = "Peso Saludable";
		} else if(imc >=25 && imc <=29.9) {
			resultado = "Sobrepeso";
		}else if(imc >=30.0 && imc <= 34.9) {
			resultado = "Obesidad Severa";
		}else if(imc >=40 ){
			resultado = "Obesidad Morbida";
		}
		
		return resultado;
	}

}
