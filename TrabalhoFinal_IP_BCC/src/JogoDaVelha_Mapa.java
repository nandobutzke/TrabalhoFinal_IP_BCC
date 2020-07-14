public class JogoDaVelha_Mapa {
    public static char[][] mapa = new char[3][3];

    public int sortear(int inicio, int fim) {
        return (int) ((Math.random()*fim)-inicio);
    }
    
    public void limpaMapa(){
        for(int linha = 0; linha < 3; linha++)
            for(int coluna = 0; coluna <3; coluna++)
                mapa[linha][coluna] = ' ';
    }

    public void desenha(int jogada){
        
        System.out.print("-------------");
        System.out.println(" jogada: " + jogada);
        System.out.println("| " + mapa[0][0] + " | " + mapa[0][1] + " | " + mapa[0][2] + " | ");
        System.out.println("-------------");
        System.out.println("| " + mapa[1][0] + " | " + mapa[1][1] + " | " + mapa[1][2] + " | ");
        System.out.println("-------------");
        System.out.println("| " + mapa[2][0] + " | " + mapa[2][1] + " | " + mapa[2][2] + " | ");
        System.out.println("-------------");
        
    }

    public boolean jogar(int l, int c, char jogador) {
    	
    	
    	if(mapa[l][c] == ' ') {
        	mapa[l][c] = jogador;
            return true;
        } else {
            return false;
        }
        
        

    }
    
    public boolean ganhou(char jogador){
        //for(int linha = 0; linha < 3; linha++)
            //for(int coluna = 0; coluna < 3 ; coluna++)
                
                //coluna
                if((mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[2][0] == jogador) ||
                    (mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][1] == jogador) ||
                    (mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador))
                     return true;
                
                //linha
                if((mapa[0][0] == jogador && mapa[0][1] == jogador && mapa[0][2] == jogador) ||
                    (mapa[1][0] == jogador && mapa[1][1] == jogador && mapa[1][2] == jogador) ||
                    (mapa[2][0] == jogador && mapa[2][1] == jogador && mapa[2][2] == jogador))
                     return true;
                
                //diagonal
                if((mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador) ||
                    (mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador))
                     return true;
                
                
                	return false;
   }
  
}
