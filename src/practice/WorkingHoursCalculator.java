/*
 * 근무시간을 계산하여 근무시간을 초과 하였을 경우 경고를 알려주는 method를 작성하세요.
 * 조건은 다음과 같습니다.
- 근무시간은 일반 근무시간과 야간 근무시간으로 나뉘며 일반 근무시간은 40시간, 야간 근무시간은 12시간을 초과하면 안됩니다.
- 오전 6시부터 오후 19시 사이는 일반 근무 시간입니다.
- 오후 19시부터 다음날 오전 6시 까지는 야간근무 시간입니다.
- 0은 자정을 나타내며10은 오전 10시, 22는 오후10시를 나타냅니다.
- 입력값은 근무 시작 시간과 끝 시간을 포함하는 배열입니다.

- 입력값 예시
{{9, 18}, {9, 0}, {10, 20}, {9, 19}, {8. 17}}
 */
package practice;

/**
 * 사원들의 주당 근무 시간을 계산하는 클래스
 */
public class WorkingHoursCalculator {

	public static void main(String[] args) {
		System.out.println(isOverTime(new int[][] { { 9, 18 }, { 9, 0 }, { 10, 20 }, { 9, 19 }, { 8, 17 } }));
	}

	/**
	 * 주 당 근무 시간이 초과 근무인지 여부를 검사한다.
	 * 
	 * @param 월요일부터
	 *            금요일까지의 출퇴근 시간을 나타내는 배열
	 * 
	 * @return 초과 근무했는지 여부를 확인 하는 boolean값
	 */
	private static boolean isOverTime(int[][] workinghours) {
		int generalWorkingTime = 0;
		int nightWorkingOvertime = 0;

		for (int i = 0; i < workinghours.length; ++i) {
			if (workinghours[i][0] >= Time.MIDNIGHT.getValue()
					&& workinghours[i][0] < Time.GENERAL_START_TIME.getValue())
				workinghours[i][0] += Time.DAY.getValue();
			if (workinghours[i][1] >= Time.MIDNIGHT.getValue()
					&& workinghours[i][1] <= Time.GENERAL_START_TIME.getValue())
				workinghours[i][1] += Time.DAY.getValue();
		}

		for (int i = 0; i < workinghours.length; ++i) {
			if (workinghours[i][0] < Time.NIGHT_TIME.getValue()) {
				if (workinghours[i][1] <= Time.NIGHT_TIME.getValue()) {
					generalWorkingTime += workinghours[i][1] - workinghours[i][0];
				} else {
					generalWorkingTime += Time.NIGHT_TIME.getValue() - workinghours[i][0];
					nightWorkingOvertime += workinghours[i][1] - Time.NIGHT_TIME.getValue();
				}
			} else {
				if (workinghours[i][1] <= Time.NEXT_GENERAL_TIME.getValue()
						&& workinghours[i][1] > Time.NIGHT_TIME.getValue()) {
					nightWorkingOvertime += workinghours[i][1] - workinghours[i][0];
				} else {
					nightWorkingOvertime += Time.NEXT_GENERAL_TIME.getValue() - workinghours[i][0];
					generalWorkingTime += workinghours[i][1] - Time.GENERAL_START_TIME.getValue();
				}
			}
		}
		return (generalWorkingTime > 40 || nightWorkingOvertime > 12);
	}

	enum Time {
		MIDNIGHT(0), GENERAL_START_TIME(6), NIGHT_TIME(19), DAY(24), NEXT_GENERAL_TIME(30);

		private int value;

		Time(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}
}
