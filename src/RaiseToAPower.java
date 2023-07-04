import java.math.BigInteger;
import java.util.ArrayList;

public class RaiseToAPower {
    private ArrayList<Integer> list;
    BigInteger calculatedNumber;

    RaiseToAPower(ArrayList<Integer> addedList) {
        list = addedList;
    }

    public BigInteger getCalculatedNumber() {
        raisingToAPower(list);
        return calculatedNumber;
    }

    private BigInteger raisingToAPower(ArrayList<Integer> listWithNumbers) {
        calculatedNumber = BigInteger.valueOf(listWithNumbers.get(0));

        for (int i = 1; i < listWithNumbers.size(); i++) {
            calculatedNumber = calculatedNumber.pow(listWithNumbers.get(i));
        }
        return calculatedNumber;
    }
}
