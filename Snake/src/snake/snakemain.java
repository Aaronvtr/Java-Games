package snake;
import basis.*;

public class snakemain {

	public Fenster meinFenster;
	public Stift meinStift;
	public Tastatur meineTastatur;
	private Apfel apl;
	private Snake snake;
	public int direction;
	public int snaketick;
	
	public snakemain() {
		meinFenster = new Fenster(1000,1000);
		meinStift = new Stift();
		apl = new Apfel(this);
		snake = new Snake(this);
		meineTastatur = new Tastatur();
		snaketick = 0;
	}
	
	public void fuehreAus() {
		apl.zeichneApfel(Hilfe.zufall(0, 9) * 100,Hilfe.zufall(0, 9) * 100);
		while(true) {
			if(meineTastatur.wurdeGedrueckt()) {
			switch(meineTastatur.zeichen())
	        {       
	            case 'w': {snake.moveup(); Hilfe.pause(500); break;}
	            case 'W': {snake.moveup(); Hilfe.pause(500); break;}
	            case 'a': {snake.moveleft(); Hilfe.pause(500); break;}
	            case 'A': {snake.moveleft(); Hilfe.pause(500); break;}
	            case 's': {snake.movedown(); Hilfe.pause(500); break;}
	            case 'S': {snake.movedown(); Hilfe.pause(500); break;}
	            case 'd': {snake.moveright(); Hilfe.pause(500); break;}
	            case 'D': {snake.moveright(); Hilfe.pause(500); break;}
	        }
			} else if(direction == 1){
				snake.moveup();
				Hilfe.pause(500);
			} else if(direction == 2) {
				snake.movedown();
				Hilfe.pause(500);
			} else if(direction == 3) {
				snake.moveleft();
				Hilfe.pause(500);
			} else if(direction == 4) {
				snake.moveright();
				Hilfe.pause(500);
			}
			if(snake.xSnake == apl.xApfel && snake.ySnake == apl.yApfel) {
				apl.neuerApfel();
				snake.lenght++;
			}
			snaketick++;
			}
		}
	
	
	public static void main(String[] args) {
	snakemain s = new snakemain();
	s.fuehreAus();
	}

}
