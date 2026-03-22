//using Collection HashMap
//Interview: Here I need grouping based on some derived property.
//Since I need to group multiple values under a common identity, I can use HashMap.
// or we can say: Since the problem involves grouping elements based on a derived condition, 
//I immediately thought of using a HashMap. The Key Idea is to convert each String into a normalized form - like a sorted String into - 
//so that all anagrams map to the same key. The value would be a list stroing all such grouped strings, While Inserting, 
//I would use computeIfAbsent to efficiently initialise and update the list, Finally I returned all the grouped values.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
        
    }
}
