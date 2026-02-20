#include <stdio.h>

// Your Code
// func-name: formatted_output()
void formatted_output (char *first_name, char *last_name, int matrikel, int semester, double ects) {
    printf("Student         : %s %s\n", first_name, last_name);
    printf("Matrikel-Nummer : %d\n", matrikel);
    printf("Semester        : %d\n", semester);
    printf("ECTS            : %.2f\n", ects);
}


int main () {
    char fist_name[50] = "Max";
    char last_name[50] = "Mustermann";
    int matrikel_nr = 14434;
    int semester = 20;
    double ects = 33.33;

    // here goes the func-call
    formatted_output(fist_name, last_name, matrikel_nr, semester, ects);

    return 0;
}