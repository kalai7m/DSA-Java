package Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static String replaceWords(List<String> dictionary, String sentence) {
        Triee node = new Triee();
        for(String word: dictionary) {
            node.insert(word);
        }
        StringBuilder result = new StringBuilder();
        String []  input = sentence.split(" ");
        for(String i: input){
            result.append(node.search(i));
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("rat");
        dictionary.add("bat");
        String sentence  = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }
}
class Triee {

    class Node {
        Node links[] = new Node[26];
        boolean flag = false;
        boolean containsKey(char ch) {
            return links[ch-'a'] != null;
        }
        void put(char ch, Node node){
            links[ch-'a'] = node;
        }
        Node get(char ch) {
            return links[ch-'a'];
        }
        void setEnd() {
            flag = true;
        }
        boolean isEnd() {
            return flag;
        }
    }
    private Node root;
    public Triee() {
        root = new Node();
    }
    void insert(String word){
        Node node = root;
        for(char i: word.toCharArray()) {
            if(!node.containsKey(i)){
                node.put(i, new Node());
            }
            node = node.get(i);
        }
        node.setEnd();
    }
    String search(String word) {
        Node node = root;
        int j=0;
        for(char i: word.toCharArray()) {
            j++;
            if(!node.containsKey(i)){
                return word;
            } else if(node.get(i).isEnd()){
                return word.substring(0,j);
            }else{
                node = node.get(i);
            }
        }
        return word;
    }

}
