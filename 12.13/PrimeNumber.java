import java.lang.Math;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean flag = true;
        long start = System.currentTimeMillis();
        int count = 0;
        lable:for (int i = 2; i <= 100000; i++) {
            for(int j=2;j<=Math.sqrt(i) ;j++){
                if(i % j == 0){
                    flag = false;
                    break lable;
                }
            }
            if(flag == true){
                //System.out.println(i);
                count++;
            }
            flag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数个数为：" + count);
        System.out.println("所花费时间为" + (end - start));
    }
}
//花费时间
//j<i:15889
//j<i,break:2476
//j<sqrt:986
//j<sqrt,break:844