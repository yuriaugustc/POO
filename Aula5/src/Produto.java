
public class Produto {
	public String nomeProduto;
	public float vetPreco[] = new float [5];
	
	public void atribuiPreco(int pos, float valor) {
		if((pos >= 0) && (pos < vetPreco.length))
			vetPreco[pos] = valor;
	}
	public void atribuiPreco2 (float vet[]) {
		vetPreco = vet;
	}
	
	public float retornaValor(int pos) {
		if((pos >= 0) && (pos < vetPreco.length))
			return vetPreco[pos];
		return -1;
	}
	
	public float [] retornaVetor() {
		return vetPreco;
	}
	
	public float calculaMaiorPreco() {
		int i = 0;
		float maior = vetPreco[0];
		
		for(i = 1; i < vetPreco.length; i++) {
			if(vetPreco[i] > maior) {
				maior = vetPreco[i];
			}
		}
		return maior;
	}
}