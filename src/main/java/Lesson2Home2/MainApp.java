package Lesson2Home2;

public class MainApp {
    public static void main(String[] args){
        int a = 5;
        int b = 9;
        if (a + b > 10 && a + b <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        isPositiveOrNegative(5);
        Comparison(3);
        System.out.println(Comparison(3));
        printWord("februar", 4);
    }
    public static void isPositiveOrNegative(int x){
        if (x > -1){
            System.out.println("Число - положительное ");
        }else{
            System.out.println("Число отрицательное ");
        }
    }
    public static boolean Comparison(int x){
        if (x > -1){
            return true;
        } return false;
    }
    public static void printWord(String Word, int x){
        for (int i = 0; i < x; i ++){
            System.out.print(Word + "  ");
        }
    }
}
