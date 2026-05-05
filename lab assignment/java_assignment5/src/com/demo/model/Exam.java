package com.demo.model;

public class Exam {

    private int examId;
    private String examName;
    private String topic;
    private String examDate;

    private Question questions[];

    public Exam(int examId,
            String examName,
            String topic,
            String examDate,
            Question questions[]) {

        this.examId=examId;
        this.examName=examName;
        this.topic=topic;
        this.examDate=examDate;
        this.questions=questions;
    }

    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }

    public String getTopic() {
        return topic;
    }

    public String getExamDate() {
        return examDate;
    }

    public Question[] getQuestions() {
        return questions;
    }

}