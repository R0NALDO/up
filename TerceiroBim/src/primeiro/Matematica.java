package primeiro;

public class Matematica {

		public static void main(String[] args) {
			
			System.out.println(Somar(3, 2));
			System.out.println(Subtrair(3, 2));
			System.out.println(Multiplicar(2, 3));
			System.out.println(Dividir(2, 2));
		}
	
		public static int Somar(int n1, int n2) {
			int resultado = n1 + n2;
			return resultado;
		}
		
		public static int Subtrair(int n1, int n2) {
			int resultado = n1 - n2;
			return resultado;
		}
		
		public static int Multiplicar(int n1, int n2) {
			int resultado = n1 * n2;
			return resultado;
		}
		
		public static int Dividir(int n1, int n2) {
			int resultado = n1 / n2;
			return resultado;
		}

	}


/*
EXERC�CIO


1. Crie uma classe com o nome matem�tica com tr�s atributos num�ricos (n1, n2 e
resultado).


Crie um m�todo Somar que para somar os atributos e colocar o valor em
�resultado�.


Teste a classe.


Crie m�todos similares para Subtrair, Multiplicar e Dividir

*/