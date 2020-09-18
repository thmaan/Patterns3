package fluent_interface_pattern;

public class PostoDeTrabalho {
	private String nome;
	
	public PostoDeTrabalho chamado(String nome) {
		this.nome = nome;
		return this;
	}

	public String getName() {
		return nome;
	}
	
}
