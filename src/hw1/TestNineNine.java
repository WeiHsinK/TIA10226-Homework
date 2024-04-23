public class TestNineNine {
    //輸出九九乘法表
    public static void main(String[] args) {
        //使用for迴圈+while迴圈
        System.out.println("使用for迴圈+while迴圈製作九九乘法表:");
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            int a = 1;
            while (a <= 9){
                System.out.print(i + "*" + a + "=" + i*a + "\t");
                a++;
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        //使用for迴圈+do while迴圈
        System.out.println("使用for迴圈+do while迴圈製作九九乘法表:");
        for (int i = 1; i <= 9; i++) {
            int a = 1;
            System.out.println();
            do{
                System.out.print(i + "*" + a + "=" + i*a + "\t");
                a++;
            }while (a <= 9);
        }

        System.out.println();
        System.out.println("----------------------------------");
        //使用while迴圈+do while迴圈
        System.out.println("使用while迴圈+do while迴圈製作九九乘法表:");
        System.out.println();
        int i = 1;
        while (i <= 9){
            int a = 1;
            do{
                System.out.print(i + "*" + a + "=" + i*a + "\t");
                a++;
            }while(a <= 9);
            System.out.println();
            i++;
        }
    }
}
