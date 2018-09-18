public class MyCal {
	
	public static void main(String [] args) {
		// make the necessary constructors
		MyCal my = new MyCal();
		One tom = new One(5,'A');
		Two joe = new Two("Harry");
		One amy  = new One(12,'B');
		
		// make the following methods so the method calls DISPLAY something
		// if there is a System.out below, then return the appropriate value
		my.addNumbers(4,6);
		tom.divideNumbers(7,3);
		System.out.println(joe.reverseString("upside"));
		amy.getCharacterAt("Banana Peal",6);
		System.out.println(amy.divideNumbers(4.5,6.2));
		System.out.println(my.addNumbers(4,5,6,2));	
		joe.doubleNumber(13324353353);
		joe.toThePower(4353353,2);=
		tom.concatStrings("Thank","You",'A',"Lot",'!');
		
		
	}
	


}
