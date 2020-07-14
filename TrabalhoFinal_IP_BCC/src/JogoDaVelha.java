import java.util.Scanner;

public class JogoDaVelha {
    
    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPC;
    private static JogoDaVelha_Jogador jogoJogador;

    private static void jogar(Scanner teclado) {

        jogoMapa.limpaMapa();
        int X = jogoMapa.sortear(0, 2);

        for (int jogada = 1; jogada < 10; jogada++) {

        	
        	if (jogoMapa.ganhou('O')) {
                System.out.println("... PC GANHOU!");
                break;
            } 
            
        	
        	if (jogoMapa.ganhou('X')) {
                System.out.println("... Jogador GANHOU!");
                break;
            } 
        	
        	
        	
            if (X == 0) {
                jogoPC.joga();
                jogoMapa.desenha(jogada);
                X++;
            }


            if (X == 1) {
                System.out.println("Jogador ..");
                jogoJogador.joga(teclado);
                jogoMapa.desenha(jogada);
                X--;
            }
        }
        
//        if((mapa[0][0] == jogador && mapa[1][0] == jogador && mapa[2][0] == jogador) &&
//                (mapa[0][1] == jogador && mapa[1][1] == jogador && mapa[2][1] == jogador) &&
//                (mapa[0][2] == jogador && mapa[1][2] == jogador && mapa[2][2] == jogador)) { 
//            System.out.println("O jogo empatou!!");
//
//            System.out.println("_____________________________");
//
//            System.out.println("Deseja jogar novamente (s/n)?");
//
//            char jogarNovamente = teclado.next().charAt(0);
//
//            if (jogarNovamente == 's') {
//                JogoDaVelha.jogar(teclado);
//            } else if (jogarNovamente == 'n') {
//                System.out.print("--- FIM ---");
//                jogoMapa.limpaMapa();
//            }
//        }
        
        System.out.println("_____________________________");

        System.out.println("Deseja jogar novamente (s/n)?");

        char jogarNovamente = teclado.next().charAt(0);

        if (jogarNovamente == 's') {
            JogoDaVelha.jogar(teclado);
        } else if (jogarNovamente == 'n') {
            System.out.print("--- FIM ---");
        }
    }


    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        jogoMapa = new JogoDaVelha_Mapa();
        jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
        jogoPC = new JogoDaVelha_PC(jogoMapa);
        

        JogoDaVelha.jogar(tec);

        tec.close();
    }
}
