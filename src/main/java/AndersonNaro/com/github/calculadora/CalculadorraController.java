package AndersonNaro.com.github.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AndersonNaro.com.github.calculadora.exceptions.UnsuportedOperationException;

@RestController
public class CalculadorraController {
	@RequestMapping("/soma/{primeiroNumero}/{segundoNumero}")
	public Double soma(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return convertDouble(primeiroNumero) + convertDouble(segundoNumero);				
	}
	
	@RequestMapping("/subtracao/{primeiroNumero}/{segundoNumero}")
	public Double subtracao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return convertDouble(primeiroNumero) - convertDouble(segundoNumero);				
	}
	
	@RequestMapping("/multiplicacao/{primeiroNumero}/{segundoNumero}")
	public Double multiplicacao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return convertDouble(primeiroNumero) - convertDouble(segundoNumero);				
	}
	
	@RequestMapping("/divisao/{primeiroNumero}/{segundoNumero}")
	public Double divisao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		if ( convertDouble(segundoNumero)== 0.0)
			throw new UnsuportedOperationException("O divisor não pode ser 0!");
		return convertDouble(primeiroNumero) / convertDouble(segundoNumero);				
	}
	
	@RequestMapping("/media/{primeiroNumero}/{segundoNumero}")
	public Double media(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return (convertDouble(primeiroNumero) + convertDouble(segundoNumero))/2;				
	}
	
	@RequestMapping("/raiz-quadrada/{primeiroNumero}")
	public Double raizQuadrada(@PathVariable String primeiroNumero) throws Exception {
		if (!isNumeric(primeiroNumero)) 
			throw new UnsuportedOperationException("Por favor coloque um numero válido!");				 		
		return Math.sqrt(convertDouble(primeiroNumero));				
	}

	private static Double convertDouble(String strNum) {
		if (strNum == null) return 0.0;
		String num = strNum.replace(",",".");
		return Double.parseDouble(num);
	}

	private static boolean isNumeric(String strNum) {
		if (strNum == null) return false;
		String num = strNum.replace(",",".");		
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");	//regex que pega números
	}

}
