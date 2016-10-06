/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis;

/**
 *
 * @author Kyzlek_pc
 */
public interface Token {
    int getStart();
    int getEnd();
    String getType();
    String getContent();

}
