#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
	string first, second;
	cin >> first >> second;

	// 첫번째 수 거꾸로
	for (int i = 0; i < first.length() / 2; i++)
		swap(first[i], first[first.length() - 1 - i]);

	// 두번째 수 거꾸로
	for (int i = 0; i < second.length() / 2; i++)
		swap(second[i], second[second.length() - 1 - i]);
	
	if (first > second)
		cout << first << endl;
	else if (first < second)
		cout << second << endl;
	return 0;
}