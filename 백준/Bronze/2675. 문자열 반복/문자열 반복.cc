#include <iostream>
#include <string>
using namespace std;

int main() {
	// 테스트 케이스의 개수
	int T;
	cin >> T;
	
	// R번 반복, 문자열 S를
	int R;
	string S;
	for (int i = 0; i < T; i++) {
		cin >> R >> S;
		for (int j = 0; j < S.length(); j++) {
			for (int k = 0; k < R; k++)
				cout << S[j];
		}
		cout << endl;
	}
	return 0;
}