package vik.selflearning.adapterDesignPattern;

public class AssignmentWork {
	Pen pen;

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public void write(String string) {
		pen.write(string);
	}

}
