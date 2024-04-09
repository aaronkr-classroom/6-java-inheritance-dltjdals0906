
public class Ex804 extends Math{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, 
			b = 5;
		double c = 2.5, 
			   d = 4.5;
			
			Ex804 calc = new Ex804();
			
			// Add 더하기
			System.out.println(a + "+" + b + "=" + calc.add(a,b)); // (int,int)
			System.out.println(a + "+" + c + "=" + calc.add(a,c)); // (int,double)
			System.out.println(c + "+" + d + "=" + calc.add(c,d)); // (double,double)

			
			// Sub 빼기
			System.out.println(a + "-" + b + "=" + calc.sub(a,b)); // (int,int)
			System.out.println(a + "-" + c + "=" + calc.sub(a,c)); // (int,double)
			System.out.println(c + "-" + d + "=" + calc.sub(c,d)); // (double,double)

			
			// Div 나누기
			System.out.println(a + "/" + b + "=" + calc.div(a,b)); // (int,int)
			System.out.println(a + "/" + c + "=" + calc.div(a,c)); // (int,double)
			System.out.println(c + "/" + d + "=" + calc.div(c,d)); // (double,double)
			
			
			// Mul 곱하기
			System.out.println(a + "*" + b + "=" + calc.mul(a,b)); // (int,int)
			System.out.println(a + "*" + c + "=" + calc.mul(a,c)); // (int,double)
			System.out.println(c + "*" + d + "=" + calc.mul(c,d)); // (double,double)
			
			
			// Sqr 제곱
			System.out.println(a + "*" + a + "=" + calc.sqr(a)); // (int)
			System.out.println(c + "*" + c + "=" + calc.sqr(c)); // (double)
		}
	}


