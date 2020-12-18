/* 

三元运算符
结构：（条件表达式）？表达式1 : 表达式2
① 条件表达式结果为boolean类型
② 根据条件表达式真假，决定执行表达式1或2
③ 表达式为true，执行1；否则执行2
④ 表达式要求是一致的
⑤ 三运算符是可以嵌套的

*/

class SanYuanTest {
    public static void main(String[] args) {
        int m = 12;
        int n = 5;

        int max = (m>n)?m:n;
        System.out.println(max);

        String maxStr = (m>n)?"m大":((m==n)?"m和n相等":"n大");
        System.out.println(maxStr);

        int n1 = 3, n2 = 4 , n3 = 7;
        int max1 = (n1 > n2)?n1 : n2;
        int max2 = (max1 > n3)? max1 : n3;
        System.out.println("最大值是："+ max2);

    }
}