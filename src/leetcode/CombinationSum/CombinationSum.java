package leetcode.CombinationSum;

import java.util.List;

@FunctionalInterface
public interface CombinationSum {
    List<List<Integer>> calculate(List<Integer> candidates);
}