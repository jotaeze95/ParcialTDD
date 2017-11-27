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
	public final void frame() {
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

}
