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
	public final void TodosLosFrame0() {
		;
		  for(int frame=1; frame<=10; frame++)
		  {
		    game.Juego(0,0,10);
		  }
		assertEquals(0, game.puntaje);
		
	}
	
	@Test
	public final void puntajeFrame1() {
		game.Frame(0,8);
		assertEquals(8, game.puntaje);
		
	}
	
	@Test
	public final void puntajeFrame2() {
		game.Frame(2,5);
		assertEquals(7, game.puntaje);
		
	}
	
	@Test
	public final void puntajePleno() {
		game.Frame(0,10);
		assertEquals(10, game.puntaje);
		
	}	
	
	@Test
	public final void JuegoCompleto() {
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
	public final void StrikeExtra() {
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
		    game.Frame(3,6);
		    game.Frame(10,0);
		    game.Frame(3,6);
		    game.Frame(3,6);
		assertEquals(57, game.puntaje);
		
	}

}
