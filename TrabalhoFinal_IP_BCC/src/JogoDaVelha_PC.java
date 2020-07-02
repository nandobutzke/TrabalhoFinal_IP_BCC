
public class JogoDaVelha_PC {

  public JogoDaVelha_Mapa mapa;
	public char letra;
	
	public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
		char linha = 0;
		char coluna = 0;
		char letra[][] = new char[linha][coluna];
		
		
		do {
			linha = (char) Math.random();
			coluna = (char) Math.random();
		} while(letra[linha][coluna] != ' ');
			letra[linha][coluna] = 'O';
			
	}
	
	public static boolean joga() {
		return true;
	}
}
