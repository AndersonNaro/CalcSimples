package AndersonNaro.com.github.calculadora.conversores;

public class ConversorNumeros {

	public static Double convertDouble(String strNum) {
		if (strNum == null) return 0.0;
		String num = strNum.replace(",",".");
		return Double.parseDouble(num);
	}

	public static boolean isNumeric(String strNum) {
		if (strNum == null) return false;
		String num = strNum.replace(",",".");		
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");	//regex que pega números
	}
}
