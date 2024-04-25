package itheima.case09;


import java.util.ArrayList;

/*
    ArrayList应用案例

    现在假如购物车中存储了如下这些商品：Java入门,宁夏枸杞，黑枸杞，人字拖，特级枸杞，枸杞子。
    现在用户不想买枸杞了，选择了批量删除，请完成该需求。

    分析：
        后台使用ArrayList集合表示购物车，存储这些商品名。
        遍历集合中的每个数据，只要这个数据包含了“枸杞”则删除它。
        输出集合看是否已经成功删除了全部枸杞数据了。
 */
public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        System.out.println(list);
//        deleteByNameOne(list);
        deleteByNameTwo(list);


        System.out.println("list = " + list);
    }

    private static void deleteByNameTwo(ArrayList<String> list) {
        for (int i = list.size() -1; i >= 0; i--) {
            if (list.get(i).contains("枸杞")){
                list.remove(i);
            }

        }
    }

    private static void   deleteByNameOne(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("枸杞")){
                list.remove(i);
                i --;

            }
        }
    }




}


