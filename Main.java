import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Application running..........");

        String input = "";

        while(!input.equals("q")){
            System.out.println("Enter q to quit or enter input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
//            int x =Integer.parseInt(input);
//            System.out.println(x);
            lexicalAnalyzer( input );

        }
        System.out.println("Application quiting..........");



    }

    private static void lexicalAnalyzer(String input) {
        int checkOther = 0;
//        System.out.println(input);
        if( isitInteger(input)){
            checkOther++;
            System.out.println(input + " is Integer variable");
        }  if (isitSortInt(input)){
            checkOther++;
            System.out.println(input + " is a sort Integer");
        }  if (isitLongInt(input)){
            checkOther++;
        System.out.println(input + " is a Long Integer");
        }  if (isitConstantInteger(input)){
            checkOther++;
            System.out.println(input + " is a Constant Integer");
        }  if (isitKeyword(input)){
            checkOther++;
            System.out.println(input + " is a Keyword");
        } if(checkOther == 0) {
            System.out.println(input + " is Undefined or invalid");
        }
//        System.out.println(checkOther);


    }

    private static boolean isitKeyword(String input) {
//        System.out.println("testing..");
        if(input.equals("1") || input.equals( "12") || input.equals( "123") || input.equals( "1234") || input.equals( "12345") || input.equals( "123456") || input.equals( "1234567" ) || input.equals( "12345678") || input.equals( "123456789") ){
//            System.out.println("testing..2");
            return true;
        }
        return false;
    }

    private static boolean isitConstantInteger(String input) {
        int ones = 0, twos = 0, threes = 0, fours = 0, fives = 0, sixs = 0, sevens = 0, eights = 0,nines = 0;
        for (int i = 0; i <input.length(); i++) {
//            System.out.println(input.charAt(i));
            if(input.charAt(i) == '1'){
                ones++;
            } else if (input.charAt(i) == '2') {
                twos++;
            }else if (input.charAt(i) == '3') {
                threes++;
            }
            else if (input.charAt(i) == '4') {
                fours++;
            }
            else if (input.charAt(i) == '5') {
                fives++;
            }
            else if (input.charAt(i) == '6') {
                sixs++;
            }
            else if (input.charAt(i) == '7') {
                sevens++;
            }else if (input.charAt(i) == '8') {
                eights++;
            }
            else if (input.charAt(i) == '9') {
                nines++;
            }
        }
        if(input.length() == ones || input.length() == twos || input.length() == ones || input.length() == twos || input.length() == threes || input.length() == fours || input.length() == fives || input.length() == sixs || input.length() == sevens || input.length() == eights || input.length() == nines){
            return true;
        }
        return false;
    }

    private static boolean isitLongInt(String input) {
        if(input.charAt(0)=='1'){
            try{
                int input_int = Integer.parseInt(input);
                if(input.length()>4){
                    return true;
                }
            }catch (Exception e){
                return false;
            }
        }


        return false;
    }

    private static boolean isitSortInt(String input) {
        if(input.charAt(0)=='1') {
            try {
                int input_int = Integer.parseInt(input);
                if (input.length() <= 4) {
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }

        return false;
    }

    private static boolean isitInteger(String input) {

        char input_char = Character.toLowerCase(input.charAt(0));

        if(input_char == 'i' ||  input_char == 'j' || input_char == 'k' ||
                input_char == 'l' || input_char == 'm' || input_char == 'n'){
            return true;
        }
        return false;
    }
}