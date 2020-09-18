package flyweight_pattern;

public class VagaUnica implements Vaga {
	private final String codigo;

	protected VagaUnica(String codigo) {
		this.codigo = codigo;
		
	}
	@Override
	public String getVaga() {
		return codigo;
	}
	
}
