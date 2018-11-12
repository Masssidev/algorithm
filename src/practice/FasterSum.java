package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FasterSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; ++i) {
			String[] operands = br.readLine().split(" ");
			bw.write(Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]) + "\n");
		}
		bw.flush();
	}

}
