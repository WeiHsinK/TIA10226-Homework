package hw1;

//課後練習01
public class HomeWork_01 {
	public static void main(String[] args) {

		System.out.println("課後練習01");
		System.out.println();
		// 請設計一隻Java程式，計算12，6這兩個數值的和與積
		System.out.println("01.計算12，6這兩個數值的和與積:");
		int x = 12;
		int y = 6;
		int sum = x + y;
		int product = x * y;
		System.out.println("12 + 6 = " + sum);
		System.out.println("12 * 6 = " + product);

		System.out.println();
		// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		System.out.println("02.計算200顆蛋共是幾打幾顆:");
		int egg = 200;
		int dozen = 12;
		int result1 = egg / dozen;
		int result2 = egg % dozen;
		System.out.println("200顆蛋一共是" + result1 + "打又" + result2 + "顆");

		System.out.println();
		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("03.算出256559秒為多少天、多少小時、多少分與多少秒:");
		int time = 256559;
		int hour = 24;
		int minute = 60;
		int second = 60;
		int remainSecond = time % second;
		int remainMinute = (time / second) % minute;
		int remainHour = (time / second / minute) % hour;
		int day = time / second / minute / hour;
		System.out.println("256559秒為" + day + "天" + remainHour + "小時" + remainMinute + "分" + remainSecond + "秒");

		System.out.println();
		// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		System.out.println("04.設一常數3.1415(圓周率)，計算半徑為5的圓面積與圓周長:");
		final double pi = 3.1415;
		int r = 5;
		// 圓面積=半徑*半徑*pi
		// 圓周長=直徑*pi
		System.out.println("圓面積為" + (r * r * pi));
		System.out.println("圓周長為" + (r * 2 * pi));

		System.out.println();
		/*
		 * 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行 請用程式計算10年後，本金加利息共有多少錢(用複利計算，公式請自行google)
		 */
		System.out.println("05.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行\n" + "        請用程式計算10年後，本金加利息共有多少錢:");
		// 複利公式:FV期末本利和=PV期初本金*(1+R每期利率)n期數次方 x = 1500000 * (1+2%)10次方
		int PV = 1500000;
		double rate = 0.02;
		double FV = PV * (1 + rate);
		for (int i = 1; i < 10; i++) {
			FV *= (1 + rate);
		}
		System.out.println("十年後本金加利息和為:" + (int) FV);

		System.out.println();
		/*
		 * 請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5 5 + ‘5’ 5 + “5”
		 * 並請用註解各別說明答案的產生原因
		 */
		System.out.println("06.利用System.out.println()印出以下三個運算式結果：\n" + "        5 + 5\n" + "        5 + ‘5’\n"
				+ "        5 + “5”\n" + "        並請用註解各別說明答案的產生原因");
		System.out.println(5 + 5);
		// 輸出結果為10,這是由兩個int型態的運算元以算術運算子作為相加為10的運算結果
		System.out.println(5 + '5');
		// 輸出結果為58,char型態的5會經由Unicode編碼(十六進位:0x35)換算成十進位的int型態數值53
		// 再和int型態的5數值以算術運算子相加得結果為58
		System.out.println(5 + "5");
		// 輸出結果為55,由一個int型態的5和String字串的5相連接,會得到一個String字串為55的結果

	}
}
