package qaclickacademy;

public class ConstructerDemoChild extends ConstructorDemoParent {
	String state="Sikim";
	static String city="Kolkata";
	String name;
	String address;
	
	
	public ConstructerDemoChild()
	{
		System.out.println("This is a constructer");
	}
	public ConstructerDemoChild(int a, int b)
	{
		System.out.println("This is parameterized constructer");
		int sum=a+b;
		System.out.println("The sum is:"+sum);
	}
	public ConstructerDemoChild(String name,String address)
	{
		String state="west bengal";
		city=super.city;
		System.out.println(name+"'s Address is "+address+ " , "+city);
		System.out.println("Your state is: "+this.state);
	}
	

	public static void main(String[] args) {
		
		ConstructerDemoChild CD= new ConstructerDemoChild();
		ConstructerDemoChild CD2= new ConstructerDemoChild(5,2);
		ConstructerDemoChild CD3= new ConstructerDemoChild("Maruf","Biswanathpur");
		ConstructerDemoChild CD4= new ConstructerDemoChild("Bappa","Ramnathpur");
		
	}

}
