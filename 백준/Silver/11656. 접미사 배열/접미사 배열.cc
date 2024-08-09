#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
const int MAX = 1000;

int main() {
	string S;
	getline(cin, S);

	// 접미사를 text배열에 저장
	string text[MAX];
	int k = 0;
	for (int i = 0; i < S.length(); i++) 
		text[k++] = S.substr(i, S.length() - i);

	// 오름차순으로 정렬
	sort(text, text + k);

	// 출력
	for (int i = 0; i < k; i++)
		cout << text[i] << endl;
	return 0;
}