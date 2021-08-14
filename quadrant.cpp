#include <iostream>
using namespace std;

int main() {
    int x;  // the x-coordinate
    int y;  // the y-coordinate

    cin >> x >> y;

    if(x > 0 && y > 0) {
        cout << 1 << endl;  // Quadrant 1
    } else if(x < 0 && y > 0) {
        cout << 2 << endl;  // Quadrant 2
    } else if(x < 0 && y < 0) {
        cout << 3 << endl;  // Quadrant 3
    } else {
        cout << 4 << endl;  // Quadrant 4
    }
}