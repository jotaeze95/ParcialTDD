package test.PruebaTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingTDD {

	private Bowling bw;

	@Test
	public final void FRAME() {
		int frame[] = {3, 5};
		bw = new Bowling(frame);
		int[] resul = bw.getFrame();
		assertNotNull(resul);
		
	}

}
