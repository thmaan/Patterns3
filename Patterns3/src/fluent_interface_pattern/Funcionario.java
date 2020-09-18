package fluent_interface_pattern;

public class Funcionario {
	private String nome;
	private String nascidoEm;
	private PostoDeTrabalho role;
	
	public Funcionario chamado(String nome) {
		this.nome = nome;
		return this;
	}	
	public Funcionario nascidoEM(String nascimento) {
		this.nascidoEm = nascimento;
		return this;
	}	
	public Funcionario queTrabalhaDe(PostoDeTrabalho role) {
		this.role = role;
		return this;
	}
	public String getNome() {
		return nome;
	}
	public String getNascidoEm() {
		return nascidoEm;
	}
	public PostoDeTrabalho getRole() {
		return role;
	}	
	
}
