package basicprograms;

public class Mainclass {
	
	public static void main(String[] args) {
		
		Presenter ceo=new Presenter();
		Momentum m2=ceo.giveaward();
		System.out.println(m2.message);
		System.out.println(m2.year);
	}

}
