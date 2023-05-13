package com.example.project.mvc.services.boxService;

import com.example.project.box.Box;
import com.example.project.decoration.Decoration;
import com.example.project.sweet.ChocolateSweet;
import com.example.project.sweet.FruitSweet;
import com.example.project.sweet.Sweet;

public interface BoxService {
    void saveData();
    void readData();
    boolean checkBoxKey(Integer key);
    Box getBox(Integer key);
    void setBox(int id, String material, int price, double weight, int width, int length, int height);
    void removeBox(Integer key);
    void addSweetInBox(Sweet sweet, Integer keyBox);
    void removeSweetFromBox(Integer keyBox, Sweet keySweet);
    void addDecorationInBox(Decoration decoration, Integer keyBox);
    void removeDecorationFromBox(Integer keyBox, Decoration decorationKey);
    void getBoxes();
}
