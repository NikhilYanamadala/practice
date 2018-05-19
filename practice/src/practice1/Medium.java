package practice1;

import java.util.Comparator;
import java.util.TreeMap;

public class Medium implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 =(Integer)o1;
		Integer i2 =(Integer)o2;
		return i2.compareTo(i1);
	}
	public  static void freqCount(int[] a) {
		
	}
	
	public static void NconsrcNum(int[] a) {
		Medium m1 = new Medium();
		TreeMap<Integer,Integer> m= new TreeMap<>(m1);
		
		for(int i=0;i<a.length;i++) {
			int freq=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					freq++;
				}
			}
			m.put(freq,a[i]);
		}
		
		System.out.println(m);
		}
	public static String vowelFilter(String s) {
	char[] a = s.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if(i%2!=0) {
			switch(a[i]) {
			case 'a':a[i]=' ';
			case 'e':a[i]=' ';
			case 'i':a[i]=' ';
			case 'o':a[i]=' ';
			case 'u':a[i]=' ';
			}
		}
		}
	String s1= new String(a);
	//System.out.println(s1);
	//s1.replaceAll("\\s", "");
	     return s1;
		}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,3,3,2,2,3,1,4,22,4,5};
		
		//NconsrcNum( a);
		System.out.println(vowelFilter("banemikonu"));
	}

	
}
