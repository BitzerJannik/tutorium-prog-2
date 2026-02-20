#include "filter.h"
#include <ctype.h>

void filter_and_replace(char *str, char special_char) {
    for (int i = 0; str[i] !='\0'; i++ ) {
        if (isdigit(str[i])) {
            str[i] = special_char;
        } else if (islower(str[i])) {
            str[i] = toupper(str[i]);
        } else if (isupper(str[i])) {
            str[i] = tolower(str[i]);
        }
    }
}