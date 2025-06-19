function solution(dartResult) {
    let answer = 0;
    const prevNum = [];
    let arrIndex = 0;

    for (let i = 0; i < dartResult.length; i++) {
        let c = dartResult[i];

        // 숫자인 경우
        if (!isNaN(c)) {
            let currentNum = Number(c);
            // 10 처리
            if (currentNum === 1 && dartResult[i + 1] === '0') {
                currentNum = 10;
                i++; // '0'도 소모
            }
            prevNum[arrIndex++] = currentNum;
        } 
        else if (c === 'D') {
            prevNum[arrIndex - 1] = prevNum[arrIndex - 1] ** 2;
        } 
        else if (c === 'T') {
            prevNum[arrIndex - 1] = prevNum[arrIndex - 1] ** 3;
        } 
        else if (c === '*') {
            prevNum[arrIndex - 1] *= 2;
            if (arrIndex - 2 >= 0)
                prevNum[arrIndex - 2] *= 2;
        } 
        else if (c === '#') {
            prevNum[arrIndex - 1] *= -1;
        }
    }

    // 합산
    for (let i = 0; i < 3; i++)
        answer += prevNum[i];

    return answer;
}
