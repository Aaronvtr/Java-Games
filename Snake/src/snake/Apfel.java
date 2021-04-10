package snake;

import basis.*;

public class Apfel {
	
	private snakemain snm;
	public int xApfel;
	public int yApfel;
	private boolean OrtTest = true;

	public Apfel(snakemain psnm) {
		snm = psnm;
	}
	public void zeichneApfel(int x, int y ) {
		xApfel = x;
		yApfel = y;
		snm.meinStift.bewegeAuf(x, y);
		snm.meinStift.setzeFarbe(Farbe.ROT);
		snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
		snm.meinStift.dreheBis(0);
		snm.meinStift.zeichneRechteck(100, 100);
	}
	public void neuerApfel(int i) {
		if (i == 1) {
			snm.meinStift.bewegeAuf(xApfel, yApfel);
			snm.meinStift.setzeFarbe(Farbe.GRUEN);
			snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
			snm.meinStift.dreheBis(0);
			snm.meinStift.zeichneRechteck(100, 100);
		}
			xApfel = Hilfe.zufall(0, 9) * 100;
			yApfel = Hilfe.zufall(0, 9) * 100;
			while(OrtTest2() == true){
				xApfel = Hilfe.zufall(0, 9) * 100;
				yApfel = Hilfe.zufall(0, 9) * 100;
			}
			snm.meinStift.bewegeAuf(xApfel, yApfel);
			snm.meinStift.setzeFarbe(Farbe.ROT);
			snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
			snm.meinStift.dreheBis(0);
			snm.meinStift.zeichneRechteck(100, 100);

	}


	public boolean OrtTest2() {
		for (int a = 0; a < snm.snake.lenght; a++) {
			if (xApfel == snm.snake.standort[0][snm.snaketick - a] && yApfel == snm.snake.standort[1][snm.snaketick - a]) {
				OrtTest = true;
			} else {
				OrtTest = false;
			}
		}
		return OrtTest;
	}
}
