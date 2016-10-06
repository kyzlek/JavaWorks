/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis;

import java.util.ArrayList;
import java.util.Scanner;

//СПРОСИ МАРСЕЛЯ??????????????????????????????????????????????????????????????????????????????????
public class Main {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);

        String actualLine = scanner.nextLine();
        Tokenizer tokenizer = new SimpleTokenizerImpl();
        ArrayList<Token> tokens = tokenizer.parse(actualLine);
        for (Token token : tokens){
            System.out.println(token.getContent() + token.getType() + token.toString());
        }

    }


}

