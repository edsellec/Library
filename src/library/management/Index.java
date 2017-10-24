/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Index {
    
    public void signup(String idNumber, String pass) throws IOException {
        String user = idNumber+".txt";
        USER_FILE_NAME = "C:\\Library\\Users\\"+user;
        
        File temp = new File(USER_FILE_NAME);
        if (!temp.exists()){
            File file = new File(USER_FILE_NAME);
            file.createNewFile();
            try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(pass);
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    
    public void history_borrow(String book, String idNumber) throws IOException {
        String user = idNumber+"_history.txt";
        USER_FILE_NAME = "C:\\Library\\Users\\History\\"+user;
        
        DateTimeFormatter date_time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File temp = new File(USER_FILE_NAME);
        if (temp.exists()){
            try(FileWriter fw = new FileWriter(USER_FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(idNumber);
                out.print(";");
                out.print(book);
                out.print(";");
                out.print("borrowed");
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        else {
            temp.createNewFile();
            try(FileWriter fw = new FileWriter(temp, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(idNumber);
                out.print(";");
                out.print(book);
                out.print(";");
                out.print("borrowed");
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    
    public void history_return(String book, String idNumber) throws IOException {
        String user = idNumber+"_history.txt";
        USER_FILE_NAME = "C:\\Library\\Users\\History\\"+user;
        
        DateTimeFormatter date_time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File temp = new File(USER_FILE_NAME);
        if (temp.exists()){
            try(FileWriter fw = new FileWriter(USER_FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(idNumber);
                out.print(";");
                out.print(book);
                out.print(";");
                out.print("returned");
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        else {
            temp.createNewFile();
            try(FileWriter fw = new FileWriter(temp, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(idNumber);
                out.print(";");
                out.print(book);
                out.print(";");
                out.print("returned");
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    
    public void storebook(String book, String author) throws IOException {
        File temp = new File(LIB_FILE_NAME);
        if (temp.exists()){
            try(FileWriter fw = new FileWriter(LIB_FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(book);
                out.print(";");
                out.print(author);
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        else {
            temp.createNewFile();
            try(FileWriter fw = new FileWriter(temp, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(book);
                out.print(";");
                out.print(author);
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        Index text = new Index();
        try {
            text.logHistory("Administrator added "+book+" to library");
        } catch (IOException ex) {
            Logger.getLogger(login_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void logHistory(String condition) throws IOException {
        DateTimeFormatter date_time = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        File log = new File(FILE_NAME);
        if (log.exists()){
            try(FileWriter fw = new FileWriter(log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(condition);
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        else {
            log.createNewFile();
            try(FileWriter fw = new FileWriter(log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(date_time.format(now));
                out.print(";");
                out.print(condition);
                out.print(";");
                out.println();
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
    
    public String checkpass(String file, String pass) throws IOException {
        String filePass = "";
        String readLine = null;
        FileReader reader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(reader);
        Index.Student student = new Index.Student();
        while((readLine = buffReader.readLine()) != null) {
            String[] splitData = readLine.split(";");
            student.setPass(splitData[0]);
        }
        filePass = student.getPass();
        return filePass;
    }
    
    public void deleteBook(String book, String author) throws IOException {
        int location = 0;
        String temp = "";
        String bookToDelete = book+";"+author+";";
        File file = new File("C:\\Library\\library.txt");
        ArrayList<String> list;
        try (Scanner s = new Scanner(file)) {
            list = new ArrayList<String>();
            while (s.hasNextLine()){
                temp = s.nextLine();
                if (!temp.equals(bookToDelete)){
                    list.add(temp);
                }
            }
        }
        deleteFileNIO("C:\\Library\\library.txt");
        
        File log = new File("C:\\Library\\library.txt");
        log.createNewFile();
        while(location < list.size()) {
            try(FileWriter fw = new FileWriter(log, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.print(list.get(location));
                out.println();
            }
            location++;
        }
    }
    
    public static void deleteFileNIO(String filePath) throws IOException{
	Path path = Paths.get(filePath);
	Files.delete(path);
    }
    
    class Student {
        private String pass;
        private String book;
        private String author;
        
        public String getPass() {
            return pass;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
        public String getBook() {
            return book;
        }
        public void setBook(String book) {
            this.book = book;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
    }
    
    final String FILE_NAME = "C:\\Library\\index.txt";
    String USER_FILE_NAME = "C:\\Library\\Users\\users.txt";
    final String LIB_FILE_NAME = "C:\\Library\\library.txt";
    
    //For smaller files
    /**
    Note: the javadoc of Files.readAllLines says it's intended for small
    files. But its implementation uses buffering, so it's likely good
    even for fairly large files.
    */
}