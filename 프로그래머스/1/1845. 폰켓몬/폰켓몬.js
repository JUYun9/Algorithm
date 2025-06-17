function solution(nums) {
    var answer = 0;
    
    let mySet = new Set();
    for (let i = 0; i < nums.length; i++) {
        mySet.add(nums[i]);
    
        if (mySet.size == nums.length/2)
            return mySet.size;
    }
    
    return mySet.size;
}