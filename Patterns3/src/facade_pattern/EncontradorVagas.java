package facade_pattern;

public class EncontradorVagas {
	private Vaga terreo;
	private Vaga cobertura;
	private Vaga andar;
	
	public EncontradorVagas() {
		super();
		terreo = new Terreo();
		cobertura = new Cobertura();
		andar = new Andar();
	}
	public void encontraVagaTerreo() {
		terreo.encontraVaga();
	}
	
	public void encontraVagaCobertura() {
		cobertura.encontraVaga();
	}
	
	public void encontraVagaAndar() {
		andar.encontraVaga();
	}

}
