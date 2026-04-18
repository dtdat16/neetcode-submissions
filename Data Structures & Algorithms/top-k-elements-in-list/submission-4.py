class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        frequent_dict : dict[int, int] = {};

        for num in nums:
            frequent_dict[num] = frequent_dict.get(num, 0) + 1;
            
        sorted_dict = dict(sorted(frequent_dict.items(), key=lambda item: item[1], reverse= True))

        keys = list(sorted_dict.keys())

        return keys[0:k]
        