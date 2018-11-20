/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytips.model;

import java.util.ArrayList;
import javax.persistence.Entity;
/**
 *
 * @author mmohamud
 */

@Entity
@Table(name = "BookTip")
public class BookTip {
    private int id;
    private String author;    
    private String title;
    private String ISBN;
    private String summary;
    private String comment;
    //private ArrayList<String> tags;
    //private ArrayList<String> prerequisiteCourses;
    //private ArrayList<String> relatedCourses;

    
    public BookTip(int id, String author, String title, String ISBN, String summary, String comment) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.summary = summary;
        this.comment = comment;
        //this.tags = tags;
        //this.prerequisiteCourses = prerequisiteCourses;
        //this.relatedCourses = relatedCourses;
    }

    public BookTip() {
    }   
    
    public int getId() {
        return id;
    }
   
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public void setName(String Name) {
        this.title = title;
    }

    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

//    public ArrayList<String> getTags() {
//        return tags;
//    }
//    
//    public void addTag(String tag) {
//        this.tags.add(tag);
//    }
//    
//    public ArrayList<String> getPrerequisiteCourses() {
//        return prerequisiteCourses;
//    }
//    
//   public void addPreliminaryKnowledge(String knowledge) {
//       this.prerequisiteCourses.add(knowledge);
//   }
//
//    public ArrayList<String> getRelatedCourses() {
//        return relatedCourses;
//    }
//   
//   public void addRelatedCourse(String courseName) {
//       this.relatedCourses.add(courseName);
//   }
}