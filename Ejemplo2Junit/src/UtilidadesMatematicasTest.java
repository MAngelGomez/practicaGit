import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilidadesMatematicasTest {

	@Test
	void testMayor() {
		assertEquals( UtilidadesMatematicas.mayor(5,3), 5);
	}

	@Test
	void testMenor() {
		assertEquals( UtilidadesMatematicas.menor(5,3), 3);
	}

	@Test
	void testEsPrimo() {
		assertTrue( UtilidadesMatematicas.esPrimo(7));
		assertTrue( UtilidadesMatematicas.esPrimo(19));
		assertFalse(UtilidadesMatematicas.esPrimo(-5));
	}

}
