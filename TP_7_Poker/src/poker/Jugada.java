package poker;

import java.util.ArrayList;
import java.util.List;

public class Jugada {
	private Juego jugada;
	private List<Carta> cartas = new ArrayList<Carta>();
	
	public Jugada(Juego juego, Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		this.jugada = juego;
		this.cartas.add(carta1);
		this.cartas.add(carta2);
		this.cartas.add(carta3);
		this.cartas.add(carta4);
		this.cartas.add(carta5);
	}

	public Juego getJuego() {
		return this.jugada;
	}
	
	public int valorDeJugada() {
		return this.jugada.ordinal();
	}

	public boolean leGanaA(Jugada otraJugada) {
		if(this.valorDeJugada() == otraJugada.valorDeJugada()) {
			return this.sumaDeJugada() >  otraJugada.sumaDeJugada();
		}
		return this.valorDeJugada() > otraJugada.valorDeJugada();
		
	}

	private int sumaDeJugada() {
		
		return cartas.stream().mapToInt( carta -> carta.valor().ordinal()).sum();
	}

}
