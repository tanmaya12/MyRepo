package hackerrank;

public class TravellingSalesman_HamiltonianCycle {

	public static void main(String[] args) {
		int n = 4; // for nuber of cities
		// in between cities traveling costs
		int[][] roots = { { 0, 10, 15, 20 }, { 10, 0, 35, 25 }, { 15, 35, 0, 30 }, { 20, 25, 30, 0 } };
		boolean[] visited = new boolean[n];// visited city for non repeating
		visited[0] = true;// starting city visited always true
		int ans = Integer.MAX_VALUE;
		System.out.println(ans);
		ans = tsp(roots, visited, 0, n, 1, 0, ans);// position=0, count=1, cost =0
		System.out.println(ans);
	}

	private static int tsp(int[][] roots, boolean[] visited, int curPos, int n, int count, int cost, int ans) {

		if (count == n && roots[curPos][0] > 0) {
			ans = Math.min(ans, cost + roots[curPos][0]);
			return ans;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false && roots[curPos][i] > 0) {
				visited[i] = true;
				ans = tsp(roots, visited, i, n, count + 1, cost + roots[curPos][i], ans);
				visited[i] = false;
			}
		}
		//System.out.println(count);
		return ans;
	}

}
