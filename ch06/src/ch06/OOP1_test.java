package ch06;

class Student1{
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student1() {}
	Student1(String name, int ban, int num, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	String info() {		
		return "Name : " + name + ", Ban : " + ban + ", Num : " + num +
				"\nKor score : " + kor + ", Eng score : " + eng + ", Math score : " + math
				+ "\nSum : " + (this.kor + this.eng + this.math)
				+ ", Average : " + (int)((kor + eng + math) / 3f * 10 + 0.5) / 10f;
	}
}
public class OOP1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1("Honggildong",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
	}

}
