package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Author;
import org.example.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("sample1");
        book.setPrice(1000.00);
        book.setPublicationYear(2024);

        Book book2 = new Book();
        book2.setTitle("sample2");
        book2.setPrice(2000.00);
        book2.setPublicationYear(2023);


        Book book3 = new Book();
        book3.setTitle("sample3");
        book3.setPrice(3000.00);
        book3.setPublicationYear(2009);

        Book book4 = new Book();
        book4.setTitle("sample4");
        book4.setPrice(500.00);
        book4.setPublicationYear(2005);

        Book book5 = new Book();
        book5.setTitle("sample5");
        book5.setPrice(100.00);
        book5.setPublicationYear(2000);

        List<Book> bookList=new ArrayList<>();
        bookList.add(book);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);



        Author author = new Author();
        author.setName("Saman");
        author.setCountry("Sri Lanka");
        author.setBookList(bookList);

        Author author1 = new Author();
        author1.setName("Saman");
        author1.setCountry("india");
        author1.setBookList(bookList);

        book.setAuthor(author);
        book2.setAuthor(author);
        book3.setAuthor(author);
        book4.setAuthor(author1);
        book5.setAuthor(author1);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        session.save(author1);
//        session.save(book5);

//        List<Book> yearsAfter2010 = session.createQuery("from Book b where b.publicationYear > :year", Book.class)
//                .setParameter("year", 2010)
//                .getResultList();
//
//        for (Book b : yearsAfter2010) {
//            System.out.println(b.getId());
//        }

//        String authername="Saman";
//        int i = session.createQuery("update Book b set b.price=b.price* 1.1 where b.author.name=:name")
//                .setParameter("name", authername)
//                .executeUpdate();



        //deleteAuthor(1);

//        Object singleResult = session.createQuery("select avg(b.price) from Book b")
//                .getSingleResult();
//
//        System.out.println(singleResult);

//        List<Object[]> authorBookCount = session.createQuery("select a,count(b) from Author a join a.bookList b group by a")
//                .getResultList();
//
//        for (Object[] authorBook : authorBookCount) {
//            Author author2 = (Author) authorBook[0];
//            Long bookCount = (Long) authorBook[1];
//
//            System.out.println(author2.getName());
//            System.out.println(bookCount);
//        }

//        String country = "Sri Lanka";
//        List<Book> booksFrom = session.createQuery("from Book b where b.author.country = :country", Book.class)
//                .setParameter("country", country)
//                .getResultList();


//        Double avgBookCount = (Double) session.createQuery("select avg(size(a.bookList)) from Author a")
//                .getSingleResult();
//
//        List<Author> Authors = session.createQuery("from Author a where size(a.bookList) > :avgCount")
//                .setParameter("avgCount", avgBookCount)
//                .getResultList();

        //System.out.println(Authors);



        transaction.commit();
        session.close();
    }
}