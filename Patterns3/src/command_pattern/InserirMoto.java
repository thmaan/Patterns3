package command_pattern;

public class InserirMoto implements Comando {
	private String placa;
	private double valor;
	private String vaga;
	
	public InserirMoto(String placa, String vaga) {
		super();
		this.placa = placa;
		this.valor = 10;
		this.vaga = vaga;
	}

	@Override
	public String fazer() {
		return placa.concat(" Custará: "+ String.valueOf(valor) + " reais").concat(" na vaga." + vaga);	
	}

	@Override
	public String desfazer() {
		return "Inserir moto foi desfeito";
	}

}
