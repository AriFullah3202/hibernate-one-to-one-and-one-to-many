package com.homework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Value;
@Entity
@Table(name ="answers")
public class Answer {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int answer_id;
	   @Column
	   private String answer;
	   //@ManyToOne
	   //private Question question;
	
	   
	   
	   
	   public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	   
	
	
	   
	   
	
	
	
	// shared with primary key                 question_id
//	   @Id                                 1
//		@Column
//	   private String answer_id;
//	   @OneToOne
//	   @MapsId
//	   @JoinColumn(name = "question_id")
//	   private Question question;
//	   
	
	
	
	
	//    one to one 4th approach
		//---------------------------------
		
//	@Id
//   private String Answer_id;          Answer_id      answer   
//	@Column                                 2          java is 
//   private String answer;
//	@OneToOne(mapped by = "answer")
//	private Question question;
	
	
	//one to one 3rd approach
	//------------------------------------
//	@Id
//	 private String Answer_id;  Answer_id       answer   question_question_id
//		@Column                   2              java is        1
//	 private String answer;
//		@OneToOne
//     private Question question;
	
	
	
	
	
	             //One to one 2nd approach      
   //------------------------------------------
   //	@Id                           Answer_id     answer
//	private String Answer_id;            2           java is programming
//	@Column
//	private String answer;
//	
	
	
	
//                  One to one 1st approach
	//-------------------------------------------
//	@Id                          answer_id     answer
//	private String answer_id;        2          java is programming.
//	@Column
//	private String answer;
	

}
