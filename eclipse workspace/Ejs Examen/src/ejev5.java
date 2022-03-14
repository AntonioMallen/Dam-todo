import java.util.Scanner;
/*Simular una maquina tragaperras donde los símbolos que aparecen son:
$ # % < > @
generando al azar secuencias de 3 símbolos y al final se para. Nota: usad un String
de 3 letras y generarlo al azar con random.
El programa detecta si la combinación que se ha parado está premiada; indica con
un mensaje adecuado si está premiada o no.
Las combinaciones ganadoras son:

Combinación Premio
(euros)
$$$ 50
$@@ 25
$## 15
@@@ 10
@## 5
@$$ 3
### 1
%%% 1
<<< 1
>>> 1
$@% 1

El programa debe llevar la contabilidad del jugador, es decir, si gana o pierde y
mostrarla en todo momento en alguna zona de pantalla. El juego debe acabar
cuando no quede saldo positivo o bien el jugador quiera abandonar mediante su
indicación por el teclado.
Para favorecer al jugador debéis hacer que los caracteres $ y @ tengan un 30% de
probabilidad y el resto un 10% cada uno. Nota: para ello, generad un número de 1 a
10 y, en función de ese valor, generáis:
 el carácter $ si sale 1, 2 ó 3*/
public class ejev5 {
	public static void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	String probabilidad="$$$@@@#%<>";
	int dinero=100;
	String combinacion="  ";
	boolean retirarse=false;
	int instruccion=5;
	String combinacion1string;
	char combinacion1;
	double aleatorio1=(Math.random())*10+1;
	int aleatorio=(int)aleatorio1;
	System.out.println("introduzca instruccion: 1 para jugar 0 para retirarse");
	System.out.println("su contabilidad actual es de "+dinero+" $");
	while (dinero>0&&retirarse==false) {
		instruccion=teclado.nextInt();
		if(instruccion==1) {
			combinacion1string=combinacion.substring(0, 0);
			combinacion1=probabilidad.charAt(aleatorio);
			combinacion1string=combinacion1string+combinacion1;
			System.out.println(combinacion1string);
			
		}
		if (instruccion==0) {retirarse=true;}
		
		
		
	}
	}
}
