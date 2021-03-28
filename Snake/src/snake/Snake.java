package snake;

import basis.*;

public class Snake {

	private snakemain snm;
	public int xSnake;
	public int ySnake;
	public int lenght;
	private int[][] standort;

	public Snake(snakemain psnm) {
		snm = psnm;
		lenght = 1;
		xSnake = 400;
		ySnake = 400;
		snm.direction = 1;
		standort = new int[2][99];
	}

	public void zeichneSnake(int x, int y) {
		snm.meinStift.bewegeAuf(x, y);
		snm.meinStift.setzeFarbe(Farbe.GRUEN);
		snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
		snm.meinStift.dreheBis(0);
		snm.meinStift.zeichneRechteck(100, 100);
	}

	public void loescheSnake(int x, int y) {
		snm.meinStift.bewegeAuf(x, y);
		snm.meinStift.setzeFarbe(Farbe.WEISS);
		snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
		snm.meinStift.dreheBis(0);
		snm.meinStift.zeichneRechteck(100, 100);
	}

	public void moveup() {
		if (snm.snaketick == 0) {
			loescheSnake(xSnake,ySnake);
		} else {
			loescheSnake(standort[0][snm.snaketick - lenght], standort[1][snm.snaketick - lenght]);
		}
		ySnake = ySnake - 100;
		zeichneSnake(xSnake, ySnake);
		savepos();
		snm.direction = 1;
	}

	public void movedown() {
		if (snm.snaketick == 0) {
			loescheSnake(xSnake,ySnake);
		} else {
			loescheSnake(standort[0][snm.snaketick - lenght], standort[1][snm.snaketick - lenght]);
		}
		ySnake = ySnake + 100;
		zeichneSnake(xSnake, ySnake);
		savepos();
		snm.direction = 2;
	}

	public void moveleft() {
		if (snm.snaketick == 0) {
			loescheSnake(xSnake,ySnake);
		} else {
			loescheSnake(standort[0][snm.snaketick - lenght], standort[1][snm.snaketick - lenght]);
		}
		xSnake = xSnake - 100;
		zeichneSnake(xSnake, ySnake);
		savepos();
		snm.direction = 3;
	}

	public void moveright() {
		if (snm.snaketick == 0) {
			loescheSnake(xSnake,ySnake);
		} else {
			loescheSnake(standort[0][snm.snaketick - lenght], standort[1][snm.snaketick - lenght]);
		}
		xSnake = xSnake + 100;
		zeichneSnake(xSnake, ySnake);
		savepos();
		snm.direction = 4;
	}

	public void savepos() {
		standort[0][snm.snaketick] = xSnake;
		standort[1][snm.snaketick] = ySnake;
	}
}
