import java.util.ArrayList;
import java.util.Scanner;

public interface IParking {
    //打印输出结果
    public void print();
    //检查是否有对应的停车位
    //如果没有空车位，请返回false，否则将该车停入车位并返回true
    public boolean addCar(int carType);
    //解析命令行输入的参数（格式），如文档描述
    public static IParams parse() throws Exception{  //这个方法不必重写，直接接口名.方法名调用
        //解析字符串，获得b,m,s的值
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入车库容量，以及要进入车库的车类型以及数量。格式为[[1,1,0],[1],[2],[3],[1]]");
        String s1 = scn.next();
        String s2 = "";
        int big = -1;
        int medium = -1;
        int small = -1;
        int i =0;
        char ch;
        //-----------------------
        while (i<s1.length()){	  //exp表达式未扫描完时循环
            ch=s1.charAt(i);
            if ((ch!='[') && (ch!=']') && (ch!=',')){
                s2 += ch;
            }

            switch (i){
                case 2:big=(int)ch;
                   break;
                case 4:medium=(int)ch;
                    break;
                case 6:small=(int)ch;
                    break;
            }
            i++;				//继续处理其他字符
        }
        //------------------------
        return new IParams() {
            public void aaaa(){};
            @Override
            public int getBig() {
                return 0;
            }

            @Override
            public int getMedium() {
                return 0;
            }

            @Override
            public int getSmall() {
                return 0;
            }

            @Override
            public ArrayList<Integer> getPlanParking() {
                return null;
            }
        };
    };
}
