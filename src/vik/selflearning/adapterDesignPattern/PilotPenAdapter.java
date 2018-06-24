package vik.selflearning.adapterDesignPattern;

public class PilotPenAdapter implements Pen {

	PilotPen pilotPen = new PilotPen();

	@Override
	public void write(String str) {
		pilotPen.make(str);
	}

}
