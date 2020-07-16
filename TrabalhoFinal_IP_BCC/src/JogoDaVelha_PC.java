
public class JogoDaVelha_PC {

    public JogoDaVelha_Mapa mapa;
    public static char letra = 'O';        
    
    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga() {
        int linha = mapa.sortear(0, 3);
        int coluna = mapa.sortear(0, 3);
        
        String posicaoPC = "PC[" + linha + "," + coluna + "]";

        boolean verificar = mapa.jogar(linha, coluna, letra);
        
        if(!verificar) {
            joga();
        } else {
        	System.out.println(posicaoPC);
        }
        
        return true;
    }
}
