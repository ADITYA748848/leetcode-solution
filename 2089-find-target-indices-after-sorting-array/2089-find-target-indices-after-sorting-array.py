class Solution(object):
    def targetIndices(self, nums, target):
        # nums.sort()
        ans = []
        for j in range(len(nums)):

            for i in range(len(nums) - 1):
                if nums[i] > nums[i+1]: 
                    nums[i], nums[i+1] = nums[i+1], nums[i]

        for i in range(len(nums) ):
            if nums[i] == target:
                ans.append(i)
        
        return ans  