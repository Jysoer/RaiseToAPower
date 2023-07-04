import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NumbersReader numbersReader = new NumbersReader();
        RaiseToAPower raiseToAPower = new RaiseToAPower(numbersReader.getNumbersList());
        System.out.print("Exponentiation result: ");
        System.out.println(raiseToAPower.getCalculatedNumber().toString());
    }
}