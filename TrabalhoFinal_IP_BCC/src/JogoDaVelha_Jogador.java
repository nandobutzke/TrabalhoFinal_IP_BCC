import java.util.Scanner;

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

 	
	// --------------------------------
	
	public static int vez(){
	    
		int testeJogada = JogoDaVelha_Jogador.vez();
		
		if(testeJogada % 2 == 1)
	        return 1;
	    else
	        return 2;
		}
	// ---------------------------------

 	public static boolean checaGanhador(){
	 	
 		if(JogoDaVelha_Mapa.checaLinhas() == 1 && JogoDaVelha_Mapa.checaColunas() == 1 && JogoDaVelha_Mapa.checaDiagonais() == 1)
	        return true;
	    
	    if(JogoDaVelha_Mapa.checaLinhas() == -1 && JogoDaVelha_Mapa.checaColunas() == -1 && JogoDaVelha_Mapa.checaDiagonais() == -1)
	        return false;
    
	    return false;
 	}
 	
 		/* public static int checaGanhador(){
	 	
 		if(JogoDaVelha_Mapa.checaLinhas() == 1 && JogoDaVelha_Mapa.checaColunas() == 1 && JogoDaVelha_Mapa.checaDiagonais() == 1)
	        return 1;
	    
	    if(JogoDaVelha_Mapa.checaLinhas() == -1 && JogoDaVelha_Mapa.checaColunas() == -1 && JogoDaVelha_Mapa.checaDiagonais() == -1)
	        return -1;
    
	    return 0; 
 	} */

}
