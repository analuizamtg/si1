package lab1;

import static org.junit.Assert.assertEquals;

import java.util.Hashtable;

public class Numero {

	public String transforma(String numero)throws Exception{
		
		

		String[] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z","w"};
		if (numero.equals("")){
			throw new Exception("N�mero inv�lido");
		}
		for (int i = 0; i<26;i++){
			if (numero.contains(alfabeto[i])){
				throw new Exception ("Entrada s� deve conter n�meros");
			}
		}
		String primeiroNumero = numero.substring(0,1);
		String resto = numero.substring(1);
		
		if (primeiroNumero.equals("0") && !resto.equals("")){
			return transforma(resto);
		}
		
		Hashtable<String, String> hash = new Hashtable<String,String>();
		
		
		preencheHash(hash);
		
		hash.get(numero);
		
		int tamanho = numero.length();
		
		
		if (hash.containsKey(numero)){
			return hash.get(numero);
		} else {
			if (tamanho==2 ){
				return hash.get(primeiroNumero + "0") + " e " + hash.get(resto);
			} else if (tamanho==3){
				return hash.get(primeiroNumero+"00") + " e " + transforma(resto);
			}
			
			
			
			
			
			
		}
		return "";
		
		
	}

	private void preencheHash(Hashtable<String, String> hash) {
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
		hash.put("20", "vinte");
		hash.put("30", "trinta");
		hash.put("40","quarenta");
		hash.put("50", "cinquenta");
		hash.put("60", "sessenta");
		hash.put("70", "setenta");
		hash.put("80", "oitenta");
		hash.put("90", "noventa");
		hash.put("100", "cento");
		hash.put("200", "duzentos");
		hash.put("300", "trezentos");
		hash.put("400", "quatrocentos");
		hash.put("500", "quinhentos");
		hash.put("600", "seiscentos");
		hash.put("700", "setecentos");
		hash.put("800", "oitocentos");
		hash.put("900", "novecentos");
		hash.put("1000", "mil");
		
		
	}
	
	public static void main (String [] args){
		Numero numero = new Numero();
		try{
			System.out.println(numero.transforma("101"));
			System.out.println(numero.transforma("509"));
			System.out.println(numero.transforma("99"));
			System.out.println(numero.transforma("10"));
			System.out.println(numero.transforma("26"));
			System.out.println(numero.transforma("21"));
			System.out.println(numero.transforma("0"));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}


