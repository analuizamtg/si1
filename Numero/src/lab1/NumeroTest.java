package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroTest {

	@Test
	public void test()  {
		String[] array = {"zero","um","dois","tr�s","quatro","cinco","seis","sete","oito","nove","dez","onze","doze","treze","quatorze","quinze","dezesseis","dezessete","dezoito","dezenove"};
		Numero numero = new Numero();
		try{
			for (int i=0;i<20;i++){
				assertEquals(array[i],numero.transforma(i+""));
			} 
		} catch (Exception e){
			fail();
		}

		try{
			numero.transforma("");
			fail ("deveria ter lan�ado exce��o!");
		} catch (Exception e){
			assertEquals("N�mero inv�lido", e.getMessage());
		}
		
		try{
			numero.transforma("ksdl");
			numero.transforma("xpto");
			fail ("tem que lan�ar exce��o!");
		
		} catch (Exception e){
			
		}
		


	}

}
