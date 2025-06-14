package samplepackage;

public class SampleConstructorPrgCls {

	int tot_marks ;
	int mk1, mk2,mk3;
	public static void main(String[] args) {
		int totalMk1  = 0;;
		int totalMk2 = 0;;
		SampleConstructorPrgCls consCls1 = new SampleConstructorPrgCls(50,50,50);
		SampleConstructorPrgCls consCls2 = new SampleConstructorPrgCls(10,14,10);
		totalMk1 = consCls1.totalMarks();
		System.out.println("TOTAL MARKS1 = " + totalMk1);
		totalMk2 = consCls2.totalMarks();
		System.out.println("TOTAL MARKS2 = " + totalMk2);
		consCls1.grade(totalMk1);
		consCls2.grade(totalMk2);
		

	}
	public SampleConstructorPrgCls(int mk1,int mk2,int mk3) {
		this.mk1 = mk1;
		this.mk2 = mk2;
		this.mk3 = mk3;
		
		
		
	}
	public int totalMarks() {
		tot_marks = mk1 + mk2 + mk3;
		return tot_marks;
	}
	public void grade(int tot_marks) {
		double avg = 0.0;
		avg = tot_marks/3;
		if (avg > 40 && avg <= 80) {
			System.out.println(" A Grade");
		} else if (avg > 20 && avg <=40) {
			System.out.println(" B Grade");
		} else {
			System.out.println("Failed");
		}
	}

}
