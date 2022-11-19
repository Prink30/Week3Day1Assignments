package Week3Day1Assign4;

public class Students {

	public void getStudentInfo(int i) {
		System.out.println("student id is" + " " + i);
	}
	
	public void getStudentInfo(int a, String name ) {
		System.out.println("student id is" + " " + a + " " + "and student name is" + " " +  name);
	}
	
	public void getStudentInfo(String email, long phnnumbr) {
		System.out.println("student email id is" + " " + email + " " + "and student phnnumbr is" + " " +  phnnumbr);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Students obj = new Students();
		obj.getStudentInfo(22);
		obj.getStudentInfo(22,"Nishadh");
		obj.getStudentInfo("test@gmail.com", 789876567);
		
		
		
	}

}
