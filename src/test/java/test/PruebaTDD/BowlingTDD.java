package test.PruebaTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingTDD {

	private Bowling game;
	
	@Before
	public void setUp() throws Exception {
		game = new Bowling();
	}

	@Test
	public final void TodosLosFrame0() throws Exception{
		try {
		  for(int frame=1; frame<=10; frame++)
		  {
		    game.JuegoIncompleto(0,0,10); //Todos los intentos fallados
		  }
		}
		catch (Exception e)
		{
			assertEquals(0, game.puntaje);
		}
			
	}
	
	@Test
	public final void puntajeFrame1() {
			game.Frame(0,8);
			assertEquals(8, game.puntaje);		
	}
	
	@Test
	public final void UnPuntajeFrame2() {
		game.Frame(2,5);
		assertEquals(7, game.puntaje);		
	}
	
	@Test
	public final void UnPuntajePleno() {
			game.Frame(0,10);
			assertEquals(10, game.puntaje);
	}	
	
	@Test
	public final void JuegoCompleto() throws Exception {
		    game.Frame(2,3);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(4,5);
		    game.Frame(3,5);
		    game.Frame(5,4);
		    game.Frame(5,4);
		    game.Frame(6,3);
		    game.Frame(4,3);
		    game.Frame(10,0);
			assertEquals(86, game.puntaje);
	}
	
	@Test
	public final void JuegoIncompleto1() throws Exception {
		try {
			game.JuegoIncompleto(2,11,9); //La cantidad de frames jugados es menor a 10
		    
		}
		catch (Exception e)
		{
			assertEquals(0, game.puntaje);
			
		}
	}
	
	@Test
	public final void JuegoIncompleto2() throws Exception {
		try {
			game.JuegoIncompleto(-2,11,9); //EL primer intento es menor a 0
		    
		}
		catch (Exception e)
		{
			assertEquals(0, game.puntaje);
			
		}
	}
	
	@Test
	public final void JuegoIncompleto3() throws Exception {
		try {
			game.JuegoIncompleto(-2,-11,10); //Los dos intentos son menores a 0 pinos
		    
		}
		catch (Exception e)
		{
			assertEquals(0, game.puntaje);
			
		}
	}
	
	@Test
	public final void JuegoIncompleto4() throws Exception {
		try {
			game.JuegoIncompleto(12,9,10); //primer tiro es mayor a 10 pinos
		    
		}
		catch (Exception e)
		{
			assertEquals(0, game.puntaje);
			
		}
	}
	
	@Test
	public final void StrikeExtra() throws Exception {
		    game.Frame(2,3);
			game.Frame(10,0);
			game.Frame(10,0);
			game.Frame(4,5);
			game.Frame(3,5);
			game.Frame(5,4);
			game.Frame(5,4);
			game.Frame(6,3);
			game.Frame(4,3);
			game.Frame(10,0);
			game.Frame(4,10);
			assertEquals(100, game.puntaje);
				
	}
	
	
	@Test
	public final void JuegoPlenosContinuos() {
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
			assertEquals(100, game.puntaje);
		
	}
	
	@Test
	public final void MayorPuntajePosible() {
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
		    game.Frame(10,0);
			assertEquals(300, game.MayorPuntajePosible);
		
	}
	
	

}
