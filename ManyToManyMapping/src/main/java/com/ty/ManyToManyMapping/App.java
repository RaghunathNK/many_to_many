package com.ty.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args)
    {
        Student student=new Student();
        Book book=new Book();
        
        List<Student> slist=new ArrayList<Student>();
        slist.add(student);
        
        List<Book> blist=new ArrayList<Book>();
        blist.add(book);
        
        student.setsId(101);
        student.setsName("RAGHU");
        student.setsPhone(14543647l);
        student.setListofBooks(blist);
        
        book.setbId(123);
        book.setbName("JAVA");
        book.setList(slist);
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Student.class);
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        
        session.save(book);
        session.save(student);
        transaction.commit();
    }
}
