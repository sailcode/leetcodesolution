package leetcode_solution.solution;

import java.util.ArrayList;
import java.util.List;

public class Problem_118 {
	public static void main(String[] args) {
		int a = 5;
		Problem_118 p = new Problem_118();
		p.generate(5);
		System.out.println();
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			if (i == 0) {
				row.add(1);
			}else {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						row.add(1);
					}else{
						row.add(result.get(i-1).get(j) + result.get(i - 1).get(j - 1));
					}
				}
			}
			result.add(row);
		}
		return result;
	}
}
