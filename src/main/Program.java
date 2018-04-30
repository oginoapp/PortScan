package main;

import java.util.Collections;
import java.util.List;

public class Program {

	/**
	 * アプリケーションのエントリーポイント
	 */
	public static void main(String[] args) {
		String host = "localhost";
		int start = 0;
		int end = 1023;

		// 引数取得
		if (args != null) {
			if (args.length > 0)
				host = args[0];
			if (args.length > 1)
				start = Integer.parseInt(args[1]);
			if (args.length > 2)
				end = Integer.parseInt(args[2]);
		}

		// TCPスキャン
		PortScanner scanner = new PortScanner();

		System.out.println("start");
		List<Integer> portList = scanner.scan(host, start, end);

		Collections.sort(portList);
		for(Integer port : portList) {
			System.out.println(port + ": open");
		}
		System.out.println("done");
	}

}
