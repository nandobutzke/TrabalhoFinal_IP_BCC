
public class JogoDaVelha_PC {

    public JogoDaVelha_Mapa mapa;
    public static char letra = 'O';        
    
    public JogoDaVelha_PC(JogoDaVelha_Mapa mapa) {
        this.mapa = mapa;
    }

    public boolean joga() {
        int linha = mapa.sortear(0, 3);				//sorteia a linha em que será adicionado o caracter 'O' do PC.
        int coluna = mapa.sortear(0, 3);			//sorteia a coluna em que será adiconado o caracter 'O' do PC.
        
        String posicaoPC = "PC[" + linha + "," + coluna + "]";		//String que atribui a posição da jogada do PC

        boolean verificar = mapa.jogar(linha, coluna, letra);		//variável e método que verificam se a posição recebe um espaço ' '. 
        
        if(!verificar) {		//caso o espaço estiver ocupado pelo caracter 'O', irá executar o método joga novamente
            joga();
        } else {
        	System.out.println(posicaoPC);			//escreve a posição da jogada caso a mesma não estiver ocupada
        }
        
        return true;
    }
}
