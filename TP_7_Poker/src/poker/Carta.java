package poker;


public class Carta {

	private Valor valor;
	private Palo palo;

	public Carta(Valor numeracion, Palo palo) {
		this.valor = numeracion;
		this.palo = palo;
	}

	public Valor valor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	public Palo palo() {
		// TODO Auto-generated method stub
		return this.palo;
	}

	public boolean esSuperiorA(Carta otraCarta) {
		// TODO Auto-generated method stub
		return this.valor.ordinal() > otraCarta.valor().ordinal();
	}

	public boolean esMismoPaloQue(Carta otraCarta) {	
		// TODO Auto-generated method stub
		return this.palo == otraCarta.palo();
	}
	
}
