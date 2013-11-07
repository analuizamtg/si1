package lab1;

import java.util.Hashtable;

public class Numero {

	public String transforma(String numero)throws Exception{
		if (numero.equals("")){
			throw new Exception("N�mero inv�lido");
		}
		
		Hashtable<String, String> hash = new Hashtable<String,String>();
		
		
		
		hash.put("0", "zero");
		hash.put("1", "um");
		hash.put("2", "dois");
		hash.put("3", "tr�s");
		hash.put("4", "quatro");
		hash.put("5", "cinco");
		hash.put("6", "seis");
		hash.put("7", "sete");
		hash.put("8", "oito");
		hash.put("9", "nove");
		hash.put("10", "dez");
		hash.put("11", "onze");
		hash.put("12", "doze");
		hash.put("13", "treze");
		hash.put("14", "quatorze");
		hash.put("15", "quinze");
		hash.put("16", "dezesseis");
		hash.put("17", "dezessete");
		hash.put("18", "dezoito");
		hash.put("19", "dezenove");
		return hash.get(numero);
		
	}
	
	
	
}


