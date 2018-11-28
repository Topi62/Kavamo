/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytips.model;

import java.util.ArrayList;

/**
 *
 * @author vseppane
 */
public interface TipManager {

    void addBookTip(BookTip readingTip);
    
    void addWebTip(WebTip readingTip);

    ArrayList<ReadingTip> getReadingTips();
    
    void printReadingTips();
}
