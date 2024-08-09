#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
const int MAX = 20000;  // N의 최대값에 맞춰 배열 크기 조정

int main() {
    int N;
    cin >> N;

    string text[MAX];
    // 단어를 text 배열에 저장
    for (int i = 0; i < N; i++)
        cin >> text[i];
    
    // 길이 짧은 순으로 정렬, 길이가 같을 때는 사전 순으로 정렬
    sort(text, text + N, [](const string &a, const string &b) {
        if (a.length() == b.length())
            return a < b;
        return a.length() < b.length();
    });

    // 중복된 단어 제거 및 출력
    cout << text[0] << endl;
    for (int i = 1; i < N; i++) {
        if (text[i] != text[i - 1]) {
            cout << text[i] << endl;
        }
    }

    return 0;
}
