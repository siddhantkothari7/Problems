### Leetcode 39

def combinationSum(candidates, target):
    ret = []
    dfs(candidates, target, [], ret)
    return ret

def dfs(candidates, target, buff, ret):
    if target < 0:
        return
    if target == 0:
        return ret.append(buff)
    for i in range(len(candidates)):
        dfs(candidates[i:], target - candidates[i], buff +[candidates[i]], ret)



candidates = [2,3,5]
target = 8

print(combinationSum(candidates, target))