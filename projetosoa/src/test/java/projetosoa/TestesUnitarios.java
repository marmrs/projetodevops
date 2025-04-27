package projetosoa;
import org.junit.Test;
import soap.Calculadora;
import static org.junit.Assert.assertEquals;

public class TestesUnitarios {
@Test	
public void testesomar() {
	Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(2, 3);
    assertEquals(5, resultado);	
}

@Test	
public void testesomar2() {
	Calculadora calculadora = new Calculadora();
    int resultado = calculadora.somar(0, 3);
    assertEquals(3, resultado);	
}

@Test	
public void testesubtrair() {
	Calculadora calculadora = new Calculadora();
    int resultado = calculadora.subtrair(3, 2);
    assertEquals(1, resultado);	
}

@Test	
public void testedividir() {
	Calculadora calculadora = new Calculadora();
    int resultado = calculadora.dividir(10, 5);
    assertEquals(2, resultado);	
}

@Test	
public void testemultiplicar() {
	Calculadora calculadora = new Calculadora();
    int resultado = calculadora.dividir(10, 5);
    assertEquals(50, resultado);	
}

}
