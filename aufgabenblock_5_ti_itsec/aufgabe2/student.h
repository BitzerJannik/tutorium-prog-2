#ifndef STUDENT_H
#define STUDENT_H

#include <string>
#include <iostream>

class Student {
    private:
        std::string name;
        std::string birthday;
        int matrikel_num;
        std::string course;
        std::string ex_regulation;
        int semester;
    
    public:
        Student() = default;

        Student(
            std::string name,
            std::string birthday,
            int matrikel_num,
            std::string course,
            std::string ex_regulation,
            int semester
        );

        std::string getName() const;
        std::string getBirthday() const;
        int getMatrikelNum() const;
        std::string getCourse() const;
        std::string getExRegulation() const;
        int getSemester() const;

        void setName(const std::string& name);
        void setBirthday(const std::string& birthday);
        void setMatrikelNum(const int matrikel_num);
        void setCourse(const std::string& course);
        void setExRegulation(const std::string& ex_regulation);
        void setSemester(const int semester);
};

#endif // STUDENT_H