import java.util.LinkedList;
import java.util.List;
public class CustomSorter {
    static LinkedList<Integer> list = new LinkedList();
    public static List<Integer> add(int number){
        list.add(number);
        return list;
    }
    public static void byGrowth(){
        for (int i = list.size()-1; i >= 0; i--){
            for (int j = i-1; j >= 0; j--){
                if(list.get(i) < list.get(j)){
                    int temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        System.out.println(list);
    }
    public static void descendingOrder(){
        for (int i = list.size()-1; i >= 0; i--){
            for (int j = i-1; j >= 0; j--){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        System.out.println(list);
    }
}
