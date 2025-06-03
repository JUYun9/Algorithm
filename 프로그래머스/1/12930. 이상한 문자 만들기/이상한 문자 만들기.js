function solution(s) {
    let answer = '';
    
    let index = 0;
    for (let i = 0; i < s.length; i++) {
        let c = s[i];
        if (c == ' ') {
            answer += ' ';
            index = 0;
        } else {
            if (index%2 == 1)
                answer += c.toLowerCase();
            else
                answer += c.toUpperCase();
            
            index++;
        }
    }
    
    return answer;
}