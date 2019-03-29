/*
 * ���� ��ų�̶� � ��ų�� ���� ���� ���� ����� �ϴ� ��ų�� ���մϴ�.
 * ���� ��� ���� ��ų ������ ����ũ �� ����Ʈ�� ��Ʈ �� ����϶�, ����� ������ ���� ����Ʈ�� ��Ʈ�� ����� �ϰ�, ����Ʈ�� ��Ʈ�� ������ ���� ����ũ�� ����� �մϴ�.
 * �� ������ ���� �ٸ� ��ų(���� ��)�� ������ ������� ��� �� �ֽ��ϴ�. 
 * ���� ����ũ �� ���� �� ����Ʈ�� ��Ʈ �� ����� ���� ��ųƮ���� ����������, ��� �� ����ũ�� ����Ʈ�� ��Ʈ �� ����ũ �� ���� �� ����� ���� ��ųƮ���� �Ұ����մϴ�.
 * ���� ��ų ���� skill�� �������� ���� ��ųƮ��1�� ���� �迭 skill_trees�� �Ű������� �־��� ��, ������ ��ųƮ�� ������ return �ϴ� solution �Լ��� �ۼ����ּ���.
 */
package practice;

public class SkillTree {

	public static void main(String[] args) {
		SkillTree theSkillTree = new SkillTree();
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(theSkillTree.solution(skill, skill_trees));
	}

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		
		for (int i = 0; i < skill_trees.length; ++i) {
			boolean flag = true;
			String[] skills = skill_trees[i].split("");
			int cnt = 0;
			for (int j = 0; j < skills.length; ++j) {
				if (cnt < skill.indexOf(skills[j])) {
					flag = false;
					break;
				} else if (cnt == skill.indexOf(skills[j]))
					cnt++;
			}
			if (flag) {
				answer++;
			}
		}

		return answer;
	}
}
