package Week3Day1Assign5;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Selenium() {
		
		System.out.println("Selenium course");
	}

	public void java() {
		System.out.println("Java course");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby course");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation obj = new Automation();
		
		obj.Selenium();
		obj.java();
		obj.Ruby();
		obj.python();
		

	}



	

	

	

}
