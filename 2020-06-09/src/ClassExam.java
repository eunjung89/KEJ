
public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Student lee = new Student();
		Kim.name = "������";
		Kim.grade = 3;
		Kim.floor = 4;
		lee.name = "�̹ο�";
		lee.grade = 2;
		lee.floor = 5;
		
		
		System.out.println("�л��� �̸���"+Kim.name+"�̰�, "
				+Kim.grade+"�г��Դϴ�.");
		System.out.println(Kim.grade+"�г���"+Kim.floor+"���Դϴ�. ");
		System.out.println("�л��� �̸���"+lee.name+"�̰�, "
				+lee.grade+"�г��Դϴ�.");
		System.out.println("�л��� �̸���"+lee.name+"�̰�, "
				+lee.grade+"�г��Դϴ�.");
		
	}
}
class Student{
	String name;
	int grade;
	int floor;
	
	}

