package primeiroProva3B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//le arquivo e filtra a busca
public class Principal {

	public static void main(String[] args) throws IOException {
	
	String caminhoArquivo = "C:\\Users\\Ronaldo\\Desktop\\dados.csv";
	FileReader arquivoLido = new FileReader(caminhoArquivo); 	// objeto que carrega o arquivo na ram
	BufferedReader leitor = new BufferedReader(arquivoLido); 	//objeto que manipula o arquivo
	String linha = leitor.readLine(); 							//lê a primeia linha do arquivo
	
	String[] vetor = new String[4];

		while (linha != null) {
			vetor = linha.split(";"); 		//separa com virgula e joga cada elemento no vetor
			Pessoa ron = new Pessoa();
			ron.nome 		= vetor[0];
			ron.telefone 	= vetor[1];
			ron.email 		= vetor[2];
			ron.aniversario = vetor[3];
			linha 			= leitor.readLine();
			if (ron.aniversario.contains("%s")) {
				ron.aniversario = "ok";
				System.out.println("ok");
				System.out.println("ok");
				
			}
			System.out.println(vetor[0]+" "+
//			resultado[1]+" "+
//			resultado[2]+" "+
			vetor[3]);
		}
	}
}
