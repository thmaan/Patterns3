package double_dispatch_pattern;

public abstract class Veiculo {
	private double placa;

	public Veiculo(double placa) {
		super();
		this.placa = placa;
	}
	
	public void addPropriedades(Estacionamento estacionamento) {
		estacionamento.addPropriedade(PropriedadesEstacionamento.PLACA, placa);
	}
}
