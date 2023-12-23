package Hash_Maps;

//File Created by -- > anuragbhatt
//Created On -- > 23/12/23,Saturday

import java.util.HashSet;

public class PathCrossing {

    public static void main(String[] args) {

        System.out.println(isPathCrossing("NESWW"));
    }

    public static boolean isPathCrossing(String path)
    {
        var map = new HashSet<String>();

        int x = 0 , y = 0 ;
        map.add("0-0");
        for(int i = 0 ; i < path.length() ; ++i)
        {
            char item = path.charAt(i);

            if(item == 'N')++y;
            else if(item == 'E')++x;
            else if(item == 'W')--x;
            else --y;

            String pos = x+"-"+y;

            if(map.contains(pos))return true;
            else map.add(pos);
        }

        return false;
    }
}
