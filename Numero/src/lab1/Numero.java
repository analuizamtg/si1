package lab1;

import java.util.Hashtable;

public class Numero {

	public String transforma(String numero){
		Hashtable<String, String> hash = new Hashtable<String,String>();
		hash.put("0", "zero");
		hash.put("1", "um");
		hash.put("3", "três");
		return hash.get(numero);
	}
	
	
	
}


