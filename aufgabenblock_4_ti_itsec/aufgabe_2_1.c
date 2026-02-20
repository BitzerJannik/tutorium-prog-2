#include <stdio.h>

int main (int argc, char *argv[]) {
    if ( argc > 1 ) {
        for (int i = 0; i< argc; i++) {
            printf("Argument: %s\n", argv[i]);
        }
    } else {
        printf("Not enough arguments.");
    }
    return 0;
}