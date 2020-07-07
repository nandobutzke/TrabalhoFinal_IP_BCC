
public class JogoDaVelha_PC {

		public JogoDaVelha_Mapa mapa;
		public static char letra = 'O';		//Usar letra 'O'
		
		public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
			this.mapa = mapa;
		}

		
		public boolean joga() {
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
