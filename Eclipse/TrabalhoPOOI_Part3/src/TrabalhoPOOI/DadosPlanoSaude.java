package TrabalhoPOOI;

import java.util.ArrayList;

public class DadosPlanoSaude {
	private static ArrayList<PlanoDeSaude> vetPlan = new ArrayList<PlanoDeSaude>();
	
	public static void cadastra(PlanoDeSaude c) {
		vetPlan.add(c);// ADICIONA O PACIENTE NO ARRAY
		System.out.println("Total de pacientes:");
		System.out.println(vetPlan.size());
	}

	// este método retorna o objeto Paciente caso encontrado, ou null, caso não
	// encontrado
	public static PlanoDeSaude search(String cnpj) {
		PlanoDeSaude c = null;
		for (PlanoDeSaude objeto : vetPlan) {
			if (objeto.getCNPJ().equals(cnpj)) {
				c = objeto;
				break;
			}
		}
		return c;
	}

	// este método usa o método buscar já implementado
	public static boolean remove(String cnpj) {
		PlanoDeSaude c = search(cnpj);
		if (c != null) {
			vetPlan.remove(c);
			return true;
		} else {
			return false;
		}
	}

	public static void write() {
		for (PlanoDeSaude pac : vetPlan) {
			Persist.write(pac, "dadosPlanoDeSaude");
		}
	}

}
