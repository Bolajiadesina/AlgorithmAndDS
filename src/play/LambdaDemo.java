package play;






interface A{
	void show();
}


class XYZ implements A{
	
	public void show() {
		System.out.println("Hello");
	}
	
	
}
public class LambdaDemo {
	

	
	public static void main(String args []) {
		
		A obj;
		obj= new XYZ();
		
		obj.show();
	
	}

}
