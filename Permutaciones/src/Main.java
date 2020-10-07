import java.util.Scanner;
public class Main {
public static void main(String args []) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Valor de N");
	int dimen = obj.nextInt();
	int [] elementos = new int[dimen];
	System.out.println("Valor de R");
	int dim = obj.nextInt();
	int [] ele = new int[dim];
	
	
	int n;
	int r;
	
	n = elementos.length;
	r = ele.length;
	int Permutaciones = factorial(n)/factorial(n-r);
	int PerR = factorial(n)/ factorial(r);
	int Combinaciones = factorial(n)/(factorial(r)*factorial(n-r)); 
	int ComR = factorial(n+r-1)/(factorial(r)*factorial(n-1));
	
	System.out.println("Permutaciones "+Permutaciones);
	System.out.println("Permutaciones con Repeticion "+PerR);
	System.out.println("Combinaciones "+Combinaciones);
	System.out.println("Combinaciones con Repeticion "+ComR);
	
}
	private static int factorial(int n) {
		return(n==0)?1:n * factorial(n - 1);
		
	}
	
}   
