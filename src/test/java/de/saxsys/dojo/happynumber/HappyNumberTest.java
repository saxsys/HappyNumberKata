package de.saxsys.dojo.happynumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void einsIstEineGluecklicheZahl() throws Exception {
		assertThat(new NumberCheck().isHappy(1), is(true));
	}

	@Test
	public void zweiIstKeineGluecklicheZahl() throws Exception {
		// 2� = 4
		// 4� = 16
		// 1� + 6� = 1 + 36 = 37
		// 3� + 7� = 9 + 49 = 58
		// 5� + 8� = 25 + 64 = 89
		// 8� + 9� = 64 + 81 = 145
		// 1� + 4� + 5� = 1 + 16 + 25 = 42
		// 4� + 2� = 16 + 4 = 20
		// 2� = 4 ...
		assertThat(new NumberCheck().isHappy(2), is(false));
	}
}
