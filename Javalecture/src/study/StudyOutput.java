package study;

import java.time.LocalDate;

public class StudyOutput {
	public static void main(String[] args) throws Exception {
		//コンソールにString型を定義して標準出力
		greeting();
		
		//コンソールに1〜10まで足した結果
		plusten();
		
		//コンソールに3年後の今日の曜日を表示
		threeYearsAgo();
				
		//コンソールに真偽値を表示
		bool(args[0]);
		
		
		//同僚とコミュニケーションを取ってみる
		Communication comm = new WorkplaceCommunication(true);
		System.out.println(comm.greet("Hello",false));
	}
	
	public static void greeting() {
		String greeting = "HelloWorld";
		System.out.println(greeting);
	}
	public static void plusten() {
		int total = 0;
		for (int i=0; i<=10; i++) {
			total += i;
		}
		System.out.println(total);
	}
	public static void threeYearsAgo() {
		LocalDate now = LocalDate.now();
		LocalDate threeYearsAgo = now.plusYears(3);
		String dayOfWeek = threeYearsAgo.getDayOfWeek().name();
		System.out.println(dayOfWeek);
	}
	public static void bool(String bool) {
		boolean onOff = false;
		if ("1".equals(bool)) {
			onOff = true;
		}
		
		if(onOff) {
			System.out.println("真");
		}else {
			System.out.println("偽");
		}
	}
	
}
