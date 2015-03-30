
public class VetorMatriz {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = new int[5];
		System.arraycopy(x, 1, y, 1, 2);

		for (int i = 0; i < y.length; i++) {
		  System.out.println(y[i]);
		} // será impresso 1,2,3,0 e 0

	}
}
