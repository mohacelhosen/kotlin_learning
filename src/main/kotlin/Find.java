import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        String names[] = {"Mohacel", "Reznu", "Asadu", "Adi"};
        String input = "Mohacel";
        for(int i = 0; i<names.length; i++){
            if (names[i].equalsIgnoreCase(input)){
                System.out.println(input+" present in "+(i+1)+" th position");
            }
        }
    }
}
