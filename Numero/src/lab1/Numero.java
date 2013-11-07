package lab1;

import static org.junit.Assert.assertEquals;

import java.util.Hashtable;

public class Numero {

	public String transforma(String numero)throws Exception{
		String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","w"};
		if (numero.equals("")){
			throw new Exception("Número inválido");
		}
		for (int i = 0; i<26;i++){
			if (numero.contains(alfabeto[i])){
				throw new Exception ("Número inválido");
			}
		}
		
		Hashtable<String, String> hash = new Hashtable<String,String>();
		
		
		
		hash.put("0", "zero");
		hash.put("1", "um");
		hash.put("2", "dois");
		hash.put("3", "três");
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
	
	public static void main (String [] args){
		Numero numero = new Numero();
		try{
			for (int i=0;i<20;i++){
				System.out.println(numero.transforma(i+""));
			}	
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}


