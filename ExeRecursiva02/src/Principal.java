import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double numero  = 7;


		System.out.println(funcaoNumeroReais(numero));
	}
	
	public static double funcaoNumeroReais(double numero) {
		//caso o valor fique inferior a 0 ele retorna o valor zero para fazer a pausa da recursiva.
		if (numero < 0) {
			return 0;
		} else {
			return numero + funcaoNumeroReais(numero - 1);
		}
		//as chamadas é feita pegando o valor enviado, e caso ele seja maior que zero vai somar o valor e enviar ele menos 1 para a função.
	}
}
