package com.homework.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name = "question")
public class Question {
	
	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int question_id;
	  
	  @Column 
	  private String question;
	  
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name = "answe_id")
	  private List<Answer> answer;

	
	  public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	 
	
//	      shared with primary key         question_id     question
//	@Id                                        1           what is your name
//	private String question_id;
//	@Column
//	private String question;
//	@OneToOne(mappedBy = "question", cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	private Answer answer;
	
	
	
	
	
	//primary key join column
	
//	@Id  
//	private String question_id;
//    @Column      
//	private String question;
//	@OneToOne
//	@JoinTable(name="answers", 
//	          joinColumns = @JoinColumn(name="answer"), 
//	          inverseJoinColumns = @JoinColumn(referencedColumnName = ""))
//	private Answer answer;

	

	// one to one 4th approach is see the Answer 
	
	
	                // one to one 3rd approach
	//------------------------------------
//	@Id
//    private String question_id;      question_id   question   A_id   
//   @Column                              1             what is  2
//	private String question;
//	@OneToOne
//	@JoinColumn(name ="A_id")
//	private Answer answer;
	
	
	
                    //one to one 2nd approach	                
//	-------------------------------------------------
//	@Id
//	private String question_id;        question_id    question     A_id
//	@Column                               1            what is?     this column changed
//	private String question;
//	@OneToOne
//	@JoinColumn(name ="A_id")
//	private Answer answer;
//	
	
//                        One to one 1st approach 	
//	-----------------------------------------------------
//	@Id
//	private String question_id;       question_id    question    answer_id
//	@Column                               1           what is?      2
//	private String question;
//	@OneToOne
//	private Answer answer;
//	Hibernate: create table Answer (answer_id varchar(255) not null, answer varchar(255), primary key (answer_id)) engine=MyISAM
//	Hibernate: create table Question (question_id varchar(255) not null, question varchar(255), answer_answer_id varchar(255), primary key (question_id)) engine=MyISAM
//	Hibernate: alter table Question add constraint FKs6ghcwuovtcp489oo5dy7rvk5 foreign key (answer_answer_id) references Answer (answer_id)

}
