
abstract class Bike {
	
	abstract void run();
	
}
class Honda extends Bike{
	void run()
	{
		
		System.out.println("Abstraction");
	}
}
class Abstraction{
	
	public static void main(String[] args) {
		
		/*Honda h = new Honda();
		h.run();*/
		// TODO Auto-generated method stub
		Bike b = new Honda();
		b.run();

	}

}
