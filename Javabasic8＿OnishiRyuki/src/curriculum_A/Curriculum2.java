package curriculum_A;

public class Curriculum2 {
	public static void main(String[] ages) {
		String name="山田太郎";
		int age =18;
		double height=170.5;
		double weight=62.2;	
		String food="寿司";
		
		//6
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は"+ weight +"kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
	    //7
		double bmi = weight / ((height / 100)*(height /100));
		System.out.println("BMIは"+bmi+"です");
		
		//8
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
	    food = "オムライス";
	    
	    System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は"+ weight +"kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		double bmi2 = weight / ((height / 100)*(height /100));
		System.out.println("BMIは"+bmi2+"です");
		
		//9
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + (age+24 )+ "歳です");
		System.out.println("身長は" + (height+168.5) + "cmです");
		System.out.println("体重は"+ (weight+64.2 )+"kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		System.out.println("BMIは"+(bmi2/2)+"です");
	   
		//10
		String result = age > 25?"true":"false";
		
		System.out.println(result);
		
		//11
		int intSample = 24;
		double num = Double.parseDouble("168.5");
		double num2 = Double.parseDouble("64.2");		
		String intString = String.valueOf(intSample);
		
		System.out.println(intString+num+num2);
		
		//12
		String hoge ="24";
		String hoge2 = "168";
		int num3 =Integer.parseInt(hoge);
		int num4 =Integer.parseInt(hoge2);
		
		System.out.println(""+num3+num4);	
			
		//13
		int n1 = num3, n2= num4;
		
		System.out.println(n1 >25 || n2 > 160);
		
		
		
		
		
		
		
	}

}
