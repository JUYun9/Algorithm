#include <iostream>
#include <string>
using namespace std;
const int MAX = 10;

int main() {
	// 테스트 케이스의 개수
	int T;
	string data[MAX];
	int i = 0;
	cin >> T;
	
	// 테스트 케이스 개수만큼 문자열 입력
	while (T > 0) {
		cin >> data[i];
		T--;
		i++;
	}

	int k = 0;
	for (int k = 0; k < i; k++) {
		int len = data[k].length();
		cout << data[k].at(0) << data[k].at(len-1) << endl;
	}
	return 0;
}
