package flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class VagaMultipla implements Vaga {
	private List<Vaga> vagas;
	//sejam do tipo VagaUnica e do tipo VagaMultipla
	
	public VagaMultipla() {
		super();
		vagas = new ArrayList<Vaga>();
	}

	public void add(Vaga v) {
		vagas.add(v);
	}
	@Override
	public String getVaga() {
		String listaVagas = "";
		for(Vaga v : vagas)
			listaVagas = listaVagas.concat(v.getVaga());
		return listaVagas;
	}

}
