import java.util.* ;
public class Checkvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enetr a character :");
        char ch = sc.next().charAt(0) ;
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            }
        else if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
            System.out.println(ch + " is Consonant");
        }
        else {
            System.out.println("Invalid Input! plaese enter an alphabetic character.");
        }
        sc.close();
    }
}