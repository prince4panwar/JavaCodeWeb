class program58{
	void PrintNaturalNumbers(){
		System.out.println("Program to Print First Five Natural Numbers");
		System.out.print("First Five Natural Numbers are : ");
		int i;
		for(i = 1; i <= 5; i++){
			System.out.print(i + " , ");
		}
	}
	public static void main(String args[]){
		program58 obj = new program58();
		obj.PrintNaturalNumbers();
	}
}