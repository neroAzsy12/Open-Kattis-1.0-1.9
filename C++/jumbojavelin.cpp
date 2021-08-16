#include <iostream>
using namespace std;

int main() {
    int n;          // the number of steel rods
    cin >> n;

    int total = 0;  // will contain the total length of all the rods
    
    for (int i = 0; i < n; i++) {
        int l;      // the length of the rod
        cin >> l;
        total += (l - 1);   // add to length but remove 1, since combining rods loses 1 cm of total length
    }

    // increment total by 1, to get the correct combined length
    cout << total + 1 << endl;
}