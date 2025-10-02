package poker;

import java.util.HashSet;
import java.util.Set;

public class PokerStatus {
	Set<Valor> valor = new HashSet<Valor>();
	Set<Palo> palo = new HashSet<Palo>();
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		addValoresToSet(carta1, carta2, carta3, carta4, carta5);
		
		addPalosToSet(carta1, carta2, carta3, carta4, carta5);
		
		if(this.esPoker(valor)) {
			return "Poquer";
		};
		if(this.esColor(palo)) {
			return "Color";
		}
		if(this.esTrio(valor)) {
			return "Trio";
		}
		return "Nada";
		
		
	}

	private void addPalosToSet(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		palo.add(carta1.palo());
		palo.add(carta2.palo());
		palo.add(carta3.palo());
		palo.add(carta4.palo());
		palo.add(carta5.palo());
	}

	private void addValoresToSet(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		valor.add(carta1.valor());
		valor.add(carta2.valor());
		valor.add(carta3.valor());
		valor.add(carta4.valor());
		valor.add(carta5.valor());
	}
	
	private boolean esColor(Set<Palo> palo) {
		return palo.size() == 1;
	}

	private boolean esTrio(Set<Valor> valor) {
		return valor.size() == 3;
	}

	private boolean esPoker(Set<Valor> valor) {
		return valor.size() == 2;
	}

	public String manoGanadora(String jugada1, String jugada2) {
		
	}

}
