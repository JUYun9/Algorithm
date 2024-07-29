#include <iostream>
#include <string>
using namespace std;
const int MAX = 100;

int main() {
	int N;
	cin >> N;   // 숫자의 개수
	
	string str;
	cin >> str;

	int sum = 0;
	for (int i = 0; i < N; i++)
		sum += str.at(i) - '0';

	cout << sum << endl;
	return 0;
}