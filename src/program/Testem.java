package program;

public class Testem {
	
	public static void main(String[] args) {
		int soma = 0;
		int n = 0;
		for (int i=7; i<=120; i++) {
			if(i % 7 == 0) {
				n = i;
				System.out.println("Soma: 7 + " + n);
			}
		}
	}

}
