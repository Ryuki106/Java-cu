package curriculum_A;

public class Curriculum1 {
	
	public static void main(String[] ages) {
		//1.2.3
		//バイト型
		byte b = 0;
	    b=10;
		//短整数型
		short s = 0;
		s=100;
		//整数型
		int i=0;
		i=1000;
		//調整数型
		long l=0L;
		l=10000;
		//単精度浮動小数点型
		float f = 0.0f;
		f=9.5f;
		//倍精度浮動小数点型
		double d = 0.0d;
		d=10.5;
		//文字型
		char c = 0;	
		c='a';
		//文字列型
		String str = null;
		str="ハロー";
		//ブーリアン型
		boolean bool = false;
		bool=true;
		
		//4
		System.out.println(b +s +i +l);
		System.out.println(f+d);
		System.out.println(c+str+bool);
		System.out.println(b+s+i+l+f+d);
		System.out.println(b*s*i*l);
		System.out.println(d/s);
		System.out.println(b-s);
		
		//5.ハローjava43
		int num =20;
		int num1 =23;
		System.out.println("ハローJAVA"+(num+num1));
	
	
	}

}
