/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Magnit
 */
public class Word {

    private int wordID;
    private String wordAZ;
    private String wordEN;

    public int getWordID() {
        return wordID;
    }

    public void setWordID(int wordID) {
        this.wordID = wordID;
    }

    public String getWordAZ() {
        return wordAZ;
    }

    public void setWordAZ(String wordAZ) {
        this.wordAZ = wordAZ;
    }

    public String getWordEN() {
        return wordEN;
    }

    public void setWordEN(String wordEN) {
        this.wordEN = wordEN;
    }

    @Override
    public String toString() {
        return "Word{" + "wordID=" + wordID + ", wordAZ=" + wordAZ + ", wordEN=" + wordEN + '}';
    }

}
