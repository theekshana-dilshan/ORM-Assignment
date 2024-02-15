Assignments:
1) List<Book> yearsAfter2010 = session.createQuery("from Book b where b.publicationYear > :year", Book.class)
.setParameter("year", 2010)
.getResultList();

2) String authername="Saman";
   int i = session.createQuery("update Book b set b.price=b.price* 1.1 where b.author.name=:name")
   .setParameter("name", authername)
   .executeUpdate();

3) private static void deleteAuthor(long authorId){
   Session session = FactoryConfiguration.getInstance().getSession();
   Author author = session.find(Author.class, authorId);
   session.delete(author);
   }

4) object singleResult = session.createQuery("select avg(b.price) from Book b")
   .getSingleResult();

5) List<Object[]> authorBookCount = session.createQuery("select a,count(b) from Author a join a.bookList b group by a")
   .getResultList();

6) String country = "Sri Lanka";
   List<Book> booksFrom = session.createQuery("from Book b where b.author.country = :country", Book.class)
   .setParameter("country", country)
   .getResultList();

7)  already defines the bidirectional relationship

8) Double avgBookCount = (Double) session.createQuery("select avg(size(a.bookList)) from Author a")
   .getSingleResult();

   List<Author> Authors = session.createQuery("from Author a where size(a.bookList) > :avgCount")
   .setParameter("avgCount", avgBookCount)
   .getResultList();

        
