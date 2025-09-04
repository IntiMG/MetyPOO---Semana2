package run;

import models.Author;
import models.Book;

public class Main {
    public static void main(String[] args) {
        Author rubenDario = new Author("Ruben Dario");
        Author miguelCervantes= new Author("Miguel de Cervantes");

        Book azul = new Book("Azul", rubenDario);
        Book quijote = new Book("Don Quijote de la Mancha", miguelCervantes);

        System.out.println(azul.getTitle() + " fue escrito por: " + azul.getAuthor().getName());
        System.out.println(quijote.getTitle() +  " fue escrito por: " + quijote.getAuthor().getName());
    }
}
