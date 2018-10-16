/*
 * xml 형식의 문자열을 입력받아 해당 문자열이 유효한지 검증하는 method를 작성하세요. 
 * 조건은 다음과 같습니다.
- 문자열은 <document>,<header>,<footer>,<body>,<p>,<br>과 같은 tag를 포함하고 있습니다.
- <document>가 최상위 element이고 <p>, <br> tag는 <body>안에만 존재합니다.
- <document>와 같이 열린 tag는 </document>처럼 닫혀져야 유효합니다.
- <br> tag의 경우 열린 tag없이 </br>만 존재 해도 유효 합니다.

-유효한 xml 예시
<document>
	<header>한글과 컴퓨터</header>
	<body>
		<p>한컴오피스 2018</p>
		<br></br>
		<p>음성인식 기능으로 말로 문서를 작성하고</p>
		</br>
		<p>모바일과 pc를 넘나들며 입력과 편집을 할수 있는</p>
		</br>
		<p>한컴오피스 2018을 만나보세요.</p>
	</body>
	<footer>2018-10-09</footer>
</document>

 */
package practice;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 올바른 XML형식을 판별하는 클래스
 */
public class TagValidation {

	public static void main(String[] args) {
		String s = "abc<document><header>한글과 컴퓨터</header><body><p>한컴오피스 2018</p><br></br><p>음성인식 기능으로 말로 문서를 작성하고</p></br><p>모바일과 pc를 넘나들며 입력과 편집을 할수 있는</p></br><p>한컴오피스 2018을 만나보세요.</p></body><footer>2018-10-09</footer></document>";
		System.out.println(isValidXml(s));
	}

	/**
	 * 문자열로 주어진 XML형식의 유효성을 검사한다.
	 * 
	 * @param 태그와 텍스트로 이루어진 XML 형식의 문자열
	 * 
	 * @return XML의 유효성 여부
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
