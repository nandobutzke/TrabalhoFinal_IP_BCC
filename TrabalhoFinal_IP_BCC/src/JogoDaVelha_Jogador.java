
public class JogoDaVelha_Jogador {

  public JogoDaVelha_Mapa mapa;
	char letra;
	
	public JogoDaVelha_Jogador(JogoDaVelha_Mapa mapa) {
		
	}
	
	public static boolean joga(Scanner teclado) {
		boolean verify;
		int row,
		    col;

		do {
		    System.out.println("linha:");
		    row = teclado.nextInt();
		    System.out.println("coluna:");
		    col = teclado.nextInt();
		    if ((row <= 2) && (col <= 2)) {
			verify = true;
		    } else {
			verify = false;
		    }
		} while (verify == false);

		return true;
	    }
	}
}
