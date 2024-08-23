#include <iostream>
#include <string>
using namespace std;

int recursion(const string& s, int l, int r, int &count) {
    count++;
    if (l >= r)
        return 1;
    else if (s[l] != s[r])
        return 0;
    else
        return recursion(s, l + 1, r - 1, count);
}

int isPalindrome(const string& s, int &count) {
    return recursion(s, 0, s.length() - 1, count);
}

int main() {
    int T;
    cin >> T;
    string s;
    for (int i = 0; i < T; i++) {
        cin >> s;
        int count = 0;
        int pdrome = isPalindrome(s, count);
        cout << pdrome << " " << count << endl;
    }
    return 0;
}

