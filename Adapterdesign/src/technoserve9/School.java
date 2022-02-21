package technoserve9;

import technoserve9.PioletPen;

public class School {
	public static void main(String args[])
	{
	Pen p = new PenAdapter();
	AssignmentWork aw = new AssignmentWork();
	aw.setP(p);
	aw.writeAssignment("im tired");
}
}