//You have got a range of numbers between 1 to N, where one of the number is
//repeated. You need to write a program to find out the duplicate number.

package FindDuplicate;

import java.util.List;

public class FinderOfDuplicate {

    private final List<Integer> numbers;

    public FinderOfDuplicate(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int findDuplicate() {
        if (!veryfiList()) {
            return -1;
        }
        Integer max = numbers.stream().max(Integer::compare).orElse(0);
        return getSum() - (max * (max + 1) / 2);
    }

    private boolean veryfiList() {
        if (numbers.get(0) != 1) {
            return false;
        }
        boolean condition = true;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (!((numbers.get(i + 1) - numbers.get(i)) == 1 || (numbers.get(i + 1) - numbers.get(i)) == 0)) {
                condition = false;
            }
        }
        return condition;
    }

    private int getSum() {
        return numbers.stream().reduce(0, Integer::sum);
    }
}
