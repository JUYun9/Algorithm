function solution(arr, divisor) {
    var answer = [];
    
    for (var i = 0; i < arr.length; i++) {
        if (arr[i]%divisor == 0)
            answer.push(arr[i]);
    }
    
    if (answer.length == 0)
        answer.push(-1);
    
    // sort(): 정렬할 때 배열의 요소를 문자열로 취급한다.
    answer.sort((a,b) => a-b);
    
    return answer;
}

/*
지난번에 공부한 내용
1. var = 자바에서 배열, 스택, 큐처럼 사용 가능
2. 그래서 크기를 미리 정해주지 않아도 된다.
*/