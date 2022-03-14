package matrix;
import java.util.Timer;
import java.util.TimerTask;

public class Matrix {
	Timer timer= new Timer();
	Matrix(){
		
	}
	patata timerTask= new patata();
	public static void main(String[] args) {
		Timer timer= new Timer();
		patata timerTask= new patata();
		timer.scheduleAtFixedRate(timerTask, 1000, 2000);
		
	}

}
