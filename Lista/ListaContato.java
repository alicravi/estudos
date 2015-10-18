public class ListaContato{
	public Contato pLista;

	public void iniciar(){
		pLista = null;
	}
	public void inserirNoInicio (String n, long f){
		Contato novo = new Contato(); //criado novo objeto
		novo.nome = n;
		novo.fone = f;
		novo.proximo = pLista;
		pLista = novo;
	}
	public void imprimir(){
		Contato aux = pLista;
		while (aux != null){
			System.out.println ("Nome" + aux.nome);
			System.out.println ("Fone" + aux.fone);
			aux = aux.proximo;
		}
	}
	public int contar(){
		Contato aux = pLista;
		int cont = 0;
		while (aux != null){
			cont++;
			aux = aux.proximo;
		}
		return cont;
	}
	public void inserirNoFinal (String n, long f){
		if (pLista == null){
			aux = aux.proximo;
			inserirNoInicio(n,f);
		} else {
			Contato novo = new Contato;
			novo.nome = n;
			novo.fone = f;
			novo.proximo = null;
			aux.proximo = novo;
		}
	}
	public Contato localizar (String n){
		Contato aux = pLista;
		while (aux != null){
			if (aux.conteudo.equals(n)){
				return aux;
			}
			aux = aux.proximo;
		}
		return null;
	}
	public Contato removerPrimeiroContato(){
		Contato aux = pLista;
		if (plista != null){
			plista = pLista.proximo
		}
		return aux;
	}
	public Contato removerContato(String n){
		Contato aux = pLista;
		if (aux != null){
			if (aux.nome.equals (n)){
				pLista = pLista.proximo;
				return aux;
			}
		} else {
			while (aux.proximo != null){
				if (aux.proximo.nome.equals(n)){
					Contato temp = aux.proximo;
					aux.proximo = aux.proximo.proximo;
					return temp;
				}
				aux = aux.proximo;
			}
		}
		return null;
	}
}