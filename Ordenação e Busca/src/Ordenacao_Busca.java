
public class Ordenacao_Busca {
		
	public int[] ordem (int[] vet, int chave){		
		int aux = 0, i;
		
		for (i = 0; i < vet.length; i++){ //ordenação bubble sort
			for (int j = 0; j < vet.length - 1; j++){ 				
				if (vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
		return vet;
	}
				
	public int busca (int[] vet, int chave){	
		int meio;
		int fim = vet.length - 1;
		int inicio = 0;
		
		while (inicio <= fim){ //busca binária			
			meio = (fim + inicio/2);
			
			if (chave == vet[meio]){
				return meio;
			}
			if (chave < vet[meio]){
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}		
		return -1;
	}
}
