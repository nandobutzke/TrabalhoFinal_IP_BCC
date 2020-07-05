
public class JogoDaVelha_Jogador {

  public JogoDaVelha_Mapa mapa;
    char letra = 'X';
    
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

 	
	// Não sei se essa porra vai dar certo   
	
	public static int vez(){
	    
		int testeJogada = JogoDaVelha_Jogador.vez();
		
		if(testeJogada %2 == 1)
	        return 1;
	    else
	        return 2;
		}
	// essa porra de cima

 

 	public int ganhou(){
	 	
 		if(mapa.checaLinhas() == 1 && mapa.checaColunas() == 1 && mapa.checaDiagonais() == 1)
	        return 1;
	    
	    if(mapa.checaLinhas() == -1 && mapa.checaColunas() == -1 && mapa.checaDiagonais() == -1)
	        return -1;
    
	    return 0;
	}

 
}
