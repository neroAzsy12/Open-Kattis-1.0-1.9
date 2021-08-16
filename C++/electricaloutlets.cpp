#include <iostream>
using namespace std;

int main() {
    int tests;   // num of test cases
    cin >> tests;

    for(int t = 0; t < tests; t++) {
        int n;  // num of power strips
        cin >> n;

        int max = 0;
        for(int i = 1; i < n; i++) {
            int tmp;    // the num of outlets in the power strip
            cin >> tmp;
            max += tmp - 1;
        }

        cin >> n;
        max += n; 

        cout << max << endl;
    }
}