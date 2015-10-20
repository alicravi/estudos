
public class BubbleSort {

	public static void main (String args[]){
		
		int[] vet = {8,9,3,5,1};
		int aux = 0;
		int i;
		
		System.out.println("VETOR DESORDENADO: ");
		for (i = 0; i < 5; i++){
			System.out.print(" " + vet[i]);
		}
		System.out.println(" ");
		
		//ORDENANDO O VETOR
		for (i = 0; i < 5; i++){ //QUANTIDADE DE ELEMENTOS NO VETOR = QUANTIDADE DE VOLTAS NO LAÇO. UMA VOLTA PARA CADA ELEMENTO
			for (int j = 0; j < 4; j++){ //CADA ELEMENTO VAI SER COMPARADO COM 4 OUTROS
				if (vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
				System.out.println(" ");
				System.out.println("ORDENANDO: ");
				System.out.println(" ");
				for (int k = 0; k < 5; k++){
					System.out.print(" " + vet[k]);
				}
				System.out.println(" ");
			}
		}
	}	
}
