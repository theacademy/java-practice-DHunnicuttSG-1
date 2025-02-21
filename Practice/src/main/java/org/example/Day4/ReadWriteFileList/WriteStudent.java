package org.example.Day4.ReadWriteFileList;

import java.io.*;
import java.util.*;

public class WriteStudent {
    public static final String DELIM = "::";

    public static void main(String[] args) throws IOException {

        Map<String, Student> mapList = new HashMap<>();

        List<Student> studentList = new ArrayList<>();
//        Student s1 = new Student("001", "Steve", "Wozniak", "C414");
//        Student s2 = new Student("002", "Ada", "Lovelace", "C414");
//        Student s3 = new Student("003", "Charles", "Babbage", "C414");
//        Student s4 = new Student("004", "Alan", "Turing", "C414");
//        Student s5 = new Student("005", "Linus", "Torvalds", "C414");

//        studentList.add(s1);
//        studentList.add(s2);
//        studentList.add(s3);
//        studentList.add(s4);
//        studentList.add(s5);

        readFile(studentList);
        writeFile(studentList);
    }

    public static void writeFile(List<Student> sl) throws IOException {
        PrintWriter out = new PrintWriter((new FileWriter("students.txt")));
        for( Student item : sl) {
            out.println(item.id + DELIM + item.firstName + DELIM + item.lastName + DELIM + item.cohort);
        }
        out.flush();
        out.close();
    }

    public static void readFile(List<Student> sl) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("students.txt")));
        while(sc.hasNextLine()){
           String currentLine = sc.nextLine();
           String[] data = currentLine.split(DELIM);
           Student studentData = new Student();
           studentData.setId(data[0]);
            studentData.setFirstName(data[1]);
            studentData.setLastName(data[2]);
            studentData.setCohort(data[3]);
            sl.add(studentData);
            //sl.put(data[0], studentData)
        }

        for(Student item : sl) {
            System.out.println(item.id + " " + item.firstName + " " + item.lastName + " " + item.cohort);
        }
    }
}
