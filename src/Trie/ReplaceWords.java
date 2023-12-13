package Trie;

//File Created by -- > anuragbhatt
//Created On -- > 09/12/23,Saturday

import java.util.ArrayList;
import java.util.List;

public class ReplaceWords {

    public static void main(String[] args) {

        var dictionary = new ArrayList<String>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        System.out.println(replaceWords(dictionary , "the cattle was rattled by the battery"));
    }

    public static class Node
    {
        Node[] children;
        boolean isEnding;

        Node()
        {
            children = new Node[26];
        }
    }

    public static void insert(String word , Node root)
    {
        Node curr = root;

        for(int i = 0 ; i < word.length() ; ++i)
        {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null)curr.children[ch-'a'] = new Node();

            curr = curr.children[ch-'a'];
        }

        curr.isEnding = true;
    }


    public static String startWith(String word , Node root)
    {
        Node curr = root;
        StringBuilder pre = new StringBuilder();

        for(int i = 0 ; i < word.length() ; ++i)
        {
            char ch = word.charAt(i);
            if(curr.children[ch-'a'] == null)return null;
            pre.append(ch);
            if(curr.children[ch-'a'].isEnding)return pre.toString();
            curr = curr.children[ch-'a'];
        }

        return word;
    }

    public static String replaceWords(List<String> dictionary , String sentence)
    {
        Node root = new Node();

        for(String word : dictionary)
        {
            insert(word , root);
        }

        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words)
        {
            String pre = startWith(word , root);

            if(pre != null)ans.append(pre).append(" ");
            else ans.append(word).append(" ");
        }

        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }

}
