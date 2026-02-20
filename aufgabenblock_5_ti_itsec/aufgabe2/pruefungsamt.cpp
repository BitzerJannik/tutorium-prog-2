#include "pruefungsamt.h"
#include <fstream>
#include <sstream>
#include <algorithm>

bool Pruefungsamt::pruefen(int matrikelNum) const {
    return pruefungen.find(matrikelNum) != pruefungen.end();
}

bool Pruefungsamt::anmelden(const Student& student) {
    if (pruefen(student.getMatrikelNum())) {
        return false;
    }
    pruefungen.insert({ student.getMatrikelNum(), student });
    return true;
}

bool Pruefungsamt::abmelden(int matrikelNum) {
    if (!pruefen(matrikelNum)) {
        return false;
    }
    pruefungen.erase(matrikelNum);
    return true;
}

void Pruefungsamt::ausgeben() const {
    for (const auto& pair: pruefungen) {
        const Student& student = pair.second;
        std::cout << "Name: " << student.getName() 
                  << ", Matrikel-Nummer: " << student.getMatrikelNum()
                  << ", Studienfach: " << student.getCourse() << "\n";
    }
}

std::vector<Student> Pruefungsamt::dateiEinlesen(const std::string& dateiname) {
    std::vector<Student> students;
    std::ifstream file(dateiname);
    std::string line;

    while (std::getline(file, line)) {
        std::istringstream iss(line);
        std::string name, birthday, course, ex_regulation;
        int matrikelNum, semester;

        if (std::getline(iss, name, ',') &&
            std::getline(iss, birthday, ',') &&
            (iss >> matrikelNum) && iss.ignore() &&
            std::getline(iss, course, ',') &&
            std::getline(iss, ex_regulation, ',') &&
            (iss >> semester)) {
                Student student(name, birthday, matrikelNum, course, ex_regulation, semester);
                students.push_back(student);
            }
    }
    return students;
}