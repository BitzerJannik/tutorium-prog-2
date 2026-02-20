#ifndef PRUEFUNGSAMT_H
#define PRUEFUNGSAMT_H

#include "student.h"
#include <map>
#include <vector>

class Pruefungsamt {
    private:
        std::map<int, Student> pruefungen;
    
    public:
        bool anmelden(const Student& student);
        bool abmelden(int maktrikelNum);
        bool pruefen(int matrikelNum) const;
        void ausgeben() const;
        std::vector<Student> dateiEinlesen(const std::string& dateiname);
};

#endif  // PRUEFUNGSAMT_H