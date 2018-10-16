/*
 * xml ������ ���ڿ��� �Է¹޾� �ش� ���ڿ��� ��ȿ���� �����ϴ� method�� �ۼ��ϼ���. 
 * ������ ������ �����ϴ�.
- ���ڿ��� <document>,<header>,<footer>,<body>,<p>,<br>�� ���� tag�� �����ϰ� �ֽ��ϴ�.
- <document>�� �ֻ��� element�̰� <p>, <br> tag�� <body>�ȿ��� �����մϴ�.
- <document>�� ���� ���� tag�� </document>ó�� �������� ��ȿ�մϴ�.
- <br> tag�� ��� ���� tag���� </br>�� ���� �ص� ��ȿ �մϴ�.

-��ȿ�� xml ����
<document>
	<header>�ѱ۰� ��ǻ��</header>
	<body>
		<p>���Ŀ��ǽ� 2018</p>
		<br></br>
		<p>�����ν� ������� ���� ������ �ۼ��ϰ�</p>
		</br>
		<p>����ϰ� pc�� �ѳ���� �Է°� ������ �Ҽ� �ִ�</p>
		</br>
		<p>���Ŀ��ǽ� 2018�� ����������.</p>
	</body>
	<footer>2018-10-09</footer>
</document>

 */
package practice;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * �ùٸ� XML������ �Ǻ��ϴ� Ŭ����
 */
public class TagValidation {

	public static void main(String[] args) {
		String s = "abc<document><header>�ѱ۰� ��ǻ��</header><body><p>���Ŀ��ǽ� 2018</p><br></br><p>�����ν� ������� ���� ������ �ۼ��ϰ�</p></br><p>����ϰ� pc�� �ѳ���� �Է°� ������ �Ҽ� �ִ�</p></br><p>���Ŀ��ǽ� 2018�� ����������.</p></body><footer>2018-10-09</footer></document>";
		System.out.println(isValidXml(s));
	}

	/**
	 * ���ڿ��� �־��� XML������ ��ȿ���� �˻��Ѵ�.
	 * 
	 * @param �±׿� �ؽ�Ʈ�� �̷���� XML ������ ���ڿ�
	 * 
	 * @return XML�� ��ȿ�� ����
	 */
	private static boolean isValidXml(String xmlContent) {
		StringTokenizer words = new StringTokenizer(xmlContent, "<>");

		Stack<String> tags = new Stack<String>();

		while (words.hasMoreTokens()) {
			String word = words.nextToken();
			String popTag;

			switch (word) {

			case "document":
				tags.push(word);
				break;

			case "header":
			case "footer":
			case "body":
				if (tags.contains("document")) {
					tags.push(word);
					break;
				} else
					return false;

			case "p":
				if (tags.contains("document") && tags.contains("body")) {
					tags.push(word);
					break;
				} else
					return false;

			case "br":
				if (tags.contains("document") && tags.contains("body")) {
					break;
				} else
					return false;

			case "/document":
			case "/header":
			case "/footer":
			case "/body":
			case "/p":
				if (tags.isEmpty())
					return false;
				else {
					popTag = tags.pop();

					if ((word.equals("/document")) && (!popTag.equals("document"))
							|| (word.equals("/header")) && (!popTag.equals("header"))
							|| (word.equals("/footer")) && (!popTag.equals("footer"))
							|| (word.equals("/body")) && (!popTag.equals("body"))
							|| (word.equals("/p")) && (!popTag.equals("p"))
							|| (word.equals("/br")) && (!popTag.equals("br"))) {
						return false;
					} else {
						break;
					}
				}
			}
		}
		return tags.isEmpty();
	}
}
