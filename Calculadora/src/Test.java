

import junit.framework.TestCase;


public class Test extends TestCase
{
	private Calculadora calculadora;
	
	public void escenario()
	{
		calculadora = new Calculadora(); 
	}

		//SUMA
		public void testsumar () 
		{
			escenario();
			assertTrue(calculadora.sumar(2, 2)==(2+2));;
			
		}
		//RESTA
		public void testrestar () 
		{
		escenario();
		assertTrue(calculadora.restar(3, 1)==(3-1));
			
			
		}
		//MULTIPLICACION
		public void multiplicar () 
		{
			escenario();
			assertTrue(calculadora.multiplicar(4, 2)==(4*2));
			
		
		}
		//DIVICION
		public void dividir () 
		{
			escenario();
			assertTrue(calculadora.dividir(4, 2)==(4/2));

		}
		//EXPONENCIACIÓN
		public void exponenciacion () 
		{
			escenario();
	
			float exponenciacion = calculadora.exponenciacion(calculadora.sumar(1, 1),calculadora.multiplicar(4, 1));
			float igual=32;
			assertEquals(igual, exponenciacion,0);
	
		}
		
		
}
 