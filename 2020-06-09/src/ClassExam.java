
public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Kim.name = "김현우";
		Kim.grade = 3;
		System.out.println("학생의 이름은"+Kim.name+"이고, "
				+Kim.grade+"학년입니다.");
		
	}
}
class Student{
	char name;
	int grade;
	
	}

