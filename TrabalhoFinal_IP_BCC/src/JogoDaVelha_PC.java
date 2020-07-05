
public class JogoDaVelha_PC {

 public JogoDaVelha_Mapa mapa;
		public char letra = 'O';
		
		public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
			char linha = 0;
			char coluna = 0;
			char letra[][] = new char[linha][coluna];
			
			
			do {
				linha = (char) Math.random();
				coluna = (char) Math.random();
			} while(letra[linha][coluna] != 0);
		}
		
			public static int vez() {
			
			int testeJogada = JogoDaVelha_PC.vez();
			
			if(testeJogada % 2 == 1) {
				return 1;
			} else {
				return 2;
			}
		}
		
		public static boolean joga() {
			boolean verify;
	        int row,
	            col;
	        
	        do {
	            System.out.println("linha:");
	            row = (int) Math.random();
	            System.out.println("coluna:");
	            col = (int) Math.random();
	            if ((row <= 2) && (col <= 2)) {
	                verify = true;
	            } else {
	                verify = false;
	            }
	        } while (verify == false);
	       
	        return true;
		}
}
