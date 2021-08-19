#include <iostream>
#include <string>
using namespace std;

int main() {
    int position = 1;   // starting position of the ball
    string moves;       // contains the moves that were made 
    cin >> moves;

    for (int i = 0; i < moves.length(); i++) {
        char c = moves.at(i);

        if (position == 1 && c == 'A') {
            position = 2;
        } else if (position == 2 && c == 'A') {
            position = 1;
        } else if (position == 2 && c == 'B') {
            position = 3;
        } else if (position == 3 && c == 'B') {
            position = 2;
        } else if (position == 1 && c == 'C') {
            position = 3;
        } else if (position == 3 && c == 'C') {
            position = 1;
        }
    }
    // print the ending position the ball ends up in
    cout << position << endl;
}