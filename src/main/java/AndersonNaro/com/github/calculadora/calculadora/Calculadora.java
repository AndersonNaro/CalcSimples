package AndersonNaro.com.github.calculadora.calculadora;

public class Calculadora {

	public Double soma(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}
	
	public Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	public Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	public Double divisao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}
	
	public Double raizQuadrada(Double numero) {
		return Math.sqrt(numero);
	}
	
	public Double media(Double primeiroNumero, Double segundoNumero) {
		return (primeiroNumero + segundoNumero)/2;
	}
}
	