
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("---학생10명 성적데이터를 저장하기위한 배열객체생성 초기화---");

		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 10, 20, 30, 4, 50, 6, 87, 8, 9, 10 };
		int[] engArray = { 10, 20, 30, 4, 50, 65, 7, 8, 9, 10 };
		int[] mathArray = { 10, 20, 30, 4, 50, 6, 7, 8, 9, 10 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점,평균,평점계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i] / 3.0;

			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			}
		}
		for (int j = 0; j < noArray.length; j++) {
			if (totArray[0] > totArray[j]) {
				rankArray[0]++;
			}
		}
		for (int j = 0; j < noArray.length; j++) {
			if (totArray[1] > totArray[j]) {
				rankArray[1]++;
			}
		}
		for (int j = 0; j < noArray.length; j++) {
			if (totArray[2] > totArray[j]) {
				rankArray[2]++;
			}
		}
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}

	}

}
