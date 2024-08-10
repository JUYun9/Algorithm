#include <iostream>
#include <string>
using namespace std;

int main() {
	string data;
	int k = 0;
	cin >> data;
	while (data != "0") {
		int i = 0;
		for (; i < data.length() / 2; i++) {
			if (data[i] != data[data.length() - 1 - i]) {
				cout << "no" << endl;
				break;
			}
		}

		// 반복문이 끝까지 실행된 경우
		if (i == data.length() / 2)
			cout << "yes" << endl;
		cin >> data;
	}
	return 0;
}