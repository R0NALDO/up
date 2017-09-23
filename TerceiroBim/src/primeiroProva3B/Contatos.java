package primeiroProva3B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import primeiroProva3B.Pessoa;

public class Contatos {
	
	 ArrayList<Pessoa> listaContatos = new ArrayList<>();
	
	public void Inserir() throws ClassNotFoundException, SQLException{
		

			Class.forName(			"com.mysql.jdbc.Driver");
			String 		stgCnxo = 	"jdbc:mysql://localhost/ronaldo?autoReconnect=true&useSSL=false";
			Connection 	cnxo = DriverManager.getConnection(stgCnxo,"root", "");
			Statement 	cmdo = cnxo.createStatement();
			
			for (Pessoa p : listaContatos) {
				String 	sql = "INSERT INTO CONTATOS (NOME, TELEFONE, EMAIL, ANIVERSARIO) VALUES ('"+	
						p.nome+"','"+
						p.telefone+"',"+
						p.email+","+
						p.aniversario+"');";
				String 	msgm = (cmdo.execute(sql)) ? "não gravou" : "ok, gravou"; 
				System.out.println(msgm);
				cnxo.close();
		}
	}
	
	public void CarregarArquivo(){
		String[] vetor = new String[4];
		String caminhoArquivo = "C:\\Users\\Ronaldo\\Desktop\\dados.csv";
	try {
		FileReader arquivoLido = new FileReader(caminhoArquivo); 	// objeto que carrega o arquivo na ram
		BufferedReader leitor = new BufferedReader(arquivoLido); 	//objeto que manipula o arquivo
		String linha = leitor.readLine(); 							//lê a primeia linha do arquivo

		while (linha != null) {
			vetor = linha.split(","); 		//separa com virgula e joga cada elemento no vetor
			Pessoa p = new Pessoa();
			p.nome 		= vetor[0];
			p.telefone 	= vetor[1];
			p.email 	= vetor[2];
			p.aniversario = vetor[3];
			
			listaContatos.add(p);
			
//			leitor.close();
			}
		}
	 catch (Exception e) {				
		System.out.println("não foi possivel ler o arquivo, tente novamente");
	 	}
	}
	
	public Contatos Localizar(String nome)throws ClassNotFoundException, SQLException{
		Contatos c = new Contatos();
		
		Class.forName("com.mysql.jdbc.Driver");
		String 		stgCnxo = "jdbc:mysql://localhost/prova3b?autoReconnect=true&useSSL=false";
		Connection 	conexao = DriverManager.getConnection(stgCnxo, "root", "");
		Statement 	comando = conexao.createStatement();
		String 		sql 	= "SELECT * FROM CONTATOS WHERE NOME ="+nome;
		ResultSet 	resultado 	= comando.executeQuery(sql);
		
//		while (resultado.next()){
			Pessoa p = new Pessoa();
			p.nome 	= resultado.getString("NOME");
			p.telefone 	= resultado.getString("TELEFONE");
			p.email 	= resultado.getString("EMAIL");
			p.aniversario 	= resultado.getString("ANIVERSARIO");
//		}
		
		c.listaContatos.add(p);
		return c;
	}
}


