import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfreqElements {
	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3,4,4,4,4};
		int k = 2;
		List<Integer> top = topKelements(nums,k);
		System.out.println(top.toString());
	}
	static List<Integer> topKelements(int []nums,int k)
	{
		Map<Integer,Integer> freq = new HashMap<>();
		for(int num:nums)
		{
			freq.put(num,freq.getOrDefault(num,0)+1);
		}
//		System.out.println(freq.toString());
		//{1:3,2:2,3:1,4:4}
		//[(4,4),1:3,2:2,3:1]
		List<Map.Entry<Integer, Integer>> entryList = 
					new ArrayList<>(freq.entrySet());
		System.out.println(entryList.toString());
		entryList.sort((e1,e2)->
						e2.getValue().compareTo(e1.getValue()));
		System.out.println(entryList.toString());
		List<Integer> result = new ArrayList<>();
		for(int i=0;i<k&&i<entryList.size();i++)
		{
			result.add(entryList.get(i).getKey());
		}
		return result;
	}
}	
