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
	public final void frameIgual0() {
		;
		  for(int frame=1; frame<=10; frame++)
		  {
		    game.Juego(0,0,10);
		  }
		assertEquals(0, game.puntaje);
		
	}
	
	@Test
	public final void Puntaje40() {
		  for(int frame=1; frame<=10; frame++)
		  {
		    game.Frame(2,2);
		  }
		assertEquals(40, game.puntaje);
		
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
		    game.Frame(4,10);
		assertEquals(100, game.puntaje);
		
	}

}
