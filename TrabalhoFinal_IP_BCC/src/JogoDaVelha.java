import java.util.Scanner;

public class JogoDaVelha {

	private static JogoDaVelha_Mapa jogoMapa;
	private static JogoDaVelha_PC jogoPC;
	private static JogoDaVelha_Jogador jogoJogador;
	
	public static void main(String[] args) {	
		Scanner tec = new Scanner(System.in);
		JogoDaVelha.jogar(tec);
		
		jogoJogador = new JogoDaVelha_Jogador(jogoMapa);
		jogoPC = new JogoDaVelha_PC(jogoMapa);
		jogoMapa = new JogoDaVelha_Mapa();
		
		tec.close();
	}
	
	
	private static void jogar(Scanner teclado) {
		
		jogoMapa.limpaMapa();
		int sortear = jogoMapa.sortear(0, 2);
		
		jogoMapa.desenha(1);
		
		for(int jogada = 0; jogada < 10; jogada++) {
			
			if(jogoMapa.ganhou('X')) {
				System.out.println("Jogador ganhou a partida =)");
				break;
			}
			
			if(jogoMapa.ganhou('O')) {
				System.out.println("PC ganhou a partida =(");
				break;
			}
			
			if(sortear == 0) {
				jogoPC.joga();
				sortear++;
			}
			
			if(sortear == 1) {
				jogoJogador.joga(teclado);
				sortear--;
			}
			
			jogoMapa.desenha(jogada);
		
		}
		
		if(!jogoMapa.ganhou('O') && !jogoMapa.ganhou('X')) {
			System.out.println("O jogo empatou!!");
			
			System.out.println("_____________________________");
			
		    System.out.println("Deseja jogar novamente (s/n)?");
		        
		    char jogarNovamente = teclado.next().charAt(0);
		       
		    if (jogarNovamente == 's') {
		            JogoDaVelha.jogar(teclado);
		    } else if (jogarNovamente == 'n') {
		            System.out.print("--- FIM ---");
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
}
