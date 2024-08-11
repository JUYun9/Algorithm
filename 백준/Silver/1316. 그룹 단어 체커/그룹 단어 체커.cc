#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
const int MAX = 100;

int main() {
	int N;
	cin >> N;
	
	int count = 0;
	string text;
	string texts[MAX];
	while (N > 0) {
		int k = 0;
		cin >> text;
		texts[k++] = text[0];

		// 중복을 제거한 문자를 texts 배열에 저장
		for (int i = 0; i < text.length() - 1; i++) {
			if (text[i] != text[i + 1])
				texts[k++] = text[i + 1];
		}

		// texts 배열의 인덱스들을 확인하면서
		// 중복된 문자가 있는지 확인하기
		// 그러기 위해 먼저 정렬한다
		// 여기선 오름차순으로 한다(내림차순도 상관x)
		sort(texts, texts + k);

		for (int i = 0; i < k - 1; i++) {
			if (texts[i] == texts[i + 1]) {
				count--;
				break;
			}
		}
		count++;
		N--;
	}
	cout << count << endl;
	return 0;
}