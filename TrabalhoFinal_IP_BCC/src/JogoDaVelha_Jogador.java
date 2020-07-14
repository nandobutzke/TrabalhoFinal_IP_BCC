import java.util.Scanner;
public class JogoDaVelha_Jogador {

    public JogoDaVelha_Mapa mapa;
    public static char letra = 'X';                //Usar letra 'X'

    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }
    
    public boolean joga(Scanner teclado) {

        int linha, coluna;
        do {
        	System.out.println("linha:");
        	linha = teclado.nextInt();
        	System.out.println("coluna:");
        	coluna = teclado.nextInt();
        	
        	if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            	System.out.println("Fora da caixa");
            }
        	
        } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2);
        
        
        
        boolean verificar = mapa.jogar(linha, coluna, letra);
        
        if(!verificar) {
            System.out.println("jogada inválida, campo ocupado");
            joga(teclado);
        }

        return true;

    }
}
