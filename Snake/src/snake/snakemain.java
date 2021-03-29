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
	            case 'w': {snake.moveup(); break;}
	            case 'W': {snake.moveup(); break;}
	            case 'a': {snake.moveleft(); break;}
	            case 'A': {snake.moveleft(); break;}
	            case 's': {snake.movedown(); break;}
	            case 'S': {snake.movedown(); break;}
	            case 'd': {snake.moveright(); break;}
	            case 'D': {snake.moveright(); break;}
	        }
				Hilfe.pause(500);
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
				apl.neuerApfel(1);
				snake.lenght++;
			}
			if(snake.xSnake > 900 || snake.xSnake == -100 || snake.ySnake > 900 || snake.ySnake == -100){
				resetgame();
			}
			snaketick++;
			}
		}
	public void resetgame(){
		snake.lenght = 1;
		snaketick = 0;
		meinFenster.loescheAlles();
		snake.xSnake = 300;
		snake.ySnake = 300;
		apl.neuerApfel(0);
	}
	
	public static void main(String[] args) {
	snakemain s = new snakemain();
	s.fuehreAus();
	}

}
