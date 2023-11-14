package tesk;

public class Demo {

	public static void main(String[] args) {
//		
//		int a=10;
//		int b=20;
//		
//		
//		  a=a+b;//30
//		  b=a-b;//10
//		  a=a-b;//20
//		  System.out.println(a);
//		  System.out.println(b);
		  
//		int c=a;//10
//		    a=b;//20;
//		    b=c;//10
//		    
//		    System.out.println(a);
//		    System.out.println(b);
		    
		/*post incremnet rule
		1.asssign part will take place
		2.increment part going to run*/
		
		/* pre incremnet rule
		   --------------------
		1.increment part going to run
		2.asssign part will take place */
		
		int a=100;
		int c=200;
		int e=a++;// e=100 a=101
		int f=++e;//e=101  f=101
		int x=++a;//a=102  x=102
		int d=f++;//d=101  f=102
		
		System.out.println(a);//102
		System.out.println(c);//200
		System.out.println(e);//101
		System.out.println(f);//102
	    System.out.println(x);//102
	    System.out.println(d);//101
		
		
	}

}
