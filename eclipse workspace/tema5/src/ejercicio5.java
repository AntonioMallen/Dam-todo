
public class ejercicio5 {
	public static int maximoComunDivisor(int a, int b) {
	    int temporal;//Para no perder b
	    while (b != 0) {
	        temporal = b;
	        b = a % b;
	        a = temporal;
	    }
	    return a;
	}
	public static void main(String[] args) {
	int a=60;
	int b=48;
	int mcd;
	mcd=maximoComunDivisor(a,b);
	System.out.println(mcd);
	}

}
