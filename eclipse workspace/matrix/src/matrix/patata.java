package matrix;
import java.util.TimerTask;
import java.math.*;
public class patata extends TimerTask{
	

	@Override
	public void run() {
		String digitos="qwertyuiopasdfghjklñzxcvbnm1234567890       ";
		
		char [][] matrix= 
				{{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))},
				{digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43)),digitos.charAt((int) (Math.random()*43))}};
		for (int i=0;i<10;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matrix[i][j]);
			}
		System.out.println();}
		
	}

}
