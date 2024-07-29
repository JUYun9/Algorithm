#include <iostream>
using namespace std;

int main() {
	string S, result;
	int i;
	cin >> S >> i;

	
	for (int k = 0; k < i; k++)
		result = S[i - 1];

	cout << result << endl;
	return 0;
}
