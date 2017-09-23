package primeiroProva3B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);
	String nome = "";
	String telefone = "";
	String email = "";
	String aniversario = "";
	int idade = 0;
	String op = "";

	String[] resultado = new String[4];
	String caminhoArquivo = "C:\\Users\\Ronaldo\\Desktop\\dados.csv";
try {
	FileReader arquivoLido = new FileReader(caminhoArquivo); 	// objeto que carrega o arquivo na ram
	BufferedReader leitor = new BufferedReader(arquivoLido); 	//objeto que manipula o arquivo
	String linha = leitor.readLine(); 							//lê a primeia linha do arquivo

	while (linha != null) {
		resultado = linha.split(";"); 		//separa com virgula e joga cada elemento no vetor
		Pessoa p = new Pessoa();
		p.nome 		= resultado[0];
		p.telefone 	= resultado[1];
		p.email 	= resultado[2];
		p.aniversario = resultado[3];
		
//		listaContatos.add(p);
//		leitor.close();
		}
	}
 catch (Exception e) {				
	System.out.println("não foi possivel ler o arquivo, tente novamente");
 	}

	
//	while (op != "0") {
//		System.out.println("\n--- Sistema de Contatos ---");
//		System.out.println("1- Cadastrar contato");
//		System.out.println("2- Mostrar contato");
//		System.out.println("3- Atualizar contato");
//		System.out.println("4- Excluir contato");
//		System.out.println("0- Sair");
//		op = ler.next();
//
//		switch (op) {
//		case "1":
//
//			String[] resultado = new String[];
//			String caminhoArquivo = "C:\\Users\\Ronaldo\\Desktop\\dados.csv";
//		try {
//			FileReader arquivoLido = new FileReader(caminhoArquivo); 	// objeto que carrega o arquivo na ram
//			BufferedReader leitor = new BufferedReader(arquivoLido); 	//objeto que manipula o arquivo
//			String linha = leitor.readLine(); 							//lê a primeia linha do arquivo
//
//			while (!(linha == null)) {
//				resultado = linha.split(","); 		//separa com virgula e joga cada elemento no vetor
//				Pessoa p = new Pessoa();
//				p.nome 		= resultado[0];
//				p.telefone 	= resultado[1];
//				p.email 	= resultado[2];
//				p.aniversario = resultado[3];
//				
////				Contatos.listaContatos.add(p);
//				
////				leitor.close();
//				}
//			}
//		 catch (Exception e) {				
//			System.out.println("não foi possivel ler o arquivo, tente novamente");
//		 	}
//		
//			
////			Contatos.Inserir();
//			break;
//
//		case "2":
////			Contatos.CarregarArquivo();
//			break;
//
//		case "3":
//			//Update.Atualizar(nome);
//			break;
//
//		case "4":
//			//Delete.Excluir(nome);
//			break;
//
//		case "0":
//			System.exit(0);
//			break;
//
//		default:
//			System.out.println("opção inválida, tente novamente");
//			break;
//
//		}
//	}

	}

}
