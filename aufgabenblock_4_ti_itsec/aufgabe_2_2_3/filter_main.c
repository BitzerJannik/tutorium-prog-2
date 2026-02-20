#include <stdio.h>
#include <string.h>
#include "filter.h"

#define MAX_BUFFER 1000

int main () { 
    char buffer[MAX_BUFFER];
    char special_char;

    // get special char
    printf("Enter a special char: ");
    scanf("%c", &special_char);
    getchar();

    // get string
    printf("Enter a String: ");
    fgets(buffer, MAX_BUFFER, stdin);
    buffer[strcspn(buffer, "\n")] = '\0';

    printf("Original string: %s\n", buffer);

    filter_and_replace(buffer, special_char);

    printf("Modifiyed String: %s\n", buffer);
    return 0;
}