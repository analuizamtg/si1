package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroTest {

	@Test
	public void test() {
		String[] array = {"zero","um","dois","tr�s","quatro","cinco","seis","sete","oito","nove","dez"};
		Numero numero = new Numero();
		for (int i=0;i<11;i++){
			assertEquals(array[i],numero.transforma(i+""));
		}
		
	}

}
