#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
const int MAX = 100;

int main() {
	string N;
	cin >> N;

	for (int i = N.length() - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (N[j] < N[j + 1])
				swap(N[j], N[j + 1]);
		}
	}

	for (int i = 0; i < N.length(); i++)
		cout << N[i];
	cout << endl;
	return 0;
}