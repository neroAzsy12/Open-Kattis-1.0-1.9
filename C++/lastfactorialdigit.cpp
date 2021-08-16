#include <iostream>
using namespace std;

int main() {
    int t;  // num of test cases
    cin >> t;

    for(int i = 0; i < t; i++) {
        int product = 1;
        int n;  // the num that you will find the factorial for
        cin >> n;

        // calculate n!
        for(int j = 1; j <= n; j++) {
            product *= j;
        }

        // use mod 10 to get the last digit of the product of n!
        cout << product % 10 << endl;
    }
}