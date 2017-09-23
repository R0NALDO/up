package segundo;
//segundo exercicio
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//cria pessoas
		Pessoa ronaldo = CriarPessoa("Ronaldo", 'M', 72.5, 1.75, 29, 123);
		Mostrar(ronaldo);
		PularUmaLinha();
		
		Pessoa.MostrarEstadoCivil(ronaldo);
		PularUmaLinha();
		
		Pessoa.Casar(ronaldo);
		PularUmaLinha();
		
		Pessoa ana = CriarPessoa("Ana", 'F', 62.5, 1.65, 27, 456);
		Mostrar(ana);
		PularUmaLinha();
		
		Pessoa.SalvarPessoa(ronaldo);
		
//		PularUmaLinha();
//		Mostrar(ronaldo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//mostrar
	public static void Mostrar(Pessoa pessoa) { //duvida como mostrar com foreach
		System.out.println("o nome da pessoa � \t"		+pessoa.nome);
		System.out.println("o genero da pessoa � \t"	+pessoa.genero);
		System.out.println("o peso da pessoa � \t"		+pessoa.peso);
		System.out.println("a altura da pessoa � \t"	+pessoa.altura);
		System.out.println("a idade da pessoa � \t"		+pessoa.idade);
		System.out.println("o cpf da pessoa � \t"		+pessoa.cpf);
		System.out.println("o estado civil  � \t"		+pessoa.estadoCivil);
	}
	
	//pular
	public static void PularUmaLinha() {
		System.out.println("");
	}
	
	//cria pessoa
	//duvida, o objeto fulano deixa de existir fora desse metodo?
	public static Pessoa CriarPessoa(String nome, char genero, Double peso, double altura, int idade, int cpf) {
		Pessoa fulano 	= new Pessoa();
		fulano.nome 	= nome;
		fulano.genero 	= genero;
		fulano.peso 	= peso;
		fulano.altura 	= altura;
		fulano.idade 	= idade;
		fulano.cpf		= cpf;
		return fulano;
	}
	
	//cria pessoa 1
//	public static Pessoa CriarPessoa1() {
//		Pessoa p1 	= new Pessoa();
//		p1.nome 	= "Ronaldo";
//		p1.genero 	= 'M';
//		p1.peso 	= 72.5;
//		p1.altura 	= 1.75;
//		p1.idade 	= 29;
//		return p1;
//	}
	
	//cria pessoa 2
//	public static Pessoa CriarPessoa2() {
//		Pessoa p2 	= new Pessoa();
//		p2.nome 	= "Ana";
//		p2.genero 	= 'F';
//		p2.peso 	= 60.0;
//		p2.altura 	= 1.65;
//		p2.idade 	= 27;
//		return p2;
//	}
	
	
	//cria um nome para a pessoa
//	static int cont = 0;
//	public static String CriarNome() {
//		cont++;
//		String nome = "p"+cont;
//		return nome;
//	}
}

/*
2. Crie uma classe Pessoa com os seguintes atributos Nome, Genero, Peso, Altura e
Idade.
   Em uma classe para testes, Instancie dois objetos. Um homem e uma mulher. Defina
os dados de cada um dos objetos e imprima na tela
*/

/*
3. Altere a classe Pessoa: Crie propriedade �EstadoCivil� para a classe e um m�todo
que Casar, que altera a situa��o do EstadoCivil para �Casado�.

Lembre-se de que uma pessoa sempre �nasce� solteira.

Teste o funcionamento da classe

4. Altere o m�todo Casar da classe Pessoa para a seguinte l�gica:

Se a pessoa j� for casada o m�todo deve retornar um texto �Pessoa j� � casada�

Se n�o, o atributo estado civil � alterado e o m�todo retornar� �Ok�
 */

/*
DESAFIO

(Primeira parte)

Crie uma propriedade CPF para a classe pessoa;

Crie uma tabela de banco de dados para gravar dados de pessoas e um m�todo
Salvar que insira os dados do objeto pessoa nessa tabela.

(Segunda parte)

Altere o m�todo Salvar de forma que, se a pessoa n�o existir no banco de dados,
ser� inserida. Se a pessoa j� existir, seus dados ser�o atualizados.
*/

//perguntar se o objeto fulano s� exite dentro do m�todo (pra que n precise instanciar ronaldo)