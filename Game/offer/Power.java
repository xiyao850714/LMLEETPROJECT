package offer;

public class Power {
	public static double myPower(double base, int e){
		double result = 0.0;
		double tmp = 0.0;
		if(e == 0) return 1.0;
		if(e == 1) return base;
		if(e >1)
			tmp = myPower(base, e >> 1);
		    result = tmp*tmp;
		if(e%2 == 1) result *= base;
		if( e > -0.000001 && e < 0.000001 )
			result = 1.0/result;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Power.myPower(5, 2));
		System.out.println(Power.myPower(5, -1));
		System.out.println(Power.myPower(0.0000000001, 2));

	}

}
