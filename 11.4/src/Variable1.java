class Variable1 {
	public void sum(int ...n) {
		int sum = 0;
		for(int i:n) {
			sum += i;
		}
		System.out.println("sum" + sum);
	}

	public static void main(String[] args) {
		Variable1 variable1 = new Variable1();
		variable1.sum(1,2,3,4,5);
		variable1.sum(1,2,3,4);
		variable1.sum(1,2,3);
	}
}
