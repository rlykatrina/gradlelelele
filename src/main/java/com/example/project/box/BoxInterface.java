package com.example.project.box;

import com.example.project.decoration.Decoration;
import com.example.project.sweet.Sweet;

public interface BoxInterface {
    void appendSweet(Sweet sweet);
    void removeSweet(Sweet sweet);
    void appendDecoration(Decoration decoration);
    void removeDecoration(Decoration decoration);
    double calculatePrice();
    double calculateWeight();
    double calculateVolume();
    double calculateCalories();
}
