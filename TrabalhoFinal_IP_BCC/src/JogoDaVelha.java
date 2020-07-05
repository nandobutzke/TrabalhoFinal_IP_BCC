import java.util.Scanner;

public class JogoDaVelha {

	public static JogoDaVelha_Mapa jogoMapa;
	public JogoDaVelha_PC jogoPC;
	public JogoDaVelha_Jogador jogoJogador;
	
	public static void jogar(Scanner teclado) {
		JogoDaVelha_Mapa.desenha(1);
		
		JogoDaVelha_Mapa.limpaMapa();
		
		int sorteio;
		sorteio = JogoDaVelha_Mapa.sortear(1,2);
		
		if(sorteio == 1)
			JogoDaVelha_Jogador.joga(teclado);
	    else if(sorteio == 2)
	    	JogoDaVelha_PC.joga();
		
		if(JogoDaVelha_Jogador.checaGanhador() == true || JogoDaVelha_PC.checaGanhador() == true) {
			
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
	
	public static void main(String[] args) {	
		Scanner tec = new Scanner(System.in);
		
		JogoDaVelha_Mapa mapaJogo = new JogoDaVelha_Mapa();
		//JogoDaVelha_PC pc = new JogoDaVelha_PC(jogoMapa);
		//JogoDaVelha_Jogador jogador = new JogoDaVelha_Jogador(jogoMapa);
		
		JogoDaVelha.jogar(tec);
		
		//jogoMapa.ganhou('x');
		//jogar(tec);
		//char jogarNovamente = tec.next().charAt(0);
		
		//if(jogarNovamente == 's')
		
		tec.close();
	}

}
