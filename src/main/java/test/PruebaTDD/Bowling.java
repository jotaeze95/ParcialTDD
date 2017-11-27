package test.PruebaTDD;

import static org.junit.Assert.assertEquals;

/**
 * Hello world!
 *
 */
public class Bowling 
{
	int tiro1 = 0;
	int tiro2 = 0;
	int puntaje = 0;
	int suma = 0;
	int Juego[];
	
	public Bowling() {
	}
	
	
	public int getPuntaje() {
		return puntaje;
	}

	public void Frame (int tiro1, int tiro2) {
		this.puntaje = this.puntaje + (tiro1 + tiro2);
	}
	
	public void Juego (int juego1, int juego2, int NumFrames) {
		for(int frame=0; frame < NumFrames; frame++)
		  {
		    Frame(tiro1, tiro2);
		  }
		
	}
	
	
	/*public void tiroErroneo() throws Exception{
		try {
			cb.restarSaldo(10);
						
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(0,cb.getSaldo());
		}
		
		
	}*/
	
	
}
