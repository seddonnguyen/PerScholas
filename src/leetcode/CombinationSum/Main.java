package leetcode.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @Param Integer target
     * @Param List<Integer> candidates
     * @Return List<List < Integer>>
     * LeetCode 39. Combination Sum
     * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
     */
    static Target getCombinationSum = target -> candidates -> {
        List<List<Integer>> result = new ArrayList<>();

        DFS dfs = new DFS() {
            @Override
            public void calculate(Integer index, List<Integer> combination, Integer total) {
                if (total.equals(target)) {
                    result.add(new ArrayList<>(combination));
                    return;
                }

                if (total > target || index >= candidates.size()) { return; }

                var newCombination = new ArrayList<>(combination);
                newCombination.add(candidates.get(index));

                calculate(index, newCombination, total + candidates.get(index));
                calculate(index + 1, combination, total);
            }
        };

        dfs.calculate(0, new ArrayList<>(), 0);
        return result;
    };

    public static void main(String[] args) {
        CombinationSum combinationSum = getCombinationSum.getTarget(7);
        var result = combinationSum.calculate(new ArrayList<>(List.of(2, 3, 6, 7)));
        System.out.println(result);
    }
}