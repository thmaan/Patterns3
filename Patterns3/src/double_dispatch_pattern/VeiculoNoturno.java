package double_dispatch_pattern;

public class VeiculoNoturno extends Veiculo {
	private double preco;
	private double custoExtra;
	
	public VeiculoNoturno(double placa, double preco) {
		super(placa);
		this.preco = preco;
		this.custoExtra = 100;
	}
	
	@Override
	public void addPropriedades(Estacionamento estacionamento) {
		super.addPropriedades(estacionamento);
		estacionamento.addPropriedade(PropriedadesEstacionamento.PRECO_PERNOITE, preco);
		estacionamento.addPropriedade(PropriedadesEstacionamento.CUSTO_EXTRA, custoExtra);
	}
}
