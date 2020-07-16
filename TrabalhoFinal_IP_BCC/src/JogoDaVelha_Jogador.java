import java.util.Scanner;
public class JogoDaVelha_Jogador {

    public JogoDaVelha_Mapa mapa;
    public static char letra = 'X';                

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }
    
    public boolean joga(Scanner teclado) {

        int linha, coluna;
        do {
        	System.out.println("linha:");			
        	linha = teclado.nextInt();				//recebe a posição da linha que receberá o caracter 'X'.
        	System.out.println("coluna:");
        	coluna = teclado.nextInt();				//recebe a posição da coluna que receberá o caracter 'X'.
        	
        	/*Se o valor for maior que 2 ou menor que 0
			tanto para as linhas quanto para as colunas
			retornará "Fora da Caixa".	*/
        	if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            	System.out.println("Fora da caixa");					
        	}															
            															
        } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2);

        boolean verificar = mapa.jogar(linha, coluna, letra);
        
        if(!verificar) {												//caso o espaço estiver ocupado pelo caracter 'X', irá executar o método joga novamente
            System.out.println("jogada inválida, campo ocupado");
            joga(teclado);												//executa o método jogar novamente
        }

        return true;

    }
}
