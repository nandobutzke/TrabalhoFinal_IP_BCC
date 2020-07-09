import java.util.Scanner;

public class JogoDaVelha_Jogador {

	public JogoDaVelha_Mapa mapa;
    public static char letra = 'X';				//Usar letra 'X'
    Scanner teclado = new Scanner(System.in);
    
    
    public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }
    
    public boolean joga(Scanner teclado) {
    	
    	mapa = new JogoDaVelha_Mapa();
    	
    	System.out.println("linha:");
    	int linha = teclado.nextInt();
    	System.out.println("coluna:");
    	int coluna = teclado.nextInt();

    	boolean verificar = mapa.jogar(linha, coluna, letra);
    	
    	if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
    		System.out.println("Fora da caixa!");
    		joga(teclado);
    		return false;
    	}
    	
    	if(!verificar) {
    		System.out.println("jogada inválida, campo ocupado");
    		joga(teclado);
    	}
    	
    	
    	return true;
    	
    }
}
