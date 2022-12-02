
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		int membershipNumber;
		String name;
		String residentRegistrationNumber;
		char gender;
		int numberOfMarriages;
		boolean smoking;
		double height;
		char grade;
		char face;

		membershipNumber = 236514;
		name = "홍길동";
		residentRegistrationNumber = "201212-3495039";
		gender = '남';
		numberOfMarriages = 0;
		smoking = true;
		height = 178.3;
		grade = 'A';
		face = '상';

		System.out.println("회원번호 : " + membershipNumber);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + residentRegistrationNumber);
		System.out.println("성별 : " + gender);
		System.out.println("결혼횟수 : " + numberOfMarriages);
		System.out.println("흡연여부 : " + smoking);
		System.out.println("키       : " + height);
		System.out.println("학    점 : " + grade);
		System.out.println("용    모 : " + face);

	}

}
