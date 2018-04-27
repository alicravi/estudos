
public class SelectionSort {

	public static void main(String[] args) {
		
		int vet[] = {8,9,3,5,1};
		int aux = 0;
		
		for (int i = 0; i < vet.length; i++){
			for (int j = 0; j < vet.length; j++){
				if (vet[j] < vet[i]){ //PROCURA O MENOR ELEMENTO
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
			}
		}
		
		System.out.println("VETOR ORDENADO: ");
		for (int k = 0; k < 5; k++){
			System.out.print(" " + vet[k]);
		}
	}
}
