
public class JogoDaVelha_Mapa {

  public static char[][] mapa= new char[3][3];
	    
	    public void limpaMapa(){
	        for(int linha=0 ; linha<3 ; linha++)
	            for(int coluna=0 ; coluna<3 ; coluna++)
	                mapa[linha][coluna]=0;
	    }
	    
	    public static void desenha(int jogada){
	        System.out.println();
	        for(int linha=0 ; linha<3 ; linha++){
	        	
	            for(int coluna=0 ; coluna<3 ; coluna++){
	                
	                if(mapa[linha][coluna] == 'X') {
	                    System.out.print(mapa);
	                }
	                if(mapa[linha][coluna] == 'O') {
	                    System.out.println(mapa);
	                }
	                if(mapa[linha][coluna] == ' ') {
	                    System.out.print(mapa);
	                }
	                if(coluna==0 || coluna==1)
	                    System.out.print(" | ");
	            }
	            System.out.println();
	        }
	                
	    }
	    
	    public int getPosicao(int[] tentativa){
	        return mapa[tentativa[0]][tentativa[1]];
	    }
	    
	    public static void setPosicao(int[] tentativa, int jogador){
	        if(jogador == 1)
	            mapa[tentativa[0]][tentativa[1]] = 1;
	        else
	            mapa[tentativa[0]][tentativa[1]] = 1;
	        
	    }

	 

	    public int checaLinhas(){
	        for(int linha=0 ; linha<3 ; linha++){

	 

	            if( (mapa[linha][0] + mapa[linha][1] + mapa[linha][2]) == -3)
	                return -1;
	            if( (mapa[linha][0] + mapa[linha][1] + mapa[linha][2]) == 3)
	                return 1;
	        }
	        
	        return 0;
	                
	    }
	    
	    public static int checaColunas(){
	        for(int coluna=0 ; coluna<3 ; coluna++){

	 

	            if( (mapa[0][coluna] + mapa[1][coluna] + mapa[2][coluna]) == -3)
	                return -1;
	            if( (mapa[0][coluna] + mapa[1][coluna] + mapa[2][coluna]) == 3)
	                return 1;
	        }
	        
	        return 0;
	                
	    }
	    
	    public static int checaDiagonais(){
	        if( (mapa[0][0] + mapa[1][1] + mapa[2][2]) == -3)
	            return -1;
	        if( (mapa[0][0] + mapa[1][1] + mapa[2][2]) == 3)
	            return 1;
	        if( (mapa[0][2] + mapa[1][1] + mapa[2][0]) == -3)
	            return -1;
	        if( (mapa[0][2] + mapa[1][1] + mapa[2][0]) == 3)
	            return 1;
	        
	        return 0;
	    }

	 

	    public static boolean ganhou(char jogador){
	        for(int linha=0 ; linha<3 ; linha++)
	            for(int coluna=0 ; coluna<3 ; coluna++)
	                if( mapa[linha][coluna]==0 )
	                    return false;
	        return true;
	    }
}
