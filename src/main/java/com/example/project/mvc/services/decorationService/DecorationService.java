package com.example.project.mvc.services.decorationService;

import com.example.project.decoration.Decoration;

public interface DecorationService {
    void saveData();
    void readData();
    boolean checkDecorationKey(Integer key);
    Decoration getDecoration(Integer key);
    void setDecoration(int id, String colour, String pattern, int price, double weight);
    void removeDecoration(Integer key);
    void getDecorations();
}
