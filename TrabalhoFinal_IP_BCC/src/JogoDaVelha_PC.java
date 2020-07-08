
public class JogoDaVelha_PC {

	public JogoDaVelha_Mapa mapa;
	public static char letra = 'O';		//Usar letra 'O'
	
	public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
		this.mapa = mapa;
	}

	
	public boolean joga() {
		
		mapa = new JogoDaVelha_Mapa();
    	
    	System.out.println("linha:");
    	int linha = (int) Math.random();
    	System.out.println("coluna:");
    	int coluna = (int) Math.random();

    	boolean verificar = mapa.jogar(linha, coluna, letra);
    	
    	if(linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
    		System.out.println("Fora da caixa!");
    		joga();
    		return false;
    	}
    	
    	if(verificar) {
    		System.out.println("jogada inválida, campo ocupado");
    		joga();
    	}
    	
    	
    	return true;
	}
}
