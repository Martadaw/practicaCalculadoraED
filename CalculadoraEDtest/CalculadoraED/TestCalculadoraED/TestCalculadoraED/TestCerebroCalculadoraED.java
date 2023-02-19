package TestCalculadoraED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import calcualdora.CerebroCalculadoraED;
import calcualdora.Operaciones;

class TestCerebroCalculadoraED {

	

	@Test
	void testsuma() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método sumar.
		System.out.println("### Introduzca dos números para el test de la suma ");
		calc.operarSuma(Operaciones.SUMAR);
		double  esperado=calc.numero1+calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);
	}
	@Test
	void testresta() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método restar.
		System.out.println("### Introduzca dos números para el test de la resta ");
		calc.operarResta(Operaciones.RESTAR);
		double  esperado=calc.numero1-calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);
	
		}
	@Test
	void testmultiplicacion() {
		boolean respuesta;
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		System.out.println("### Introduzca dos números para el test de la multiplicacion ");
		calc.operarMultiplica(Operaciones.MULTIPLICAR);
		double esperado=calc.numero1*calc.numero2;
		if (esperado == calc.resultado) {
			respuesta =true;
		
	} else {
		respuesta = false;
	}
		}
	@Test
	void probandodivision () {
	
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		System.out.println("### Introduzca dos números para el test de la división ");
		calc.operarDivide(Operaciones.DIVIDIR);
		double  esperado=calc.numero1/calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);
	}
	@Test
	void testresresta() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método restar.
		System.out.println("### Introduzca dos números para el test de la restares ");
		calc.operarRestaRes(Operaciones.RESTAR_RES);
		double  esperado=calc.resultado-calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);
}
	
	@Test
	void testsumares() {
		boolean respuesta;
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		System.out.println("### Introduzca dos números para el test de la sumares ");
		calc.operarSumaRes(Operaciones.SUMAR_RES);
		double esperado=calc.resultado+calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		if (esperado == calc.resultado) {
			respuesta =true;
		
	} else {
		respuesta = false;
	}
		}
	
	@Test
	void testmultiplicacionres() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método sumar.
		System.out.println("### Introduzca dos números para el test de la multiplicacion res ");
		calc.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
		double  esperado=calc.resultado*calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);
	}
	@Test
	void testdividirres() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método restar.
		System.out.println("### Introduzca dos números para el test de la division res ");
		calc.operarDivideRes(Operaciones.DIVIDIR_RES);
		double  esperado=calc.resultado/calc.numero2;
		System.out.println("El resultado debería ser " + esperado);
		assertEquals(esperado, calc.resultado);	
	}
	@Test
	void testnumeroaleatorio() {
		CerebroCalculadoraED calc=new CerebroCalculadoraED();
		//Esto es una prueba para comprobar el método restar.
		calc.numeroAleatorio(Operaciones.RANDOM);
		double  esperado=(double)(Math.random()*100+1);
		assertNotNull(calc.resultado);	
	}
	
	
}
