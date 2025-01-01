/**
 * @author: 姜智浩
 * @create: 2024/11/14 11:45
 */

import java.util.Scanner;

public class Ex_0 {
    public static void main(String[] args) {
        char a = 'b' + 5;
        System.out.println((int)a);
    }
}

//布尔类型学习
class bool {
    public static void main(String[] args) {
        boolean ispass = true;
        if (ispass) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

//自动类型转换01
class auto_type_change_01{
    public static void main(String[] args) {
        int a = 'w';    //char类型可以自动转换为int类型
        System.out.println(a);

        double b = 100;    //int类型可以自动转换为double类型
        System.out.println(b);
    }
}
//自动类型转换02
class auto_type_change_02{
    public static void main(String[] args) {
        float a = 5;
        int b = 4;
        System.out.println(a + b);  //float类型和int类型相加，会自动将int类型转换为float类型

        double c = 5;
        System.out.println(c + b);  //double类型和int类型相加，会自动将int类型转换为double类型

        /*这么写是不可以的，因为float类型和int类型相加，会自动将int类型转换为float类型，
        但是float类型和double类型相加，会自动将float类型转换为double类型，损失精读，会报错*/
        //int d = 3;
        //float e = 4 +1.2;
        //System.out.println(d + e);

        //上述的正确写法
        int f = 3;
        float g = 4 + 1.2f;
        System.out.println(f + g);

        byte b1 = 1;
        short s2 = 3;
        int i3 = 5;
        float f4 = 6.6f;
        double d5 = 7.5;
        System.out.println(b1 + s2 + i3 + f4 + d5);
    }
}

//强制类型转换01
class force_type_change_01{
    public static void main(String[] args) {
        int a = (int)1.9;   //强制类型转换，将double类型转换为int类型，会丢失小数部分
        System.out.println(a);  //输出1
    }
}

//字符串
class string_01{
    public static void main(String[] args) {
        int i1 = 1;
        String s1 = i1 + "";
        System.out.println(s1);  //输出1,将int类型转换为String类型

        String s2 = "5";
        int i2 = Integer.parseInt(s2);
        System.out.println(i2);  //输出5,将String类型转换为int类型
    }
}

class homework_01{
    public static void main(String[] args) {
    String title_name = "姓名";
    String title_age = "年龄";
    String title_gender = "性别";
    System.out.println(title_name + "\t" + title_age + "\t" + title_gender);

    String name = "张三";
    int age = 18;
    char gender = '男';
    System.out.println(name + "\t" + age + "\t" + gender);
    }
}

class homework_02{
    public static void main(String[] args) {
        char c1 = '\n'; //换行符
        char c2 = '\t'; //制表符
        char c3 = '\r'; //回车符

        System.out.println(c1 + "hello");
        System.out.println(c2 + "hello");
        System.out.println(c3 + "hello");
    }
}

class logic_01{
    public static void main(String[] args) {
        int age = 18;
        if(age >= 18 && age <= 60){
            System.out.println("成年");
        }
    }
}

//int 输入
class input_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = input.nextInt();
        System.out.println("您输入的整数是：" + a);
    }
}

//String 输入
class input_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入：");
        String a = input.next();
        System.out.println("您输入的是：" + a);
    }
}

//位运算
class bit_01{
    public static void main(String[] args) {
        int a = 2;  //00000000 00000000 00000000 00000010
        int b = 3;  //00000000 00000000 00000000 00000011
        System.out.println(a & b);  //按位与
        System.out.println(a | b);  //按位或
        System.out.println(a ^ b);  //按位异或
        System.out.println(~a);     //按位取反
        System.out.println(a << 1); //左移`
    }
}

class bit_02{
    public static void main(String[] args) {
        System.out.println(1 >> 2); //右移 本质 1 / 2 / 2
        System.out.println(1 << 2); //左移 本质 1 * 2 * 2
        System.out.println(1 >>> 2); //无符号右移 本质 1 / 2 / 2
    }
}

//if 练习
class homework_03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入淡季或旺季：");
        String season = input.next();
        System.out.println("请输入年龄:");
        int age = input.nextInt();

        if(season.equals("淡季")){
            if(age >= 60 || age <= 12){
                System.out.println("票价为：50元");
            }
            else if(age > 12 && age < 60){
                System.out.println("票价为：80元");
            }
            else{
                System.out.println("输入错误");
            }
        }
        else if(season.equals("旺季")){
            if(age >= 60 || age <= 12){
                System.out.println("票价为：40元");
            }
            else if(age > 12 && age < 60){
                System.out.println("票价为：100元");
            }
            else{
                System.out.println("输入错误");
            }
        }
    }
}

