#include "student.h"

Student::Student(
    std::string name,
    std::string birthday,
    int matrikel_num,
    std::string course,
    std::string ex_regulation,
    int semester
) {
    this->name = name;
    this->birthday = birthday;
    this->matrikel_num = matrikel_num;
    this->course = course;
    this->ex_regulation = ex_regulation;
    this->semester = semester;
}

std::string Student::getName() const {
    return this->name;
}

std::string Student::getBirthday () const {
    return this->birthday;
}

int Student::getMatrikelNum() const {
    return this->matrikel_num;
}

std::string Student::getCourse() const {
    return this->course;
}

std::string Student::getExRegulation () const {
    return this->ex_regulation;
}

int Student::getSemester() const {
    return this->semester;
}

void Student::setName( const std::string& name ) {
    this->name = name;
}

void Student::setBirthday(const std::string& birthday) {
    this->birthday = birthday;
}

void Student::setMatrikelNum(const int matrikel_num ) {
    this->matrikel_num = matrikel_num;
}

void Student::setCourse(const std::string& course) {
    this->course = course;
}

void Student:: setExRegulation(const std::string& ex_regulation) {
    this->ex_regulation = ex_regulation;
}

void Student::setSemester(const int semester) {
    this->semester = semester;
}