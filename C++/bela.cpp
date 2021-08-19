#include <iostream>
using namespace std;

// if the suit is dominant, get the value from the Dominant table
int getDomVal(char num) {
    switch (num) {
        case 'A':
            return 11;
        case 'K':
            return 4;
        case 'Q':
            return 3;
        case 'J':
            return 20;
        case 'T':
            return 10;
        case '9':
            return 14;
    }
    return 0;
}

// if the suit is non-dominant, get the value from the non-dominant table
int getNonDomVal(char num) {
    switch (num) {
        case 'A':
            return 11;
        case 'K':
            return 4;
        case 'Q':
            return 3;
        case 'J':
            return 2;
        case 'T':
            return 10;
    }
    return 0;
}

int main() {
    int hands;      // num of hands
    char trump_suit;// value of suit that is dominant (S, H, D or C)
        
    cin >> hands >> trump_suit;

    char num;       // num card of the suit
    char suit;      // the suit (S, H, D, or C)
    int sum = 0;    // num of points from the hands

    for (int i = 0; i < 4 * hands; i++) {
        cin >> num >> suit;

        if (suit == trump_suit) {   // if suit is dominant, get the value from dominant
            sum += getDomVal(num);
        } else {                    // if suit is non-dominant, get the value from non-dominant
            sum += getNonDomVal(num);
        }
    } 

    cout << sum << endl;
}