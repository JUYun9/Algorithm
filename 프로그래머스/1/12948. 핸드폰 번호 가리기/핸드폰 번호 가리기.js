function solution(phone_number) {
    var answer = '';
    
    const size = phone_number.length;
    for (var i = 0; i < size; i++) {
        if (i < size-4)
            answer += "*";
        else answer += phone_number[i];
    }
    
    return answer;
}