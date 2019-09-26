package lab1exercise2;

public class Calculate {
	public void calculate(int n) {
		long squared_sum=0;
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
			squared_sum=(i*i)+squared_sum;
		}
		System.out.println("DIfference is : "+ (squared_sum-(sum*sum)));
	}

}
