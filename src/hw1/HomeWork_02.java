package hw1;

//課後練習01
public class HomeWork_02 {
    public static void main(String[] args) {
        System.out.println("課後練習02");
        System.out.println();

        //請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
        System.out.println("01.計算1～1000的偶數和(2+4+6+8+…+1000)");
        int sum = 0;
        //int a = 0;
        for (int i = 1; i <= 1000 ; i++) {
            if(i % 2 == 0) {
                int a = i;
                sum += a;
            }
        }
        System.out.println("偶數和為" + sum);

        System.out.println();
        //請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
        System.out.println("02.計算1～10的連乘積(1*2*3*…*10) (用for迴圈)");
        int sum1 = 1;
        for (int i = 1; i <= 10; i++) {
            sum1 *= i; //sum1 = sum1 * i
        }
        System.out.println("連乘積為" + sum1);//3,628,800

        System.out.println();
        //請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
        System.out.println("03.計算1～10的連乘積(1*2*3*…*10) (用while迴圈)");
        int a = 1;
        int sum2 = 1;
        while (a <= 10){
            sum2 *= a; //sum2 = sum2 * a
            a++;
        }
        System.out.println("連乘積為" + sum2);

        System.out.println();
        //請設計一隻Java程式，輸出結果為以下：
        //1 4 9 16 25 36 49 64 81 100
        /*
        sum = sum + (i+b)
        1   = 0  + 0+1
        4   = 1  + 1+2
        9   = 4  + 2+3
        16  = 9  + 3+4
        25  = 16 + 4+5
        36  = 25 + 5+6
        49  = 36 + 6+7
        64  = 49 + 7+8
        81  = 64 + 8+9
        100 = 81 + 9+10
         */
        System.out.println("04.輸出結果為以下：\n" +
                "                //1 4 9 16 25 36 49 64 81 100");
        int sum3 = 0;
        for (int i = 0, b = 1; i <=9 ; i++,b++) {
            sum3 += (i+b);
            System.out.print(sum3 + "\t");
        }

        System.out.println();
        System.out.println();
        /*
        阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
        輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
         */
        System.out.println("05.輸出1-49中不論是個位數或是十位數都不為4的數字有哪些?共有幾個?");
        //4 14 24 34 40 44
        int x;
        for (int i = 1; i <= 49 ; i++) {
            if(i % 4 != 0){
              x = i;
                System.out.print(x + "\t");
            }
        }
        System.out.println();
        /*
        請設計一隻Java程式，輸出結果為以下：
        1 2 3 4 5 6 7 8 9 10
        1 2 3 4 5 6 7 8 9
        1 2 3 4 5 6 7 8
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */
        System.out.println("06.請設計一隻Java程式，輸出結果為以下：\n" +
                "        1 2 3 4 5 6 7 8 9 10\n" +
                "        1 2 3 4 5 6 7 8 9\n" +
                "        1 2 3 4 5 6 7 8\n" +
                "        1 2 3 4 5 6 7\n" +
                "        1 2 3 4 5 6\n" +
                "        1 2 3 4 5\n" +
                "        1 2 3 4\n" +
                "        1 2 3\n" +
                "        1 2\n" +
                "        1");

        System.out.println();
        /*
        請設計一隻Java程式，輸出結果為以下：
        A
        BB
        CCC
        DDDD
        EEEEE
        FFFFFF
         */
        System.out.println("07.請設計一隻Java程式，輸出結果為以下：\n" +
                "A\n" +
                "BB\n" +
                "CCC\n" +
                "DDDD\n" +
                "EEEEE\n" +
                "FFFFFF");
    }
}
