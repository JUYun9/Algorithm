#include <iostream>
#include <string>
using namespace std;
const int MAX = 100;

int main() {
	string line, lines[MAX];
	int n = 0;
	while (getline(cin, line)) {
		int lower_case = 0, upper_case = 0, integer = 0, space_bar = 0;
		lines[n] = line;
		for (int i = 0; i < lines[n].length(); i++) {
			// 소문자
			if (lines[n].at(i) >= 97 && lines[n].at(i) <= 122)
				lower_case++;
			// 대문자
			else if (lines[n].at(i) >= 65 && lines[n].at(i) <= 90)
				upper_case++;
			// 공백
			else if (lines[n].at(i) == 32)
				space_bar++;
			// 정수형
			else if (lines[n].at(i) >= 48 && lines[n].at(i) <= 57)
				integer++;
		}
		n++;
		cout << lower_case << " " << upper_case << " "
			<< integer << " " << space_bar << endl;
	}
	return 0;
}