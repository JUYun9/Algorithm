#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int X, Y;
	cin >> X >> Y;

	// reverse 함수 쓸 수 있게 문자열로 변환
	string strX = to_string(X);
	string strY = to_string(Y);

	// X,Y를 역순으로 변경
	reverse(strX.begin(), strX.end());
	reverse(strY.begin(), strY.end());

	// 더해야 되니까 다시 정수형으로
	X = stoi(strX);
	Y = stoi(strY);
	
	int sum = X + Y;
	string str_sum = to_string(sum);
	reverse(str_sum.begin(), str_sum.end());
	int result = stoi(str_sum);

	cout << result << endl;
	return 0;
}