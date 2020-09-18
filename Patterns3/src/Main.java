import command_pattern.ExecutorComandos;
import command_pattern.InserirCarro;
import command_pattern.InserirMoto;
import command_pattern.InserirOutros;
import double_dispatch_pattern.Estacionamento;
import double_dispatch_pattern.VeiculoDiurno;
import double_dispatch_pattern.VeiculoNoturno;
import facade_pattern.EncontradorVagas;
import facade_pattern.Vaga;
import fluent_interface_pattern.Funcionario;
import fluent_interface_pattern.PostoDeTrabalho;
import flyweight_pattern.VagaFactory;
import flyweight_pattern.VagaMultipla;
import flyweight_pattern.VagaUnica;


public class Main {

	public static void main(String[] args) {
		PostoDeTrabalho manobrista = new PostoDeTrabalho().chamado("Manobrista");
		PostoDeTrabalho gerente = new PostoDeTrabalho().chamado("Gerente");
		
		Funcionario thomas = new Funcionario().chamado("Thomas").nascidoEM("01/09/1997").queTrabalhaDe(manobrista);
		Funcionario lucas = new Funcionario().chamado("Lucas").nascidoEM("Um dia").queTrabalhaDe(gerente);
		
		String vaga = "";
		ExecutorComandos exec = new ExecutorComandos();
		
		vaga = exec.fazer(new InserirCarro("placa do carro 1",vaga));
		System.out.println("Command Pattern \n1 - " + vaga);
		
		vaga = exec.fazer(new InserirMoto("placa da moto 1,",vaga));
		System.out.println("2 - " + vaga);
		
		vaga = exec.fazer(new InserirOutros("placa da carreta furacao", vaga));
		System.out.println("3 - " + vaga);
		
		vaga = exec.desfazer();
		System.out.println("4 - " + vaga);
		
		vaga = exec.desfazer();
		System.out.println("5 - " + vaga);
		
		vaga = exec.desfazer();
		System.out.println("6 - " + vaga);
		
		vaga = exec.refazer();
		System.out.println("7 - " + vaga);
		
		VeiculoDiurno vd1 = new VeiculoDiurno(1, 50.00);
		VeiculoDiurno vd2 = new VeiculoDiurno(2, 60);
		VeiculoNoturno vn1 = new VeiculoNoturno(3, 100);// lembrando que no veiculo noturno temos um custo extra, fixo em 100
		
		Estacionamento e = new Estacionamento();
		
		e.addVeiculo(vd1);
		e.addVeiculo(vd2);
		e.addVeiculo(vn1);
		
		System.out.println("Double Dispatch Pattern\n Preco: " + e.getTotal());
		
		System.out.println("Facade Pattern");
		EncontradorVagas novaVaga = new EncontradorVagas();
		
		novaVaga.encontraVagaTerreo();
		novaVaga.encontraVagaAndar();
		novaVaga.encontraVagaCobertura();
		
		System.out.println("Flyweight Pattern");
		
		VagaMultipla vaga111 = new VagaMultipla();
		vaga111.add(VagaFactory.get(1));
		vaga111.add(VagaFactory.get(1));
		vaga111.add(VagaFactory.get(1));
		
		System.out.println(vaga111.getVaga());
		
		VagaMultipla vaga1115 = new VagaMultipla();
		vaga1115.add(vaga111);
		vaga1115.add(VagaFactory.get(5));
		
		System.out.println(vaga1115.getVaga());
		
		//vaga111.add(VagaFactory.get(3));
		//System.out.println(vaga1115.getVaga());
	}

}
