package ifsc;

public class MainGit {

	public Double calcMultiplicacao(Double[] vet, Double[] newVet) {
		for (int i = 0; i < vet.length; i++) {
			newVet[i] = vet[i] * vet[i];
		}
		
		return newVet;	 
	}
}

