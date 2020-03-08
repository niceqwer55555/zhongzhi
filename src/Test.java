//import  java.io.*;
//import java.lang.*;
//import java.nio.Buffer;
//3 试用单分支结构设计一设计一判断用户输入值 x，当x大于零时求x值平方根，否则不执行任何操作的程序。
//public class Test {
//    public static void main(String[] args) throws IOException {
//        float x;
//        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader input = new BufferedReader(reader);
//        System.out.println("请输入 x:");
//        String temp = input.readLine();
//        x = Float.parseFloat(temp); //字符串转换为单精度浮点型
//        if (x > 0)
//            System.out.println(" 平方根值 " + Math.sqrt(x));
//    }
//}
//4 从键盘读入两个字符，按照字母表排序顺序，将前面的字符至于A，排后面的字符置于B，请设计实现该程序
//import java.io.*;
//public class Test{
//    public static void main(String[] args) throws IOException{
//        char A,B,c1,c2;
//        c1=(char)System.in.read();
//        c2=(char)System.in.read();
//        if(c1 > c2){
//            A=c1;
//            B=c2;
//        }else
//        {
//            A=c2;
//            B=c1;
//        }
//        System.out.println("A="+A+"B="+B);
//    }
//}
//5,用穷举法求出3位数中百，十，个位数的立方和就是该数的数。

