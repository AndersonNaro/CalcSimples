package AndersonNaro.com.github.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadorraController {
	@RequestMapping("/soma/{primeiroNumero}/{segundoNumero}")
	public Double soma(@PathVariable String primeiroNumero, @PathVariable String segundoNumero) throws Exception {

		if (!isNumeric(primeiroNumero) || !isNumeric(segundoNumero)) {
			throw new NumberFormatException();
		}

		Double result = Double.parseDouble(primeiroNumero) + Double.parseDouble(segundoNumero);
		return result;
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
