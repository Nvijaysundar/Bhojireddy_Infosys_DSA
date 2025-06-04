import java.util.*;

class Edge{
	int u,v,w;
	Edge(int u,int v, int w)
	{
		this.u = u;
		this.v = v;
		this.w = w;
	}
}
public class DijkstraALgo {
	static class Result{
		List<Integer> path;
		int cost;
		Result(List<Integer> path,int cost)
		{
			this.path = path;
			this.cost = cost;
		}
	}
	static Result DpShortestpath(List<Edge> edges,int start,int end)
	{
		Set<Integer> nodeset = new HashSet();	
		for(Edge edge : edges)
		{
			nodeset.add(edge.u);
			nodeset.add(edge.v);
		}
		//(1:Inf,2,3,4,5,6,7,8)
		Map<Integer,Integer> dist = new HashMap<>();
		Map<Integer,Integer> parent = new HashMap<>();
		for(Integer node:nodeset)
		{
			dist.put(node,Integer.MAX_VALUE);
		}
		dist.put(start, 0);
		
		for(Edge edge : edges)
		{
			if(dist.get(edge.u) != Integer.MAX_VALUE 
					&&
				dist.get(edge.u)+edge.w <dist.get(edge.v))
			{
				dist.put(edge.v,dist.get(edge.u)+edge.w);
				parent.put(edge.v,edge.u);
			}
		}
		List<Integer> path = new ArrayList<>();
		int cost = dist.get(end);
		while(end!=start)
		{
			path.add(end);
			end = parent.get(end);
		}
		path.add(start);
		Collections.reverse(path);
		return new Result(path,cost);
	}
	public static void main(String[] args) {
		List<Edge> edges = Arrays.asList(
				new Edge(1,2,2),
				new Edge(1,3,3),
				new Edge(1,4,4),
				new Edge(2,5,100),
				new Edge(3,6,50),
				new Edge(4,7,2),
				new Edge(5,8,7),
				new Edge(6,8,25),
				new Edge(7,8,7)
				);
		Result r = DpShortestpath(edges,1,8);
		System.out.println(r.path.toString());
		System.out.println(r.cost);
		
	}
}
