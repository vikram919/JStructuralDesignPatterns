package vik.selflearning.adapterDesignPattern;

public class School {

	public static void main(String[] args) {
		
		Pen pilotPen = new PilotPenAdapter();
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(pilotPen);
		assignmentWork.write("this is an example for adapter pattern!!");
	}

}
