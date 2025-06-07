function solution(n) {
    let answer = 0;
    
    let stack = [];
    while (n > 0) {
        stack.push(n%3);
        n = Math.floor(n/3);
    }
    
    // stack = [0, 0, 2, 1];
    for (let i = 0; i < stack.length; i++)
        console.log(stack[i]);
    
    let power = 1;
    for (let i = stack.length-1; i >= 0; i--) {
        answer += stack[i] * power;
        power *= 3;
    }
    
    return answer;
}