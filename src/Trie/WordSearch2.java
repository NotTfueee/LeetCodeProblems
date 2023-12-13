package Trie;

//File Created by -- > anuragbhatt
//Created On -- > 05/12/23,Tuesday

import java.util.ArrayList;
import java.util.List;

public class WordSearch2 {

    public static void main(String[] args) {

    }

    /*
    we will create a node class that will have an array of nodes and the length of this node array will be 26 representing the
    english alphabet letters from 0 to 25 and if and index is not null means we have the character in our array of nodes corresponding
    to that index for example 0 -> A , 1 -> B and so on

    and the second property of node class will be that it will not be a boolean isEnding which denoted that the word has ended
    but the property string str which will store the word itself we will explain this why later

     */
    public static class Node {
        Node[] children;
        String str;

        // this is a constructor meaning that whenever we will create an object the object will always be initialized as this
        Node() {
            children = new Node[26];
        }
    }

    public static List<String> findWord(char[][]board , String[] words)
    {
        // we've created a root from the node class of type node
        Node root = new Node();

        // now we will insert all the words from the words array onto our trie data structure
        for(String s : words)
        {
            insert(s , root);
        }

        // for backtracking we use a boolean array which checks if the cell is marked as true means that the cell was previously visited
        boolean[][] visited = new boolean[board.length][board[0].length];


        var ans = new ArrayList<String>();

        // now we will traverse through the board
        for(int i = 0 ; i < board.length ; ++i)
        {
            for(int j = 0 ; j < board[i].length ; ++j)
            {
                /*
                we will check for each char in board if any word starting from the current cell that represents a letter is present
                in the trie tree or not if yes we will find the word using the nodes str property if it is not null that means we have
                found a word and we will store it in our ans arraylist for each letter we will be passing its corresponding node array
                to check for further matching words and for backtracking a boolean visited array
                 */
                dfs(board , i , j , visited , root , ans);
            }
        }

        return ans;
    }


    public static void dfs(char[][] board , int startRow , int startCol , boolean[][] visited , Node root , ArrayList<String> ans)
    {
        /*
        base case for recursion as we have not implemented the calls smartly i will implement the base cases smartly

        if we move out the board we will return to the caller , if we have already visited an cell we wont revisit it
        if the root does not have the cell (letter present ) in it we return

         */
        if(startRow < 0 || startCol < 0 || startRow >= board.length || startCol >= board[0].length || visited[startRow][startCol] || root.children[board[startRow][startCol] - 'a'] == null)
            return;

        Node curr = root.children[board[startRow][startCol] - 'a'];

        /*
        when to add data to our ans arraylist when we have found a node class whose str property is not null which means that
        this is an end of a complete word present in the string array of words

        now we do not want to add the same word again and again in our array list so after adding the word to the ans
        we will mark the nodes str property as null
         */
        if(curr.str != null)
        {
            ans.add(curr.str);
            curr.str = null;
        }

        visited[startRow][startCol] = true;

        dfs(board , startRow - 1, startCol , visited , curr , ans);
        dfs(board , startRow , startCol + 1 , visited , curr , ans);
        dfs(board , startRow + 1, startCol , visited , curr , ans);
        dfs(board , startRow  , startCol -1 , visited , curr , ans);

        visited[startRow][startCol] = false;

    }

    public static void insert(String word , Node root)
    {
        // we place a pointer to the actual root of the trie data structure which is very similar to a tree
        Node curr = root;

        for(int i = 0 ; i < word.length() ; ++i)
        {
            // now we will place the first letter onto the trie
            char ch = word.charAt(i);

            /*
            we will first check if the roots nodes array is null if yes means that there is no words starting from the current letter
            if no means a word starting from this letter already exists in the trie meaning we do not want to insert it
            and move onto the next character
             */

            if(curr.children[ch-'a'] == null)curr.children[ch-'a'] = new Node();

            curr = curr.children[ch-'a'];
        }

        /*
        now after the word has been inserted in the tree (trie tree) and now the curr pointer will be on the last letter of the word
        we will store the whole word on the node class str property
         */
    }

}
