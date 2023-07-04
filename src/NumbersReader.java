import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersReader {

    private ArrayList<Integer> numbersList = new ArrayList<>();

    public ArrayList<Integer> getNumbersList() throws IOException {
        readNumbers();
        return numbersList;
    }

    ArrayList<Integer> readNumbers() throws IOException {
        System.out.println("Please, write your numbers (6 max, zero can not be first digit) in a line:");

        try (Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            if (acceptableNumberLength(number)) {
                while (number != 0) {
                    int digit = number % 10;
                    numbersList.add(0, digit);
                    number = number/10;
                }
            }
            else if (!acceptableNumberLength(number)) {
                System.out.println("Invalid input. Please write valid number (6 max digits)");
            }
            else if (sc.nextLine().equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            else {
                System.out.println("Invalid input. Please write valid number");
                readNumbers();
            }
            return numbersList;
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input. Please write valid number");
            readNumbers();
        }
        catch (Exception e){

        }
        return null;
    }

    private boolean acceptableNumberLength(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
            if (count > 6) {
                return false;
            }
        }
        return true;
    }
}
