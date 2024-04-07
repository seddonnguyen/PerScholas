package leetcode.CombinationSum;

import java.util.List;

@FunctionalInterface
public interface DFS {
    void calculate(Integer index, List<Integer> combination, Integer total);
}