package poker;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;



class PokerStatusTest {
	PokerStatus pokerStatus;
	Carta dummyCarta, cincoCorazones, diezPica, diezTrebol, kDiamante, jDiamante, kTrebol, kCorazon, kPica, qCorazon, diezCorazon, tresCorazon;
	Jugada unaJugada;
	@BeforeEach
	void setUp() throws Exception {
		unaJugada = mock(Jugada.class);
		pokerStatus = new PokerStatus();
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

		//when
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
	void testPokerDeK() {
		Jugada poker = pokerStatus.verificar(kDiamante, kTrebol, kCorazon, kPica, diezTrebol);
		assertEquals(poker.getClass(), Jugada.class);
	}


	@Test
	void testNoEsNada() {
		Jugada nada = pokerStatus.verificar(cincoCorazones, diezPica, diezTrebol, kTrebol, jDiamante);
		assertEquals(nada.getClass(), Jugada.class);
	}

	@Test
	void testColor() {
		Jugada color = pokerStatus.verificar(cincoCorazones, kCorazon, qCorazon, diezCorazon, tresCorazon);
		assertEquals(color.getClass(), Jugada.class);
	}
	
	
	@Test
	void testTrio() {
		Jugada trio = pokerStatus.verificar(kPica, kCorazon, kTrebol, cincoCorazones, jDiamante);
		assertEquals(trio.getClass(), Jugada.class);
	}
	
	
}
