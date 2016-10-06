/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis;

import java.util.List;

/**
 *
 * @author Kyzlek_pc
 */
public interface Tokenizer {
    //Метод ананлиза текста
    //Возвращает массив токенов
    List parse(String text);
}
