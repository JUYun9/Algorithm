function solution(sizes) {
    let answer = 0;
    
    let big = 0;
    let small = 0;
    for (let i = 0; i < sizes.length; i++) {
        if (sizes[i][0] > sizes[i][1]) {
            if (big < sizes[i][0])
                big = sizes[i][0];
            if (small < sizes[i][1])
                small = sizes[i][1];
        } else {
            if (big < sizes[i][1])
                big = sizes[i][1];
            if (small < sizes[i][0])
                small = sizes[i][0];
        }
    }
    
    return big*small;
}