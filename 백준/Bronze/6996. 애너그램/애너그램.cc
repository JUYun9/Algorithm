#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        string word1, word2;
        cin >> word1 >> word2;

        if (word1.size() != word2.size()) {
            cout << word1 << " & " << word2 << " are NOT anagrams." << endl;
            continue;
        }

        string new_word1 = word1;
        string new_word2 = word2;
        sort(new_word1.begin(), new_word1.end());
        sort(new_word2.begin(), new_word2.end());

        if (new_word1 == new_word2) {
            cout << word1 << " & " << word2 << " are anagrams." << endl;
        }
        else {
            cout << word1 << " & " << word2 << " are NOT anagrams." << endl;
        }
    }

    return 0;
}