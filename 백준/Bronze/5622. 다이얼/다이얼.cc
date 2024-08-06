#include <iostream>
#include <string>
using namespace std;

int main() {
	string str;
	cin >> str;

	int time_count = 0;
	for (int i = 0; i < str.length(); i++) {
		if (str[i] == 'A' || str[i] == 'B' || str[i] == 'C')
			time_count += 3;
		else if (str[i] == 'D' || str[i] == 'E' || str[i] == 'F')
			time_count += 4;
		else if (str[i] == 'G' || str[i] == 'H' || str[i] == 'I')
			time_count += 5;
		else if (str[i] == 'J' || str[i] == 'K' || str[i] == 'L')
			time_count += 6;
		else if (str[i] == 'M' || str[i] == 'N' || str[i] == 'O')
			time_count += 7;
		else if (str[i] == 'P' || str[i] == 'Q' || str[i] == 'R' || str[i] == 'S')
			time_count += 8;
		else if (str[i] == 'T' || str[i] == 'U' || str[i] == 'V')
			time_count += 9;
		else
			time_count += 10;
	}
	cout << time_count << endl;
	return 0;
}