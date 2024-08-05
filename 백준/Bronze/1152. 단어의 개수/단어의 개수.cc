#include <iostream>
#include <string>
using namespace std;

int main() {
    string line;
    getline(cin, line);

    int count = 1;
    for (int i = 0; i < line.length(); i++) {
        if (line[i] == ' ')
            count++;
    }

    if (line[0] == ' ')
        count--;

    if (line[line.length() - 1] == ' ')
        count--;

    cout << count << endl;
    return 0;
}