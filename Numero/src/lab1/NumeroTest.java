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
		try{
			assertEquals("vinte e um", numero.transforma("21"));
			assertEquals("vinte e seis", numero.transforma("26"));
			assertEquals("cinquenta e nove", numero.transforma("59"));
			assertEquals("oitenta e nove", numero.transforma("89"));
			assertEquals("noventa e nove", numero.transforma("99"));
		} catch (Exception e ){
			fail();
		}
		
		try{
			assertEquals("cento e um", numero.transforma("101"));
			assertEquals("quinhentos e nove", numero.transforma("509"));
			assertEquals("setecentos e noventa e oito", numero.transforma("798"));
			assertEquals("novecentos e noventa e nove", numero.transforma("999"));
			assertEquals("cento e setenta e seis", numero.transforma("176"));

		} catch (Exception e ){
			fail();
				
		}
		try{
			assertEquals("mil e um", numero.transforma("1001"));
			assertEquals("mil e noventa e nove", numero.transforma("1099"));
			assertEquals("mil e trezentos e noventa e seis", numero.transforma("1396"));
		} catch (Exception e){
			
		}

	}

}
