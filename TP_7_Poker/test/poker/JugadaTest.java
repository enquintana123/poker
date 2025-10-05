package poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {
	Carta dummyCarta, cincoCorazones, diezPica, diezTrebol, kDiamante, jDiamante, kTrebol, kCorazon, kPica, qCorazon, diezCorazon, tresCorazon;
	Carta aTrebol, aPica,  aDiamante, aCorazon;
	Jugada jugada, unPoquer, unTrio, unColor;
	Juego unJuego;
	
	@BeforeEach
	void setUp() throws Exception {
		dummyCarta = mock(Carta.class);
		tresCorazon = mock(Carta.class);
		cincoCorazones = mock(Carta.class);
		diezCorazon = mock(Carta.class);
		diezPica = mock(Carta.class);
		diezTrebol = mock(Carta.class);
		jDiamante = mock(Carta.class);
		qCorazon = mock(Carta.class);
		kDiamante = mock(Carta.class);
		kTrebol = mock(Carta.class);
		kCorazon = mock(Carta.class);
		kPica = mock(Carta.class);
		aTrebol = mock(Carta.class);
		aPica = mock(Carta.class);
		aDiamante = mock(Carta.class);
		aCorazon = mock(Carta.class);
		unPoquer = new Jugada(Juego.POQUER, dummyCarta, dummyCarta, dummyCarta, dummyCarta, dummyCarta);   
		unTrio = new Jugada(Juego.TRIO, dummyCarta, dummyCarta, dummyCarta, dummyCarta, dummyCarta);
		jugada = new Jugada(Juego.COLOR, dummyCarta, dummyCarta, dummyCarta, dummyCarta, dummyCarta);  
		unColor = new Jugada(Juego.COLOR, dummyCarta, dummyCarta, dummyCarta, dummyCarta, dummyCarta);
		
		
		//when
		when(aDiamante.valor()).thenReturn(Valor.A);
		when(aDiamante.palo()).thenReturn(Palo.DIAMANTE);
		
		when(aTrebol.valor()).thenReturn(Valor.A);
		when(aTrebol.palo()).thenReturn(Palo.TREBOL);
		
		when(aPica.valor()).thenReturn(Valor.A);
		when(aPica.palo()).thenReturn(Palo.PICA);
		
		when(aCorazon.valor()).thenReturn(Valor.A);
		when(aCorazon.palo()).thenReturn(Palo.CORAZON);
		
		when(kDiamante.valor()).thenReturn(Valor.K);
		when(kDiamante.palo()).thenReturn(Palo.DIAMANTE);
		
		when(kTrebol.valor()).thenReturn(Valor.K);
		when(kTrebol.palo()).thenReturn(Palo.TREBOL);
		
		when(kCorazon.valor()).thenReturn(Valor.K);
		when(kCorazon.palo()).thenReturn(Palo.CORAZON);
		
		when(kPica.valor()).thenReturn(Valor.K);
		when(kPica.palo()).thenReturn(Palo.PICA);
		
		when(qCorazon.valor()).thenReturn(Valor.Q);
		when(qCorazon.palo()).thenReturn(Palo.CORAZON);
		
		
		when(jDiamante.valor()).thenReturn(Valor.J);
		when(jDiamante.palo()).thenReturn(Palo.DIAMANTE);
		
		when(diezTrebol.valor()).thenReturn(Valor.DIEZ);
		when(diezTrebol.palo()).thenReturn(Palo.TREBOL);
		
		when(diezPica.valor()).thenReturn(Valor.DIEZ);
		when(diezPica.palo()).thenReturn(Palo.PICA);
		
		when(diezTrebol.valor()).thenReturn(Valor.DIEZ);
		when(diezTrebol.palo()).thenReturn(Palo.TREBOL);
		
		when(diezCorazon.valor()).thenReturn(Valor.DIEZ);
		when(diezCorazon.palo()).thenReturn(Palo.CORAZON);
		
		when(cincoCorazones.valor()).thenReturn(Valor.CINCO);
		when(cincoCorazones.palo()).thenReturn(Palo.CORAZON);
		
		when(tresCorazon.valor()).thenReturn(Valor.TRES);
		when(tresCorazon.palo()).thenReturn(Palo.CORAZON);
		
		
	}

	@Test
	void testConstructorJugada() {
		//exercise
		unJuego = jugada.getJuego();
		//verify
		assertEquals(Juego.COLOR, unJuego);
	}
	
	@Test
	void testJugadaPokerLeGanaAColor() {
		//exercise
		boolean poquerLeGanaAColor = unPoquer.leGanaA(unColor);
		
		//Verify
		assertTrue(poquerLeGanaAColor);
	}
	
	@Test
	void testJugadaPokerLeGanaATrio() {		
		//exercise
		boolean poquerLeGanaATrio = unPoquer.leGanaA(unTrio);
		//Verify
		assertTrue(poquerLeGanaATrio);
	}
	
	@Test
	void testJugadaColorLeGanaATrio() {		
		//exercise
		boolean colorLeGanaATrio = unColor.leGanaA(unTrio);
		//Verify
		assertTrue(colorLeGanaATrio);
	}
	
	@Test
	void testPokerDeA_LeGanaA_PokerDeK() {
		Jugada unPokerDeA = new Jugada(Juego.POQUER, aDiamante, aTrebol, aPica, diezCorazon, cincoCorazones);
		Jugada unPokerDeK = new Jugada(Juego.POQUER, kDiamante, kTrebol, kPica, diezCorazon, cincoCorazones);
		//exercise
		boolean pokerDeALeGanaAPokerDeK = unPokerDeA.leGanaA(unPokerDeK);
		//Verify
		assertTrue(pokerDeALeGanaAPokerDeK);
	}
	
	@Test
	void testPokerDeK_NOLeGanaA_PokerDeA() {
		Jugada unPokerDeA = new Jugada(Juego.POQUER, aDiamante, aTrebol, aPica, aCorazon, cincoCorazones);
		Jugada unPokerDeK = new Jugada(Juego.POQUER, kDiamante, kTrebol, kPica, kCorazon, cincoCorazones);
		//exercise
		boolean pokerDeKLeGanaAPokerDeA = unPokerDeK.leGanaA(unPokerDeA);
		//Verify
		assertFalse(pokerDeKLeGanaAPokerDeA);
	}
	
	@Test
	void testTrioDeA_LeGanaTrioDeK() {
		Jugada unTrioDeA = new Jugada(Juego.TRIO, aDiamante, aTrebol, aPica, diezCorazon, cincoCorazones);
		Jugada unTrioDeK = new Jugada(Juego.TRIO, kDiamante, kTrebol, kPica, diezCorazon, cincoCorazones);
		//exercise
		boolean trioDeALeGanaATrioDeK = unTrioDeA.leGanaA(unTrioDeK);
		//Verify
		assertTrue(trioDeALeGanaATrioDeK);
	}
	
	@Test
	void testEmpateColor_GanaCartaMasAlta() {
		Jugada unTrioDeA = new Jugada(Juego.TRIO, aDiamante, aTrebol, aPica, diezCorazon, cincoCorazones);
		Jugada unTrioDeK = new Jugada(Juego.TRIO, kDiamante, kTrebol, kPica, diezCorazon, cincoCorazones);
		//exercise
		boolean trioDeALeGanaATrioDeK = unTrioDeA.leGanaA(unTrioDeK);
		//Verify
		assertTrue(trioDeALeGanaATrioDeK);
	}
	
	
	

}
