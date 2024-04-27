import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // string array saxlayın. İstifadəçidən 1 char daxil etməsini istəyin.
        // onun daxil etdiyi char-ı string array-də hansı dəyərlərdə varsa
        // onları çapa çıxarın. və həmin char-ın o dəyərdə hansı index-də dayandığını çapa verin.

        String[] arr = {"emin","mahmud","gulnare"};
        Scanner sc = new Scanner(System.in);
      while(true) {
            getfor(arr, sc);
        }
    }
    public static char inputherf(Scanner sc){
        System.out.print("Bir karakter girin: ");
        return sc.next().charAt(0);
    }
    public static void getfor(String[] arr,Scanner sc){
        char txt= inputherf(sc);
        for(int i=0; i < arr.length;i++){
        for(int j=0; j< arr[i].length();j++){
            if (arr[i].charAt(j)==txt){
                System.out.println(arr[i]);
                System.out.println(j);
            }
    }
}
    }
}