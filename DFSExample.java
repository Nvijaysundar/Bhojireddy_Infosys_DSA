import java.util.*;

public class DFSExample {
	public static void main(String[] args) {
		Map<Integer,List<Integer>> graph  = new HashMap<>();
		graph.put(1,Arrays.asList(2,4));
		graph.put(2, Arrays.asList(1,3));
		graph.put(3, Arrays.asList(2));
		graph.put(4, Arrays.asList(1,5,7));
		graph.put(5, Arrays.asList(4,6));
		graph.put(6, Arrays.asList(5,7));
		graph.put(7, Arrays.asList(4,6));
		dfs(graph,1);
	}
	static void dfs(Map<Integer,List<Integer>> graph,int start)
	{
		Set<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		while(!stack.isEmpty())
		{
			int curr = stack.pop();
			if(!visited.contains(curr)) {
				visited.add(curr);
				System.out.print(curr+" ");
			}
			for(int child : graph.getOrDefault(curr,new ArrayList<>()))
			{
				if(!visited.contains(child))
					stack.push(child);
			}	
		}
	}
}

