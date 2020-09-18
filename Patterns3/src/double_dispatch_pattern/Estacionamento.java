package double_dispatch_pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estacionamento {
	private List<Veiculo> veiculos;
	private Map<PropriedadesEstacionamento, Double> propriedades;
	
	public void addVeiculo(Veiculo v) {
		getVeiculos().add(v);
		v.addPropriedades(this);
	}
	
	// adiciono no map o tipo como key e o antigo valor de tipo + o novo valor
	public void addPropriedade(PropriedadesEstacionamento tipo, double valor) {
		getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
	}
	
	public double getTotal() {
		if(veiculos.isEmpty())
			return 0.0;
		
		double total = 0;
		
		total+= getPropriedades().get(PropriedadesEstacionamento.PRECO_DIURNO);
		total+= getPropriedades().get(PropriedadesEstacionamento.PRECO_PERNOITE);
		total+= getPropriedades().get(PropriedadesEstacionamento.CUSTO_EXTRA);
		
		return total;
	}
	private List<Veiculo> getVeiculos(){
		if(veiculos == null)
			veiculos = new ArrayList<Veiculo>();
		return veiculos;
	}
	// inicializo o meu estacionamento com todas as propriedades setadas em 0.0
	private Map<PropriedadesEstacionamento, Double> getPropriedades(){
		if(propriedades == null) {
			propriedades = new HashMap<PropriedadesEstacionamento, Double>();
			for(PropriedadesEstacionamento tipo : PropriedadesEstacionamento.values())
				propriedades.put(tipo, 0.0);
		}
		return propriedades;
	}
}
