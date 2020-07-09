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
				System.out.println("Jogador ganhou a partida =)");
				break;
			}

			if (jogoMapa.ganhou('O')) {
				System.out.println("PC ganhou a partida =(");
				break;
			}

			if (sortear == 0) {
				jogoPC.joga();
				sortear++;
			}

			if (sortear == 1) {
				jogoJogador.joga(teclado);
				sortear--;
			}

			jogoMapa.desenha(jogada);

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
				return;
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

		int sorteio = jogoMapa.sortear(0, 2);

		if (sorteio == 1) {
			System.out.println("Jogador ..");
			jogoJogador.joga(tec);
		} else if (sorteio == 0) {
			System.out.println("PC[,]");
			jogoPC.joga();
		}

		tec.close();
	}
}

