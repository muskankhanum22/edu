package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a=10;
		int b= 40;
		int c=30;
		int d= 50;
		int e=100;
		int f=3000;
		int max;
		max=(a > b && a > c && a>d &&a>e && a>f) ? a:
		(b>a && b>c && b>d && b>e && b>f) ? b:
		(c>a && c>b && c>d &&c>e && c>f)? c:
		(d>a && d>b && d>c && d>e && d>f)? d:
			(e>a && e>b && e>c && e>e && e>f)? e:f;
	System.out.println(max);
		
		
		
	}

}
