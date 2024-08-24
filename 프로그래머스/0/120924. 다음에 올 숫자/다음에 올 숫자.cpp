#include <string>
#include <vector>

using namespace std;

int solution(vector<int> common) {
    int answer = 0;
    for (int i = 0; i < common.size() - 1; i++) {
        int x;
        // 등비수열
        if (common[i+1] * common[i+1] == common[i] * common[i+2] && common[i] != 0) {
            
            x = common[i+1] / common[i];
            answer = common[common.size()-1] * x;
            return answer;
        }
        // 등차수열
        else {
            x = common[i + 1] - common[i];
            answer = common[common.size()-1] + x;
            return answer;
        }
    }
}