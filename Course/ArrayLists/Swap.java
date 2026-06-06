import java.util.*;

public class Swap 
{
    static void swap(ArrayList<Integer> list, int i1, int i2)
    {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println(list);
        swap(list, i1, i2);
        System.out.println(list);
        sc.close();
    }    
}
