package poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManoDePoquerTest {

	Carta dummyCarta, cincoCorazones, diezPica, diezTrebol, kDiamante, jDiamante, kTrebol, kCorazon, kPica, qCorazon, diezCorazon, tresCorazon;
	PokerStatus poquer, trio;
	ManoDePoquer jugada;
	@BeforeEach
	void setUp() throws Exception {
		
		
		poquer = mock(PokerStatus.class);
		trio  = mock(PokerStatus.class);
		
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
	void testPoquerLeGanaAColor() {
		ManoDePoquer manoDePoquer = new ManoDePoquer();
		
		PokerStatus manoGanadora = manoDePoquer.ganadora(poquer, trio);
		
		assertEquals(manoGanadora, poquer);
	}
	
	@Test
	void testPoquerLeGanaATrio() {
		fail("Not yet implemented");
	}

	@Test
	void testColorLeGanaATrio() {
		fail("Not yet implemented");
	}
	
	@Test
	void testPoquerDeKLeGanaAPoquerDe4() {
		fail("Not yet implemented");
	}
	
	@Test
	void testColorConKLeGanaColorConQ() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTrioDeALeGanaATrioDe2() {
		fail("Not yet implemented");
	}
	
		
}
