package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class VagaFactory {
	private static Map<Integer, VagaUnica> todasVagas;
	
	private static void init() {
		todasVagas = new HashMap<Integer, VagaUnica>();
		todasVagas.put(1, new VagaUnica("1"));
		todasVagas.put(2, new VagaUnica("2"));
		todasVagas.put(3, new VagaUnica("3"));
		todasVagas.put(4, new VagaUnica("4"));
		todasVagas.put(5, new VagaUnica("5"));
	}
	
	public static VagaUnica get(Integer codigo) {
		if(todasVagas == null)
			init();
		return todasVagas.get(codigo);
	}
}
