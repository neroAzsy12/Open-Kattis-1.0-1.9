#include <iostream>
using namespace std;

int main() {
    int N;  // N = num of times 'Abracadabra' is printed
    cin >> N;

    for(int i = 1; i <= N; i++) {
        printf("%d Abracadabra\n", i);
    }
}