import java.util.*;
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentance = sc.nextLine();
        sentance = sentance.toLowerCase();
        String[] words = sentance.split("\\s+");
        HashMap<String,Integer> wordCount = new HashMap<>();
        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word) +1);
            }
            else{
                wordCount.put(word,1);
            }
        }
        System.out.println("\nWord Frequencies : ");
        for(Map.Entry<String,Integer>entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        sc.close();
    }
}
