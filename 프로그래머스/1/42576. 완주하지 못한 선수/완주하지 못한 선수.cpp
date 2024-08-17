#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    // 정렬
    sort(participant.begin(), participant.end());
    sort(completion.begin(), completion.end());

    // 하나씩 비교하여 다른 것을 찾음
    for (int i = 0; i < completion.size(); i++) {
        if (participant[i] != completion[i]) {
            return participant[i];  // 다른 이름이 발견되면 바로 반환
        }
    }
    
     return participant.back();
}
