package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 16/01/24,Tuesday

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomizedSet {

    private HashSet<Integer> set;
    private ArrayList<Integer> list;
    private Random random;
    public RandomizedSet()
    {
        set = new HashSet<Integer>();
        list = new ArrayList<Integer>();
        random = new Random();
    }

    public boolean insert(int val)
    {
        if(set.contains(val))return false;
        else
        {
            set.add(val);
            return true;
        }
    }

    public boolean remove(int val)
    {
        if(set.contains(val))
        {
            set.remove(val);
            return true;
        }
        else return false;
    }

    public int getRandom()
    {

        list.clear();
        list.addAll(set);
        int idx = random.nextInt(list.size());
        return list.get(idx);
    }

    public static void main(String[] args)
    {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
    }
}
