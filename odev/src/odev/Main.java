package odev;


public class Main {

	public static void main(String[] args) {


		Course course1 = new Course();
		course1.courseId = 1;
		course1.courseName = "Yazılım geliştirirci yetiştirme kampı(C# + ANGULAR)";
		course1.instructor = "Engin Demiroğ";
		course1.price = 0;
		
		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "Yazılım geliştirirci yetiştirme kampı(JAVA + REACT)";
		course2.instructor = "Engin Demiroğ";
		course2.price = 0;
		
		
		Course course3 = new Course();
		course3.courseId = 3;
		course3.courseName = "Programlamaya giriş için temel kurs";
		course3.instructor = "Engin Demiroğ";
		course3.price = 0;
		
		Course[] courses = {course1, course2, course3};
		
		System.out.println("....KURSLAR......");
		
		for(Course Course: courses) {
			System.out.println("Kurs id: " + Course.courseId );
			System.out.println("Kurs adı: " + Course.courseName );
			System.out.println("Kurs eğitmeni: " + Course.instructor );
			System.out.println("Kurs fiyatı: " + Course.price + "TL" );
		}
		
		Student student1 = new Student();
		student1.studentId = 4;
		student1.studentName = "Hacer";
		student1.studentSurname = "Z";
		student1.email = "xyz@gmail.com";
		
		Student student2 = new Student();
		student2.studentId = 5;
		student2.studentName = "Ayşe";
		student2.studentSurname = "X";
		student2.email = "abc@gmail.com";
		
		Student student3 = new Student();
		student3.studentId = 6;
		student3.studentName = "Hakan";
		student3.studentSurname = "Y";
		student3.email = "def@gmail.com";
		
		Student[] students = {student1, student2, student3};
		
		System.out.println(".....ÖĞRENCİLER.......");
		
		for (Student Student : students) {
			System.out.println("Öğrenci id: " + Student.studentId);
			System.out.println("Öğrenci adı: " + Student.studentName);
			System.out.println("Öğrenci soyadı: " + Student.studentSurname);
			System.out.println("Öğrenci email: " + Student.email);
			
		}
		
		
		System.out.println(".......Kayıt olduğunuz kurslar........");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);
		
		
				

	}

}
