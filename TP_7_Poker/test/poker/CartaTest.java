package poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	Carta cincoCorazones, diezPica, diezTrebol, kDiamante, JDiamante;
	@BeforeEach
	void setUp() throws Exception {
		cincoCorazones = new Carta(Valor.CINCO, Palo.CORAZON);
		diezPica = new Carta(Valor.DIEZ, Palo.PICA);
		diezTrebol = new Carta(Valor.DIEZ, Palo.TREBOL);
		kDiamante = new Carta(Valor.K, Palo.DIAMANTE);
		JDiamante = new Carta(Valor.J, Palo.DIAMANTE);
	}

	@Test
	void testValor() {
		assertEquals(Valor.CINCO, cincoCorazones.valor());
		assertEquals(Valor.DIEZ, diezPica.valor());
	}
	
	@Test
	void testPalo() {
		assertEquals(Palo.CORAZON, cincoCorazones.palo());
		assertEquals(Palo.PICA, diezPica.palo());
	}
	
	@Test
	void testDiezEsSuperarioACinco() {
		
		assertTrue(diezPica.esSuperiorA(cincoCorazones));
	}
	
	@Test
	void testDiezNoEsSuperarioADiez() {
		assertTrue(!diezPica.esSuperiorA(diezTrebol));
	}	

	@Test
	void testDiezNoEsSuperarioA_K() {
		assertTrue(!diezPica.esSuperiorA(kDiamante));
	}
	
	@Test
	void testSonDelMismoPalo() {

		assertTrue(kDiamante.esMismoPaloQue(JDiamante));
	}
	
	@Test
	void testNoSonDelMismoPalo() {
		assertFalse(diezTrebol.esMismoPaloQue(JDiamante));
	}
}
