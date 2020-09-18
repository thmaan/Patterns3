package command_pattern;

public class InserirOutros implements Comando {
	private String placa;
	private double valor;
	private String vaga;
	
	public InserirOutros(String placa, String vaga) {
		super();
		this.placa = placa;
		this.valor = 50;
		this.vaga = vaga;
	}

	@Override
	public String fazer() {
		return placa.concat(" Custará: "+ String.valueOf(valor) + " reais").concat(" na vaga." + vaga);
	}

	@Override
	public String desfazer() {
		return "Inserir outro foi desfeito";
	}

}
