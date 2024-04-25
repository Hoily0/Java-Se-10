package itheima.case03;

/**
 * 操作字符串数据的方法
 */
public class Test4 {
    public static void main(String[] args) {
        // 例如: 数组中存储了: 宁夏枸杞,黑枸杞,特级枸杞,葡萄,找出所有含有枸杞的元素打印输出
        String[] wolfBerry = {"宁夏枸杞", "黑枸杞", "特级枸杞", "葡萄"};

        for (String s : wolfBerry) {
            if (s.contains("枸杞")) {
                System.out.println(s);
            }
        }

         
        // 例如: 数组中存储了: 张三丰,张无忌,殷素素,张翠山,灭绝师太,找出所有含有姓张的元素打印输出
        String[] nameZhang = {"张三丰", "张无忌", "因张催催", "张翠山", "灭绝师太"};
        for (String n : nameZhang){
            if (n.startsWith("张")){
                System.out.println(n);
            }
        }

        // 例如: 数组中存储了多个文件名: a.java,b.java,c.jpg,d.png,e.java,找出所有java文件的文件名打印输出

        // 校验2个验证码内容是否一样
    }
}
