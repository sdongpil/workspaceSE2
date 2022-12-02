
public class StudentMemberFieldMain {

	public static void main(String[] args) {	
		Student s1 = new Student();
		Student s2 = new Student();
		s1.number = 1;
		s1.name = "김경호";
		s1.kor = 92;
		s1.eng = 86;
		s1.math = 78;
		

		s2.number = 2;
		s2.name = "김철수";
		s2.kor = 83;
		s2.eng = 60;
		s2.math = 75;

		s1.total = s1.kor + s1.eng + s1.math;
		s1.average = (double)s1.total / 3;
		if (s1.average >= 90 && s1.average <= 100) {
			s1.grade = 'A';
		} else if (s1.average >= 80 && s1.average <= 89) {
			s1.grade = 'B';
		} else if (s1.average >= 70 && s1.average <= 79) {
			s1.grade = 'C';
		} else if (s1.average >= 60 && s1.average <= 69) {
			s1.grade = 'D';
		} else
			s1.grade = 'F';

		s2.total = s2.kor + s2.eng + s2.math;
		s2.average = (double)s2.total / 3;
		if (s2.average >= 90 && s2.average <= 100) {
			s2.grade = 'A';
		} else if (s2.average >= 80 && s2.average <= 89) {
			s2.grade = 'B';
		} else if (s2.average >= 70 && s2.average <= 79) {
			s2.grade = 'C';
		} else if (s2.average >= 60 && s2.average <= 69) {
			s2.grade = 'D';
		} else
			s2.grade = 'F';

		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", s1.number, s1.name, s1.kor, s1.eng, s1.math,
				s1.total, s1.average, s1.grade, 3);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n", s2.number, s2.name, s2.kor, s2.eng, s2.math,
				s2.total, s2.average, s2.grade, 3);

	}

}
