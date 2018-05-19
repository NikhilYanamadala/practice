package practice1;

import java.util.ArrayList;
import java.util.HashSet;

public class Hard {
	public static ArrayList fibanocci(int i) {
	ArrayList a= new ArrayList();	
	a.add(0);
	a.add(1);
	
	int num=0;
	for (int j = 1; j < a.size(); j++) {
		if(num<i) {
			num=(Integer)a.get(j)+(Integer)a.get(j-1);
			a.add(num);
		}
		
	}
        
		return a;
	}
	public static int primeFactors(int i) {
		ArrayList a = new ArrayList();
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				a.add(j);
			}
		}
		return 1;
	}
	public static void prime(int[] a) {
		ArrayList al1 = new ArrayList();
		
		HashSet l= new HashSet();
		ArrayList al;
		l1:
		for(int i=2;i<15;i++) {
			l2:
			for(int j=2;j<i;j++) {
				if(i!=j) {
				if(i%j==0) {
					break l2;
				}else {
					l.add(i);

				}
				}
			}
		}
		
		al = new ArrayList(l);
		for (int j = 0; j < a.length; j++) {
			l2:
			for (int j2 = 0; j2 < al.size()-1; j2++) {

				if(a[j]==(Integer)al.get(j2)) {
                al1.add(al.get(j2+1));
                break l2;
			}
		}
	}

		System.out.println(al1);
	}
	public static void calc(String s) {
		char[] c=s.toCharArray();
		int result=0;
		int j=0,k=0;
		for(int i=0;i<c.length-1;i++) {
			if(i==0) {
				j=Character.getNumericValue(c[i]);
			}
			if(i%2==0) {
		k=Character.getNumericValue(c[i+2]);
		}
		else {
		switch(c[i]) {
		case '+':result=j+k;
		break;
		case '-':result=result-k;
		break;
		case '*':result=result*k;
		break;
		case '/':result=result/k;
		break;
	}
		}
	
		}
		System.out.println(result);
	}
public static void main(String[] args) {
	//System.out.println(fibanocci(5));
	int[] a= {3, 5, 7, 9,8,11};
	//prime(a);
	calc("5+3*5/5");
}
}
