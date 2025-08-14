package in.co.nmsworks.week1.Test;

import in.co.nmsworks.week1.day3.string.First.Candidate;

public class Runner {
    public static void main(String[] args) {
        LibraryManage stu=new LibraryManage("Java","jemes glosling",2024);
        checkOut(stu);
    }

    public static void checkOut(LibraryManage libraryManage){

        System.out.println("Title : " + libraryManage.getTitle());
        System.out.println("Author : "+ libraryManage.getAuthor());
        System.out.println("Year : "+ libraryManage.getYear());
        System.out.println("--------");

    }
}