//数组练习
class array_01{
    public static void main(String[] args) {
        double[] arr_1 = {1.1, 2.2, 3.3, 4.4, 5.5};
        for (int i = 0; i < arr_1.length; i++) {
            System.out.println("第" + (i + 1) + "个元素为：" + arr_1[i]);
            System.out.println(arr_1.length);    //数组长度
        }
    }
}

//数组练习
class array_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr_2 = new int[5];
        for(int i = 0; i < arr_2.length; i++){
            System.out.println("请输入第" + (i + 1) + "个元素：");
            arr_2[i] = input.nextInt();
        }
        for(int i = 0; i < arr_2.length; i++){
            System.out.println("第" + (i + 1) + "个元素为：" + arr_2[i]);
        }
    }
}

class array_03{
    public static void main(String[] args) {
        int[] arr_3 = new int[5];
        System.out.println(arr_3);  //输出的是数组的地址
    }
}

class array_04{
    public static void main(String[] args) {
        int[] arr_4 = {1, 2, 3};
        int[] arr_5 = arr_4;    //数组5的地址和数组4的地址一样
        for (int j : arr_5) {
            System.out.println(j);
        }
    }
}

//数组练习
class array_05{
    public static void main(String[] args) {
        int[] arr_5 = {2, 3, 5};

        int[] arr_6 = new int[arr_5.length];
        System.arraycopy(arr_5, 0, arr_6, 0, arr_5.length); //将数组5复制到数组6中
        for (int j : arr_6) {
            System.out.println(j);
        }
    }
}
//数组扩容
class array_06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr_6 = new int[3];
        for (int i = 0; i < arr_6.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素：");
            arr_6[i] = input.nextInt();
        }
        while(true) {
            System.out.println("是否要对数组进行扩容？（y/n）");
            String s = input.next();
            if (s.equals("y")) {
                int[] arr_7 = new int[arr_6.length + 1];
                System.arraycopy(arr_6, 0, arr_7, 0, arr_6.length);
                arr_7[arr_7.length - 1] = input.nextInt();
                System.out.println("扩容后的数组为：");
                for (int j : arr_7) {
                    System.out.println(j);
                }
            }
            else if (s.equals("n")) {
                System.out.println("数组为：");
                for(int j : arr_6){
                    System.out.println(j);
                }
                break;
            }
        }
    }
}
//冒泡排序
class sort_01 {
    public static void main(String[] args) {
         int [] arr = {2, 3, 5, 1, 4};
         for( int j = 0; j < arr.length - 1; j++) {
             for (int i = 0; i < arr.length - 1; i++) {
                 if (arr[i] > arr[i + 1]) {
                     int temp = arr[i];
                     arr[i] = arr[i + 1];
                     arr[i + 1] = temp;
                 }
             }
         }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

//顺序查找
class search {
    public static void main(String[] args){
        int [] arr  = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        System.out.println("请输入要查找的数：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num){
                System.out.println("找到了，下标为：" + i);
                break;
            }
            else {
                System.out.println("未找到");
                break;
            }
        }
    }
}

//二分查找
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        System.out.println("请输入要查找的数：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = binarySearch(arr, num);
        if (result == -1) {
            System.out.println("未找到");
        } else {
            System.out.println("找到了，下标为：" + result);
        }

        input.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // 防止溢出

            if (arr[mid] == target) {
                return mid; // 找到目标元素，返回其下标
            } else if (arr[mid] < target) {
                left = mid + 1; // 目标元素在右半部分
            } else {
                right = mid - 1; // 目标元素在左半部分
            }
        }

        return -1; // 未找到目标元素，返回-1
    }
}

//二维数组
class Array_2D_01 {
    public static void main(String[] args) {
        int[][] arr_1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("二维数组：");
        for (int i = 0; i < arr_1.length; i++) { // 遍历行
            for (int j = 0; j < arr_1[i].length; j++) { // 遍历列
                System.out.print(arr_1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//二维数组动态初始化
class Array_2D_02 {
    public static void main(String[] args) {
        int[][] arr_2 = new int[3][3];

        // 赋值|将（0，0）赋值为1
        arr_2[0][0] = 1;
        /*
        其结果为
        * 二维数组：
        1 0 0
        0 0 0
        0 0 0
        * */
        // 赋值|遍历整个二维数组 将其值


        System.out.println("二维数组：");
        for (int i = 0; i < arr_2.length; i++) { // 遍历行
            for (int j = 0; j < arr_2[i].length; j++) { // 遍历列
                System.out.print(arr_2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//杨辉三角
class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++) {
                if(j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

Cat cat_1 = new Cat();
cat_1.name = "小白";
cat_1.age = 3;
cat_1.color = "白色";

//面向对象
class Cat{
    //属性
    String name;
    int age;
    String color;
    //方法
    public void eat(){
        System.out.println(cat_1.name + "正在吃饭");
    }
}

