package javasessions;

public class FInalizeconcept {

	public void finalize() { //called before the garbage collector for clean up process.
		System.out.println("Finalize method");
		
	}
	//final is a keyword,finally is a block,finalize is a method
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		///finalize is used for clean up memory processing.
		FInalizeconcept f1 = new FInalizeconcept();
		FInalizeconcept f2 = new FInalizeconcept();
		f1=null;f2=null; //2 objects are in memory without any reference.
		//After calling garbage collector it will destroy all objects without reference
		//Garbage collector is called to free some space in memory
		System.gc(); 
		
	}

}
