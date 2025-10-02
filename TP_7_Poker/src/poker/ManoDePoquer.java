package poker;

import java.util.HashSet;
import java.util.Set;

public class ManoDePoquer {

	
	private Juego jugada1;
	private Juego jugada2;

	public ManoDePoquer(String jugada1, String jugada2) {
		this.jugada1 = this.jugadaToJuego(jugada1);
		this.jugada2 = this.jugadaToJuego(jugada2);
	}
	
	
	private Juego jugadaToJuego(String jugada) {
		Juego juego;
		switch (jugada) {
		    case "POQUER":
		        juego = Juego.POQUER;
		        break;
		    case "Color":
		        juego = Juego.COLOR;
		        break;
		    case "Trio":
		    	juego = Juego.TRIO;
		    	break;
		    default:
		        juego = Juego.NADA;
		}
		return juego;		
	}
	
	public String jugadaGanadora() {
		if(this.jugadasIguales())
			return this.laMejorAlDesempatar();
		else 
			return this.laMejor();
	}


	private String laMejor() {
		// TODO Auto-generated method stub
		return null;
	}


	private String laMejorAlDesempatar() {
		// TODO Auto-generated method stub
		return null;
	}


	private boolean jugadasIguales() {
		return jugada1 == jugada2;
	}


}
