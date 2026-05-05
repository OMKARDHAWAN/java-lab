package com.demo.services;

import java.util.Scanner;

import com.demo.model.Exam;
import com.demo.model.Question;

public class Examservice {

    private Exam javaExam;
    private Exam htmlExam;


    public Examservice() {

        createJavaExam();
        createHtmlExam();
    }


    private void createJavaExam() {

        Question q[]=new Question[5];

        q[0]=new Question(
                1,
                "Java is a ?",
                "Programming Language",
                "Database",
                "Browser",
                "OS",
                1,
                1
                );

        q[1]=new Question(
                2,
                "JVM stands for?",
                "Java Virtual Machine",
                "Java Variable Method",
                "Joint VM",
                "None",
                1,
                1
                );

        q[2]=new Question(
                3,
                "Which keyword is used for inheritance?",
                "extends",
                "implements",
                "import",
                "super",
                1,
                1
                );

        q[3]=new Question(
                4,
                "Array index starts from?",
                "1",
                "0",
                "-1",
                "2",
                2,
                1
                );

        q[4]=new Question(
                5,
                "Java supports OOP?",
                "Yes",
                "No",
                "Partial",
                "None",
                1,
                1
                );

        javaExam=
                new Exam(
                        101,
                        "Java Test",
                        "Core Java",
                        "20-04-2026",
                        q
                        );
    }



    private void createHtmlExam() {

        Question q[]=new Question[5];

        q[0]=new Question(
                1,
                "HTML stands for?",
                "Hyper Text Markup Language",
                "High Text Machine Language",
                "Home Tool Markup",
                "None",
                1,
                1
                );

        q[1]=new Question(
                2,
                "Tag for line break?",
                "<p>",
                "<br>",
                "<hr>",
                "<h1>",
                2,
                1
                );

        q[2]=new Question(
                3,
                "Tag for table row?",
                "<tr>",
                "<td>",
                "<table>",
                "<th>",
                1,
                1
                );

        q[3]=new Question(
                4,
                "HTML is?",
                "Programming Language",
                "Markup Language",
                "Database",
                "Compiler",
                2,
                1
                );

        q[4]=new Question(
                5,
                "Tag for hyperlink?",
                "<link>",
                "<a>",
                "<href>",
                "<url>",
                2,
                1
                );

        htmlExam=
                new Exam(
                        102,
                        "HTML Test",
                        "HTML Basics",
                        "20-04-2026",
                        q
                        );
    }



    public void startExam(Scanner sc,int choice) {

        Exam selectedExam=null;

        if(choice==1)
            selectedExam=javaExam;

        else if(choice==2)
            selectedExam=htmlExam;

        else
        {
            System.out.println(
                    "Invalid Choice");
            return;
        }

        int score=0;

        System.out.println(
                "\nStarting "+
                 selectedExam.getExamName());

        Question q[]=
                selectedExam.getQuestions();

        for(int i=0;i<q.length;i++)
        {
            q[i].displayQuestion();

            System.out.println(
                    "Enter Answer:");
            int userAns=
                    sc.nextInt();

            if(userAns==
               q[i].getAnswer())
            {
                score=
                 score+
                 q[i].getMarks();
            }
        }

        System.out.println(
                "\nYour Marks : "
                +score);

        if(score>=3)
        {
            System.out.println(
             "Congratulations You Completed The Test");
        }
        else
        {
            System.out.println(
             "Better Luck Next Time");
        }

    }

}