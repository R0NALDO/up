package segundo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pessoa {
	
	String 	nome;
	char 	genero;
	double 	peso;
	double 	altura;
	int 	idade;
	int		cpf;
	String 	estadoCivil = "solteiro";
	
	//faz o casamento da pessoa
	public static void Casar(Pessoa pessoa) {
		if (pessoa.estadoCivil.equals("solteiro")) { //duvida pq não se pode usar == aqui
			pessoa.estadoCivil = "casado";
			System.out.println(pessoa.nome+" agora é uma pessoa casada");
		}else {
			System.out.println("ok, essa pessoa é solteira");
		}
	}
	
	//mostra o estado civil da pessoa
	public static void MostrarEstadoCivil(Pessoa pessoa) {
		if (pessoa.estadoCivil != "solteiro") {
			System.out.println(pessoa.nome+" é uma pessoa casada");
		}else {
			System.out.println("ok, essa pessoa é solteira");
		}
	}
	
	//salva a pessoa no banco de dados
	public static void SalvarPessoa(Pessoa fulano) throws ClassNotFoundException, SQLException {
		//prepara os objetos
		Class.forName(			"com.mysql.jdbc.Driver");
		String 		stgCnxo = 	"jdbc:mysql://localhost/despesas?autoReconnect=true&useSSL=false";
		Connection 	cnxo = DriverManager.getConnection(stgCnxo,"root", "");
		Statement 	cmdo = cnxo.createStatement();
		String 		sql = null;
		//executa o comando no banco 
		sql = "INSERT INTO PESSOA (NOME, GENERO, PESO, ALTURA, IDADE, CPF, ESTADOCIVIL) VALUES ('"+	fulano.nome+"','"+
																									fulano.genero+"',"+
																									fulano.peso+","+
																									fulano.altura+","+
																									fulano.idade+","+
																									fulano.cpf+",'"+
																									fulano.estadoCivil+"');";
//		System.out.println((cmdo.execute(sql)) ? "não gravou" : "ok, gravou");
		
		String 	msgm = (cmdo.execute(sql)) ? "não gravou" : "ok, gravou"; //perguntar pq dá false quando grava
		System.out.println(msgm);
		
		cnxo.close();
	}
}

