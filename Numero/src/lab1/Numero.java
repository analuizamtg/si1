package lab1;

import java.util.Hashtable;

public class Numero {

	public String transforma(String numero){
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
		return hash.get(numero);
	}
	
	
	
}


