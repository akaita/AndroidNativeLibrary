//
// Created by mikel on 21/08/2016.
//

#include "TimeProvider.h"
#include <ctime>

std::string TimeProvider::getTime() {
    std::time_t result = std::time(nullptr);
    return std::asctime(std::localtime(&result));
}