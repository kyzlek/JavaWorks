/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyzlek_pc
 */
public class SimpleTokenizerImpl implements Tokenizer{

    private final int WORD = 1;
    private final int PUNCTUATION = 4;
    private final int NUMBER = 2;
    private final int SPACE = 3;


    @Override
    public ArrayList parse(String text) {
        ArrayList<Token> arrayTokens = new ArrayList<>();
        //Спроси марселя почуме без инициализации метод arrayTokens.add(token); ругается?????????????????????????????????????????7
        Token token = null;
        String actualWord;
        actualWord = "";
        char[] arraySymbol = text.toCharArray();
        int start = -1;

        for(int i=0; i<arraySymbol.length; i++){
            if(arraySymbol[i] != ' ')
                actualWord = actualWord + arraySymbol[i];
            if(arraySymbol[i] == ' ' || i == arraySymbol.length-1){

                if(i ==  arraySymbol.length-1 || getCharType(arraySymbol[i-1]) == SPACE)
                    i++;
                if(getCharType(arraySymbol[i-1]) == WORD){
                    token = new Word(start+1, i-1, "WORD", actualWord);
                }
                else if(getCharType(arraySymbol[i-1]) ==  NUMBER){
                    token = new Number(start+1, i-1, "NUMBER", actualWord);
                }
                else if(getCharType(arraySymbol[i-1]) == PUNCTUATION){
                    token = new Punctuation(start+1, i-1, "PUNCTUATION", actualWord);
                }
                arrayTokens.add(token);
                actualWord ="";
                start = i;
            }
            else if(arraySymbol[i] == ' '){
                actualWord = actualWord + arraySymbol[i+1];
            }
        }
        return arrayTokens;
    }
    private int getCharType(char currentSymbol){
        if (Character.isLetter(currentSymbol)) {
            return 1;//word
        } else if (Character.isDigit(currentSymbol)) {
            return 2;//Number
        } else if (Character.isWhitespace(currentSymbol)) {
            return 3;//Space
        } else return 4;//Punctuation
    }

}
