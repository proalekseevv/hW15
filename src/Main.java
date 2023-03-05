public class Main {
        public static void main(String[] args) {
           Author author1 = new Author("Андрей" , "Бурунов") ;
           Author author2 = new Author("Алексей" , "Масляков") ;


           System.out.println("author.name = " + author1.getName());
           System.out.println("author.lastnames = " +  author1.getLastnames());

           System.out.println("author1.name = " + author2.getName());
           System.out.println("author.lastnames = " +  author2.getLastnames());


           Book book1 = new Book("Тихий дом","Бурунов", 1997);
           Book book2 = new Book("Шумный дом","Масляков", 1997);


           System.out.println("book.title = " + book1.getTitle());
           System.out.println("book.author = " + book1.getAuthor());
           System.out.println("book.year = " + book1.getYear());

           System.out.println("book.title = " + book2.getTitle());
           System.out.println("book.author = " + book2.getAuthor());
           System.out.println("book.year = " + book2.getYear());
           book2.setYear(2000);
           System.out.println("book2.getYear() = " + book2.getYear());

        }







}