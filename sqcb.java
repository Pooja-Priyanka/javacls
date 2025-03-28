class sqcb{
	int result1,result2;

	//method to calculate square//
	public void Square(int num){
	    result1 = num*num;
	    System.out.println("square_of_a_number: " +result1);
	}
	//method to calculate cube//
	public void Cube(int num){
	    result2 = num*num*num;
	    System.out.println("cube_of_a_number: " +result2);
	}

	public static void  main(String[] args){
	// create an object square//
	sqcb ex = new sqcb();
	//pass the value of x//
	ex.Square(5);
	ex.Cube(2);
	}
}

