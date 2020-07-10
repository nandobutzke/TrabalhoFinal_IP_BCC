public class JogoDaVelha_PC {

 

    public JogoDaVelha_Mapa mapa;
    public static char letra = 'O';        //Usar letra 'O'
    
    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }
    
    
    public boolean joga() {
        
        mapa = new JogoDaVelha_Mapa();
        
        int linha = mapa.sortear(0, 3);
        int coluna = mapa.sortear(0, 3);
        

 

        boolean verificar = mapa.jogar(linha, coluna, letra);
        
        if(!verificar) {
            System.out.println("jogada do PC inválida, campo ocupado");
            joga();
        }
        
//        if(verificar) {
//            return true;
//        }
        
        
        return true;
    }
}
