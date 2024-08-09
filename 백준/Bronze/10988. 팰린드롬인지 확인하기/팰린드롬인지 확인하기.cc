#include <iostream>
#include <string>
using namespace std;

int main() {
	string text;
	getline(cin, text);

	for (int i = 0; i < text.length() / 2; i++) {
		if (text[i] != text[text.length() - 1 - i]) {
			cout << 0 << endl;
			return 0;
		}
	}
	cout << 1 << endl;
	return 0;
}