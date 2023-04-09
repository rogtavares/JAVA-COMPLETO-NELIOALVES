import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeConteudoArquivo {
public static void main(String[] args)  {

	String mostra="";
	String nomeArq="c:\\nomes.txt"; // Nome do nosso arquivo e o diret�rio que foi salvo
	String linha="";
	
	//Usar fun��o para abrir o nosso arquivo
	File arq = new File(nomeArq);
	
	// Verificando se o arquivo existe ou n�o na sua m�quina
	if(arq.exists()) {
		mostra="Arquivo -"+nomeArq+" aberto com sucesso";
		// System.out.println(mostra);
		mostra+=" Tamanho do arquivo "+Long.toString(arq.length())+" bytes";
		System.out.println(mostra);
		
		// Lendo as informa��es de dentro do nosso arquivo
		try {
			FileReader reader = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(reader);
			
			while(true) {
				linha=leitor.readLine();
				 System.out.println(linha);
				 if(linha==null)
					 break;
			}
		} catch (Exception erro) {
			System.out.println(mostra+"arquivo");
		}
	}
}
}
