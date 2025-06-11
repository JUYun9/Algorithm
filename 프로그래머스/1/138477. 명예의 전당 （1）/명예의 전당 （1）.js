function solution(k, score) {
    var answer = [];
    
    let rank = [];
    for (let i = 0; i < score.length; i++) {
        rank.push(score[i]);
        
        rank.sort((a, b) => a-b);
        if (rank.length > k)
            rank.shift();
        
        answer.push(rank[0]);
    }
    
    return answer;
}