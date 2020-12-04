class VariableTest4 {
    public static void main(String[] args) {
        //1.编码情况1：
        long l = 123123; 
        System.out.println(l);
        //编译失败：过大的整数
        //long l1 = 78979879789789798789;
        long l1 = 123456879456129l;


        //**************** */
        //编译失败
        //float f1 = 12.3;

        //2.编码情况：
        //整型常量，默认类型
        byte b = 12;
        //编译失败，byte b1 = b +1;
        int b1 = b + 1;
        System.out.println(b1);
        //编译失败，float f1 = b + 12.3;
        float f1 = 12.3f;
        float f2 = 12.3f + b;
        System.out.println(f1);
        System.out.println(f2);
        String str = "123456";
        System.out.println(str);
        int num1 = Integer.parseInt(str);
        System.out.println(num1);
    }    

}