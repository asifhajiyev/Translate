/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmanager;

import dbconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Word;

/**
 *
 * @author Magnit
 */
public class WordDatabaseManager {

    public int addWord(Word word) {
        String sql = "insert into word values (word_id.nextval,?,?)";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, word.getWordAZ());
            ps.setString(2, word.getWordEN());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int updateWord(Word word) {
        String sql = "update word set word_az=?,word_en=? where word_id=?";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, word.getWordAZ());
            ps.setString(2, word.getWordEN());
            ps.setInt(3, word.getWordID());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int deleteWord(int id) {
        String sql = "delete from word where word_id=?";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Word> allWords() {
        List<Word> list = new ArrayList<>();
        String sql = "select * from word order by word_en";
        Connection conn = DatabaseConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Word word = new Word();
                word.setWordID(result.getInt("word_id"));
                word.setWordAZ(result.getString("word_az"));
                word.setWordEN(result.getString("word_en"));
                list.add(word);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Word getWordById(int id) {
        String sql = "select * from word where word_id=?";
        Connection conn = DatabaseConnection.getConnection();
        Word word = new Word();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                word.setWordID(result.getInt("word_id"));
                word.setWordAZ(result.getString("word_az"));
                word.setWordEN(result.getString("word_en"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return word;
    }
    public ArrayList<Word> getWord_EN(String value) {
        String sql = "select * from word where word_az='" + value + "'";
        Connection conn = DatabaseConnection.getConnection();
        ArrayList<Word> translation = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Word word = new Word();
                word.setWordEN(result.getString("word_en"));
                translation.add(word);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return translation;
    }
    public ArrayList<Word> getWord_AZ(String value) {
        String sql = "select * from word where word_en='" + value + "'";
        Connection conn = DatabaseConnection.getConnection();
        ArrayList<Word> translation = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet result = ps.executeQuery();
            while (result.next()) {
                Word word = new Word();
                word.setWordAZ(result.getString("word_az"));
                translation.add(word);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WordDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return translation;
    }
    
    public DefaultTableModel getModel() {
        String columnNames[] = {"ID", "ENGLISH", "AZERBAIJANI"};
        DefaultTableModel tableModel = new DefaultTableModel(null, columnNames);
        List<Word> list = allWords();
        for (Word word : list) {
            tableModel.addRow(new Object[]{word.getWordID(), word.getWordEN(), word.getWordAZ()});
        }
        return tableModel;
    }
}
