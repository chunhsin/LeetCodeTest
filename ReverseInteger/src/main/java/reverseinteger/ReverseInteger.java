package reverseinteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * @author jamesliao
 * @since 2017/1/23
 */
public class ReverseInteger {

    public int reverse(int x) {

        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE)
            return 0;
        int processInt = x;
        int MAX_SIZE = 10;
        boolean isNegative = false;
        if (processInt < 0) {
            isNegative = true;
            processInt = x * (-1);
        }

        Stack<Integer> integerStack = new Stack<>();
        while (processInt > 9) {
            int pushValue = processInt % 10;
            integerStack.push(pushValue);
            if(integerStack.size() == MAX_SIZE && pushValue > 2)
                return 0;
            else if(integerStack.size() > MAX_SIZE)
                return 0;
            processInt /= 10;
        }
        integerStack.push(processInt);

        long value = 0;
        long carry = 1;
        while (!integerStack.isEmpty()) {
            int current = integerStack.pop();
            value += (current * carry);
            if (value > Integer.MAX_VALUE)
                return 0;
            carry *= 10;
        }
        if (isNegative)
            value *= -1;
        return (int) value;

    }

}
