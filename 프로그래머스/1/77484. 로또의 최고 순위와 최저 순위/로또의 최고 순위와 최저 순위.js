function solution(lottos, win_nums) {
    const answer = [];
    
    let zeroCount = 0, matchCount = 0;
    for (let i = 0; i < lottos.length; i++) {
        const target = lottos[i];
        if (target === 0) {
            zeroCount++;
            continue;
        }
        
        for (let j = 0; j < win_nums.length; j++) {
            if (target === win_nums[j]) {
                matchCount++;
                break;
            }
        }
    }
    
    answer.push(getGrade(matchCount+zeroCount));
    answer.push(getGrade(matchCount));
    
    return answer;
}

function getGrade(num) {
    if (num === 6)
        return 1;
    else if (num === 5)
        return 2;
    else if (num === 4)
        return 3;
    else if (num === 3)
        return 4;
    else if (num === 2)
        return 5;
    else return 6;
}