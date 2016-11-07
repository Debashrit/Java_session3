
public class studentdetails {
	int rollno;
	String name;
	String college;
	int marks;

	public studentdetails(int r,String n,String c,int m) {
		rollno = r;
		name = n;
		college = c;
		marks = m;
	}
public void display(){
	System.out.println(rollno + " " + name + " " + college + " " + marks);
}
	public static void main(String[] args) {
		studentdetails s1 = new studentdetails(1,"anish","ITER",75);
		studentdetails s2 = new studentdetails(2,"deb","CET",88);
		studentdetails s3 = new studentdetails(3,"bibhu","MANIPAL",67);
		studentdetails s4 = new studentdetails(4,"rahul","KMP",71);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();

	}

}
