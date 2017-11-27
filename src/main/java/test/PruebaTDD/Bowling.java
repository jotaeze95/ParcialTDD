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
	int[][] juego ={{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0},{10,0}};

	public Bowling() {
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
	
}
