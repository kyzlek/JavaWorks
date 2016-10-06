/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.itis;


public class Punctuation implements Token{
    private int start;
    private int end;
    private String type;
    private String content;

    public Punctuation(int start, int end, String type, String content) {
        this.start = start;
        this.end = end;
        this.type = type;
        this.content = content;
    }

    @Override
    public int getStart() {
        return this.start;
    }

    @Override
    public int getEnd() {
        return this.end;
    }

    @Override
    public String getType() {
        return " -" + this.type;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    public String toString() {
        return " Start= " + this.start+ " End= " + this.end;
    }


}
