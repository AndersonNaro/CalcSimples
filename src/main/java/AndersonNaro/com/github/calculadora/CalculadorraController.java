package AndersonNaro.com.github.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AndersonNaro.com.github.calculadora.calculadora.Calculadora;
import AndersonNaro.com.github.calculadora.conversores.ConversorNumeros;
import AndersonNaro.com.github.calculadora.exceptions.UnsuportedOperationException;

@RestController
public class CalculadorraController extends Calculadora{
	
	@RequestMapping("/soma/{primeiroNumero}/{segundoNumero}")
	public Double soma(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero) || !ConversorNumeros.isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return soma(ConversorNumeros.convertDouble(primeiroNumero), ConversorNumeros.convertDouble(segundoNumero));
	}
	
	@RequestMapping("/subtracao/{primeiroNumero}/{segundoNumero}")
	public Double subtracao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero) || !ConversorNumeros.isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return subtracao(ConversorNumeros.convertDouble(primeiroNumero), ConversorNumeros.convertDouble(segundoNumero));			
	}
	
	@RequestMapping("/multiplicacao/{primeiroNumero}/{segundoNumero}")
	public Double multiplicacao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero) || !ConversorNumeros.isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return multiplicacao(ConversorNumeros.convertDouble(primeiroNumero), ConversorNumeros.convertDouble(segundoNumero));	
	}
	
	@RequestMapping("/divisao/{primeiroNumero}/{segundoNumero}")
	public Double divisao(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero) || !ConversorNumeros.isNumeric(segundoNumero)) 
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		if ( ConversorNumeros.convertDouble(segundoNumero)== 0.0)
			throw new UnsuportedOperationException("O divisor não pode ser 0!");
		return divisao(ConversorNumeros.convertDouble(primeiroNumero), ConversorNumeros.convertDouble(segundoNumero));				
	}
	
	@RequestMapping("/media/{primeiroNumero}/{segundoNumero}")
	public Double media(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero) || !ConversorNumeros.isNumeric(segundoNumero))
			throw new UnsuportedOperationException("Por favor coloque dois numeros válidos!");				 		
		return media(ConversorNumeros.convertDouble(primeiroNumero), ConversorNumeros.convertDouble(segundoNumero));				
	}
	
	@RequestMapping("/raiz-quadrada/{primeiroNumero}")
	public Double raizQuadrada(@PathVariable String primeiroNumero) throws Exception {
		if (!ConversorNumeros.isNumeric(primeiroNumero)) 
			throw new UnsuportedOperationException("Por favor coloque um numero válido!");				 		
		return raizQuadrada(ConversorNumeros.convertDouble(primeiroNumero));				
	}

	

}
