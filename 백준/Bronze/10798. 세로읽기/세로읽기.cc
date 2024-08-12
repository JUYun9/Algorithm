#include <iostream>
#include <string>
using namespace std;
int main() {
    string arr[5];
    for (int i = 0; i < 5; ++i)
        cin >> arr[i];
    
    // 세로로 읽기 위해 사용됨
    for (int i = 0; i < 15; ++i) {
        // 각 문자열을 위에서 아래로 읽기 위해 사용됨
        for (int j = 0; j < 5; ++j)
            // 현재 위치에서 문자열에 출력할
            // 글자가 있는지 확인
            if (arr[j].length() > i)
                cout << arr[j][i];
    }
}