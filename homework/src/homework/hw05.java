package homework;

import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// indexof()karakterin yerini bulur
		String str ="Istanbullu";
		System.out.println(str.indexOf("u"));
		//last IndexOf()Metodu aradimigiz karakterin string icindeki son yerini verir.
		System.out.println(str.lastIndexOf("u"));
		// Kullanicinin ismini alalim ve ilk harfiyle son harfini yes degistirelim.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String st = scan.nextLine();
		char ch1 = st.charAt(0);
		char ch2 = st.charAt(st.length()-1);
		System.out.println(ch2+st.substring(1,st.length()-1)+ch1);
		//contains() String icersinde aranan karakter varsa true yoksa false döner
		
		System.out.println(str.contains("iz"));
		scan.close();
		
		String a ="";
		System.out.println(a.isEmpty());//True && String a = " "; //false

		String c = "   adige   ";
		System.out.println(c.trim());
		
		System.out.println(str.startsWith("a"));//Startswith ilk harf true/false enswith son harf kontrol eder.
		//subString belirli bir kismi almamizi saglar.
		System.out.println(str.substring(4));
		System.out.println(str.substring(2, 8));
		System.out.println(str.indexOf('t'));
		//concat() iki stringi birlestirir.
		System.out.println(str.concat(c).concat(str));
		System.out.println(str+c);
		
		//replace()stringde istenen karakterin baska bir karakterle degistirilmesini saglar.
		System.out.println(str.replace("i", "I"));
		
		//replaceFirst() ilk karakteri degistirir.
		System.out.println(str.replaceFirst("u", "a"));
		//valueOf() rakamlarla olusturulan stringleri yasiya dönüstürür.
		// 1.Stringleri sayiya dönüstürür.Integer.valueof(String)
		// 2.Integer olan sayiyi Stringe cevirir.String.valueof(int)
		
		String para1 = "1900";
		String para2 = "2500";
		System.out.println(para1+para2);
		System.out.println(Integer.valueOf(para1)+Integer.valueOf(para2));
		
		int num1 = 100;
		int num2 = 200;
		System.out.println(String.valueOf(num1)+String.valueOf(num2));
		
		} 
}


