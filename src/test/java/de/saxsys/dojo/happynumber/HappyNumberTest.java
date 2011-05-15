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

	@Test
	public void dreiIstKeineGluecklicheZahl() throws Exception {
		// 3� = 9
		// 9� = 81
		// 8� + 1� = 65
		// 6� + 5� = 36 + 25 = 61
		// 6� + 1� = 36 + 1 = 37 ..
		assertThat(new NumberCheck().isHappy(3), is(false));
	}

	@Test
	public void ZehnIstEineGluecklicheZahl() throws Exception {
		// 10 : 1� = 1
		assertThat(new NumberCheck().isHappy(10), is(true));
	}

	@Test
	public void HundertIstEineGluecklicheZahl() throws Exception {
		// 100 : 1� = 1
		assertThat(new NumberCheck().isHappy(100), is(true));
	}

	@Test
	public void elfIstKeineGluecklicheZahl() throws Exception {
		// 11 : 1� + 1� = 2 ..
		assertThat(new NumberCheck().isHappy(11), is(false));
	}

	@Test
	public void dreizehnIstEineGluecklicheZahl() throws Exception {
		// 13 : 1� + 3� = 1 + 9 = 10
		// 10 : 1� = 1
		assertThat(new NumberCheck().isHappy(13), is(true));
	}

	@Test
	public void einunddreissigIstEineGluecklicheZahl() throws Exception {
		// 13 : 1� + 3� = 1 + 9 = 10
		// 10 : 1� = 1
		assertThat(new NumberCheck().isHappy(31), is(true));
	}

	@Test
	public void eineGluecklicheZahlIst7171() throws Exception {
		// 7171 : 7� + 1� + 7� + 1� = 49 + 1 + 49 + 1 = 100
		// 100 : 1� = 1
		assertThat(new NumberCheck().isHappy(7171), is(true));
	}
}
