import java.util.Scanner;
public class JogoDaVelha {
    
    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPC;
    private static JogoDaVelha_Jogador jogoJogador;

    private static void jogar(Scanner teclado) {

        jogoMapa.limpaMapa();							//Adiciona o caracter ' ' em todas as posições							
        int sorteio = jogoMapa.sortear(0, 2);			//Variável que recebe método sortear (controla quem vai começar e a vez de cada jogador)

        for (int jogada = 1; jogada < 10; jogada++) {			//Controla as jogadas

            if (sorteio == 0) {				//jogada do PC
                jogoPC.joga();
                jogoMapa.desenha(jogada);
                sorteio++;
            } else {
                System.out.println("Jogador ..");				//Jogada do jogador
                jogoJogador.joga(teclado);
                jogoMapa.desenha(jogada);
                sorteio--;
            }
            
            if (jogoMapa.ganhou('O')) {							//Verifica a cada joggada se o PC ganhou
                System.out.println("... PC GANHOU!");
                break;
            }
           
            if (jogoMapa.ganhou('X')) {
                System.out.println("... Jogador GANHOU!");		//Verifica a cada jogada se o Jogador ganhou
                break;
            }            
        }
        
        if(!jogoMapa.ganhou('O') && !jogoMapa.ganhou('X')) { 			//Em caso de empate, pergunta se deseja jogar novamente
            System.out.println("O jogo empatou!!");						
            
            System.out.println("_____________________________");

            System.out.println("Deseja jogar novamente (s/n)?");

            char jogarNovamente = teclado.next().charAt(0);

            if (jogarNovamente == 's') {
                JogoDaVelha.jogar(teclado);
            } else if (jogarNovamente == 'n') {
                System.out.print("--- FIM ---");
                jogoMapa.limpaMapa();
            }
        } else {
        
            System.out.println("_____________________________");	//Controla se deseja jogar novamente quando um dos joadores vence a partida

            System.out.println("Deseja jogar novamente (s/n)?");

            char jogarNovamente = teclado.next().charAt(0);

            if (jogarNovamente == 's') {
                JogoDaVelha.jogar(teclado);
            } else if (jogarNovamente == 'n') {
                System.out.print("--- FIM ---");
            }
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
