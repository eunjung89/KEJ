
public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Student lee = new Student();
		Kim.name = "김현우";
		Kim.grade = 3;
		Kim.floor = 4;
		lee.name = "이민우";
		lee.grade = 2;
		lee.floor = 5;
		
		
		System.out.println("학생의 이름은"+Kim.name+"이고, "
				+Kim.grade+"학년입니다.");
		System.out.println(Kim.grade+"학년은"+Kim.floor+"층입니다. ");
		System.out.println("학생의 이름은"+lee.name+"이고, "
				+lee.grade+"학년입니다.");
		System.out.println("학생의 이름은"+lee.name+"이고, "
				+lee.grade+"학년입니다.");
		
	}
}
class Student{
	String name;
	int grade;
	int floor;
	
	}

