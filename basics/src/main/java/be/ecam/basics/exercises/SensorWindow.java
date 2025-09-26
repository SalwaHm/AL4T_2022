package be.ecam.basics.exercises;
import java.math.BigInteger;

public class SensorWindow {
    public static int average(int[] values) {
        if (values == null || values.length == 0) throw new IllegalArgumentException("values");
        BigInteger sum = BigInteger.ZERO;
        for (int v : values) {
            sum = sum.add(BigInteger.valueOf(v));
        }
        return sum.divide(BigInteger.valueOf(values.length)).intValue();
    }
}
