
public class paráfrase {

	public static void main(String[] args) {
		
		// o primeiro passo é criar três matrizes de String(listas) e preenche-la com o que quisermos.
		String[]listaUm = {"amanhã", "depois de amanhã", "dia 15", "mês que vem", "no aniversário dela", "nas férias", "na escola", "na casa do meu tio", "no Mirabilandia", "na praia de Boa Viagem"

		};
		String[]listaDois = {"vou jogar futebol", "vou jogar video game", "vou assistir desenho", "vou assistir a um filme", "vou jogar Magic", "vou tomar uma", "vou almoçar", "farei exercício de matemática", "assistirei o Sport jogar", "estudarei JAVA" 
				
		};
		String[]listaTres = {"vai ser divertido", "será difícil", "não vai ser legal", "preferia fazer outra coisa", "era melhor ter ido assistir ao filme do Pelé", "só to indo pq me obrigaram", "deixei de pegar uma boisinha pra isso?", "estava animado pra isso", "não vejo a hora de fazer novamente", "vou ensinar como se faz", "ó, céus. Ó, vida!"
				
		};
		// vamos descobrir o tamanho de cada matriz(listaUm, listaDois e listaTres)
		int tamanhoUm = listaUm.length; // nesse caso, o tamanho da lista é 10
		int tamanhoDois = listaDois.length; // aqui, coincidentemente, também é 10
		int tamanhoTres = listaTres.length; // int tamanhoTres = 11
		
		// vamos gerar tres numeros aleatórios, lembrando que o método "random" retorna um número aleatório entre 0 e QUASE 1, ou seja, ele retornará um número REAL(double), por isso foi necessário converter a variável para INT com a inserção do (int)
		// é preciso fazer com números inteiros, decimais não são permitidos.
		int rand1 = (int) (Math.random() * tamanhoUm);
		int rand2 = (int)(Math.random() * tamanhoDois);
		int rand3 = (int) (Math.random() * tamanhoTres);
		
		// hora de construir uma frase misturando as tres listas(matrizes)
		String frase = listaUm[rand1] + " " + listaDois[rand2] + " e " + listaTres[rand3];
		
		// e por fim, exibiremos a frase criada aleatoriamente
		System.out.println(frase);
	}
}