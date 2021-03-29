package snake;

import basis.*;

public class Apfel {
	
	private snakemain snm;
	public int xApfel;
	public int yApfel;
	
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
	public void neuerApfel() {
		snm.meinStift.bewegeAuf(xApfel, yApfel);
		snm.meinStift.setzeFarbe(Farbe.GRUEN);
		snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
		snm.meinStift.dreheBis(0);
		snm.meinStift.zeichneRechteck(100, 100);
		snm.meinStift.bewegeAuf(xApfel = Hilfe.zufall(0, 9) * 100,yApfel = Hilfe.zufall(0, 9) * 100);
		snm.meinStift.setzeFarbe(Farbe.ROT);
		snm.meinStift.setzeFuellMuster(Muster.GEFUELLT);
		snm.meinStift.dreheBis(0);
		snm.meinStift.zeichneRechteck(100, 100);
	}
}
