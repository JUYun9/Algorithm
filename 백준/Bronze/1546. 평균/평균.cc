#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int N;
	cin >> N;
	
	int score;
	vector<double> data;
	for (int i = 0; i < N; i++) {
		cin >> score;
		data.push_back(score);
	}

	sort(data.begin(), data.end());

	int end_index = data.size() - 1;
	int max = data[end_index];

	for (int i = 0; i < N; i++)
		data[i] = data[i] / max * 100;


	double sum = 0.0;
	for (int i = 0; i < N; i++)
		sum += data[i];

	cout << sum / N << endl;
	return 0;
}