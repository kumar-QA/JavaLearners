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
		
//		int a=100;
//		int c=200;
//		int e=a++;// e=100 a=101
//		int f=++e;//e=101  f=101
//		int x=++a;//a=102  x=102
//		int d=f++;//d=101  f=102
//		
//		System.out.println(a);//102
//		System.out.println(c);//200
//		System.out.println(e);//101
//		System.out.println(f);//102
//	    System.out.println(x);//102
//	    System.out.println(d);//101
		
		int a=300;
		int v=400;
		int c=++v;
		int d=v++;
		int e=d++;
		int g=--e;
		int f=++e;
		int s=--f;
		int z=c--;
		int x=a--;
		int x1=x++;
		int i=--z;
		int b=--i;
		int n=i--;
		
		
		System.out.println(a);
		System.out.println(v);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		System.out.println(f);
		System.out.println(s);
		System.out.println(z);
		System.out.println(x);
		System.out.println(x1);
		System.out.println(i);
		System.out.println(b);
		System.out.println(n);
		
		
	}

}
