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
	int MayorPuntajePosible = 300;

	public Bowling() {
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void Frame (int tiro1, int tiro2) {
		this.puntaje = this.puntaje + (tiro1 + tiro2);
	}
	
	public void JuegoIncompleto (int tiro1, int tiro2, int NumFrames) throws Exception{
		if (NumFrames > 11 || NumFrames < 10 || tiro1 > 10 || tiro2 > 10 || tiro1 < 0 || tiro2 < 0) {
			throw new Exception("Error");
		}
		else
		{
			System.out.println(Integer.toString(tiro1));
			System.out.println(Integer.toString(tiro2));
			System.out.println(Integer.toString(NumFrames));
		}
		
	}
	
	/*public void JuegoTotal (int tiro1, int tiro2, int NumFrames) throws Exception{
		if (NumFrames > 11 || tiro1 > 10 || tiro2 > 10 || tiro1 < 0 || tiro2 < 0) {
			throw new Exception("Error");
		}
		else
		{
			for( int i=0; i < NumFrames; i++ ) {
				int[] juego1 = new int[tiro1];
				int[] juego2 = new int[tiro2];
				int[] juego = new int[NumFrames][];
				juego[i] = tiro1 + tiro2;
			}
				
		}
		
	}*/
		
	
	
}
