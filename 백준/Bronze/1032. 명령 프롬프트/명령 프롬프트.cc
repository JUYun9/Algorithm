#include <iostream>
#include <string>
using namespace std;
const int MAX = 51;

int main() {
	string data[MAX];
	int N;
	cin >> N;
	
	for (int i = 0; i < N; i++)
		cin >> data[i];

	// data[0] = config.sys
	// data[1] = config.inf
	// data[2] = configures
	
	// data[0]을 기준으로 잡는다 
	for (int i = 0; i < data[0].size(); i++) {
		// data[0]과 이후에 입력된 data[1], data[2] ....을 비교
		for (int j = 1; j < N; j++) {
			if (data[0][i] != data[j][i]) {
				data[0][i] = '?';
				break;
			}
		}
	}
	
	for (int i = 0; i < data[0].size(); i++)
		cout << data[0][i];
	cout << endl;
}