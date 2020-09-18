package double_dispatch_pattern;

public class VeiculoDiurno extends Veiculo {
	private double preco;

	public VeiculoDiurno(double placa, double preco) {
		super(placa);
		this.preco = preco;
	}
	
	@Override	
	public void addPropriedades(Estacionamento estacionamento) {
		super.addPropriedades(estacionamento);
		estacionamento.addPropriedade(PropriedadesEstacionamento.PRECO_DIURNO, preco);
	}
}
