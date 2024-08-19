#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
	string line;
	// ababababa
	getline(cin, line);

	// aba
	string word;
	getline(cin, word);
	
	int count = 0;
	int start_idx = 0;
	int find_idx = line.find(word);   // 처음엔 0
	while (find_idx != -1) {
			count++;
			start_idx = find_idx + word.size();
			find_idx = line.find(word, start_idx);
	}
	cout << count << endl;
	return 0;
}