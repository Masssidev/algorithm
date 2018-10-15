/*
 * �ٹ��ð��� ����Ͽ� �ٹ��ð��� �ʰ� �Ͽ��� ��� ��� �˷��ִ� method�� �ۼ��ϼ���.
 * ������ ������ �����ϴ�.
- �ٹ��ð��� �Ϲ� �ٹ��ð��� �߰� �ٹ��ð����� ������ �Ϲ� �ٹ��ð��� 40�ð�, �߰� �ٹ��ð��� 12�ð��� �ʰ��ϸ� �ȵ˴ϴ�.
- ���� 6�ú��� ���� 19�� ���̴� �Ϲ� �ٹ� �ð��Դϴ�.
- ���� 19�ú��� ������ ���� 6�� ������ �߰��ٹ� �ð��Դϴ�.
- 0�� ������ ��Ÿ����10�� ���� 10��, 22�� ����10�ø� ��Ÿ���ϴ�.
- �Է°��� �ٹ� ���� �ð��� �� �ð��� �����ϴ� �迭�Դϴ�.

- �Է°� ����
{{9, 18}, {9, 0}, {10, 20}, {9, 19}, {8. 17}}
 */
package practice;

/**
 * ������� �ִ� �ٹ� �ð��� ����ϴ� Ŭ����
 */
public class WorkingHoursCalculator {

	public static void main(String[] args) {
		System.out.println(isOverTime(new int[][] { { 9, 18 }, { 9, 0 }, { 10, 20 }, { 9, 19 }, { 8, 17 } }));
	}

	/**
	 * �� �� �ٹ� �ð��� �ʰ� �ٹ����� ���θ� �˻��Ѵ�.
	 * 
	 * @param �����Ϻ���
	 *            �ݿ��ϱ����� ����� �ð��� ��Ÿ���� �迭
	 * 
	 * @return �ʰ� �ٹ��ߴ��� ���θ� Ȯ�� �ϴ� boolean��
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
