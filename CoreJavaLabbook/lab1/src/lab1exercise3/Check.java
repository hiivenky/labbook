package lab1exercise3;

public class Check {
	public boolean check(int n) {
		int prev_digit=-1;
		int curr_digit;
		if(n>0) {
			prev_digit=n%10;
			n=n/10;
		}
		while(n>0) {
			curr_digit=n%10;
			if(curr_digit>prev_digit) {
				return false;
			}
			n=n/10;
			prev_digit=curr_digit;
		}
		return true;
	}

}
