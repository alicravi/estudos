

import java.util.*;

public class Ordenando_Buscando {

	public static void main(String[] args) {
		
		int[] vet = new int [10];
		Scanner input = new Scanner(System.in); //classe de leitura pelo console
		
		for (int i = 0; i < vet.length; i++){
			System.out.print("Entre com o elemento " + (i + 1) + " do vetor: ");
			vet[i] = input.nextInt();
		}
		System.out.println(" ");
		System.out.print("Entre com a chave: ");
		int chave = input.nextInt();
			
		Ordenacao_Busca ord_busca = new Ordenacao_Busca();
		vet = ord_busca.ordem(vet, chave);
		int posicao = ord_busca.busca(vet, chave);
		
		System.out.println(" ");
		System.out.print("VETOR ORDENADO: ");
		for (int i = 0; i < vet.length; i++){
			System.out.print(vet[i] + "[posição " + i + "]" + " ");
		}
		System.out.println(" ");
		
		if (posicao < 0){
			System.out.println("Chave não encontrada!");
		} else {
			System.out.println("A CHAVE " + chave +  " FOI ENCONTRADA NA POSIÇÃO " + posicao + " DO VETOR ORDENADO.");
		}				

	}

}
