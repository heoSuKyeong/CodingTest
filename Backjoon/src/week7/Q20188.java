package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q20188 {
//등산 마니아
/*
입력 예제
3
1 2
2 3
*/	
	static List<Integer>[] tree;
	static int subTree[];	
	static boolean visited[];
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		tree = new List[n+1];	//리스트 인덱스는 0부터 시작인데, 노드번호는 1번부터 시작하기에 방 크기를 하나 크게 잡는다.
		for (int i=0; i<=n; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for (int i=0; i<n-1; i++) {	//인접리스트를 트리로 표현
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			tree[start].add(end);
			tree[end].add(start);
		}
		
		subTree = new int[n+1];		//i번째 노드를 루트노드로 하는 서브트리에 포함되는 노드의 수
		for (int i=1; i<=n; i++	 ) {
			subTree[i] = 1;
		}
		
		visited = new boolean[n+1];
		visited[1] = true;		//루트노드부터 시작
		dfs(1);
		
		long variety = 0;
		
		//2번 노드 위로 뻗어 나가는(부모로 가는) 간선 부터 마지막 노드 위로 뻗어 나가는 간선까지 순회하면 모든 간선을 고려하게 된다.
		for (int i=2; i<=n; i++) {
			int restNodeCnt = n - subTree[i];
			
			variety += nC2(n) - nC2(restNodeCnt);
		}
		System.out.println(variety);
	}
	
	//콤비네이션(조합, 경우의수) 공식
	//n^2이 int를 초과하므로 long으로 선언
	private static long nC2(int n) {
		return (long) n * (n-1) / 2;
	}
	
	//각 노드를 기준으로 본인을 루트노드로 하는 서브트리에 포함되는 노드의 수를 구한다.
	//예를들어, subTree[1]은 자신(1번), 2번, 3번 노드로 이루어져 3개의 노드의 수를 갖는다.
	private static int dfs(int index) {	//깊이 우선 탐색을 통해 루트노드부터 리프노드까지 내려가며 subTree 값을 채운다.
		
		for(Integer node : tree[index]) {
			
			if(visited[node]) {
				continue;
			}
			visited[node] = true;
			subTree[index] += dfs(node);
		}
		return subTree[index];
		
	}
	
	
}
