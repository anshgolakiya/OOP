import java.util.* ;
public class pr4 {
    public static <T> boolean searchElement(LinkedList<T> list , T element){
        return list.contains(element);
    }
    public static void main(String[] args) {
        LinkedList<Integer> rollNumvers = new LinkedList<>();
        rollNumvers.add(101);
        rollNumvers.add(102);
        rollNumvers.add(103);
        rollNumvers.add(104);

        int searchRoll = 102;
        System.out.println("Searching roll number " + searchRoll + " : " + searchElement(rollNumvers,searchRoll));
        
        LinkedList<String> names = new LinkedList<>();
        names.add("Ansh");
        names.add("Priya");
        names.add("Rahul");
        names.add("Sneha");
        String searchName = "Ansh";
        System.out.println("Searching name " + searchName + " : " + searchElement(names,searchName));
    }
}
