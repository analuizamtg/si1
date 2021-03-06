package lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroTest {
	Numero numero;

	@Before
	public void setUp(){

		 numero = new Numero();
	}
	@Test
	public void test()  {

		

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
			assertEquals("mil e um", numero.transforma("1001"));
			assertEquals("mil e noventa e nove", numero.transforma("1099"));
			assertEquals("mil trezentos e noventa e seis", numero.transforma("1396"));
			assertEquals("nove mil novecentos e noventa e nove", numero.transforma("9999"));
			assertEquals("dezessete mil", numero.transforma("17000"));
			assertEquals("quinze mil e noventa e nove", numero.transforma("15099"));
		} catch (Exception e){
			
		}

	}
	
	@Test
	public void testaSeTemLetra() {
		try{
			numero.transforma("ksdl");
			numero.transforma("xpto");
			fail ("tem que lan�ar exce��o!");
		
		} catch (Exception e){
			
		}
	}
	
	@Test
	public void testaAte999() {
		try{
			assertEquals("cento e um", numero.transforma("101"));
			assertEquals("quinhentos e nove", numero.transforma("509"));
			assertEquals("setecentos e noventa e oito", numero.transforma("798"));
			assertEquals("novecentos e noventa e nove", numero.transforma("999"));
			assertEquals("cento e setenta e seis", numero.transforma("176"));

		} catch (Exception e ){
			fail();
				
		}
	}
    @Test
	public void testaEntradaVazia() {
		try{
			numero.transforma("");
			fail ("deveria ter lan�ado exce��o!");
		} catch (Exception e){
			assertEquals("N�mero inv�lido", e.getMessage());
		}
	}
	
	@Test
	public void testaAte20() {
		
		try{
			assertEquals("zero", numero.transforma("0"));
			assertEquals("dois",numero.transforma("2"));
		} catch (Exception e){
			fail();
		}
		
	}

	@Test 
	public void testaAte100mil(){
		try{
			assertEquals("noventa e oito mil e quatrocentos",numero.transforma("98400"));
		} catch (Exception e){
		
		
	}
	}
}
