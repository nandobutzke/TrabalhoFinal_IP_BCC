import java.util.Scanner;

 

public class JogoDaVelha {
    
    private static JogoDaVelha_Mapa jogoMapa;
    private static JogoDaVelha_PC jogoPC;
    private static JogoDaVelha_Jogador jogoJogador;

 

    private static void jogar(Scanner teclado) {

 

        jogoMapa.limpaMapa();
        int sortear = jogoMapa.sortear(0, 2);

 

        for (int jogada = 1; jogada < 10; jogada++) {

 

            if (jogoMapa.ganhou('X')) {
                System.out.println("... Jogador GANHOU!");
                break;
            }

 

            if (jogoMapa.ganhou('O')) {
                System.out.println("... PC GANHOU!");
                break;
            }
            

 

            if (sortear == 0) {
                System.out.println("PC[,]");
                jogoPC.joga();
                jogoMapa.desenha(jogada);
                sortear++;
            }

 

            if (sortear == 1) {
                System.out.println("Jogador ..");
                jogoJogador.joga(teclado);
                jogoMapa.desenha(jogada);
                sortear--;
            }
        }

 

        if (!jogoMapa.ganhou('O') && !jogoMapa.ganhou('X')) {
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
        }

 

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

 

        jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
        jogoPC = new JogoDaVelha_PC(jogoMapa);
        jogoMapa = new JogoDaVelha_Mapa();

 

        
        
        JogoDaVelha.jogar(tec);

 

        

 

        tec.close();
    }
}
