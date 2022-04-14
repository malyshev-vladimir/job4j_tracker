package ru.job4j.pojo;

public class Library {
    public static void outputToConsole(Book[] arrayOfBooks) {
        for (int index = 0; index < arrayOfBooks.length; index++) {
            Book thisBook = arrayOfBooks[index];
            System.out.println(thisBook.getNameOfBook());
        }
        System.out.println();
    }

    public static Book[] replaceBooksOnShelf(Book[] shelf, int index1, int index2) {
        Book temporaryBook;
        temporaryBook = shelf[index2];
        shelf[index2] = shelf[index1];
        shelf[index1] = temporaryBook;
        return shelf;
    }

    public static void outputToConsoleBookWithName(String name, Book[] thisShelf) {
        for (int i = 0; i < thisShelf.length; i++) {
            if (thisShelf[i].getNameOfBook().equals("Clean code")) {
                System.out.println(thisShelf[i].getNameOfBook() + " имеет " + i + 1 + "-ый номер");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Clean code");
        Book book2 = new Book("Pygmalion");
        Book book3 = new Book("Overthinking");
        Book book4 = new Book("1984");
        Book[] thisShelf = new Book[4];
        thisShelf[0] = book1;
        thisShelf[1] = book2;
        thisShelf[2] = book3;
        thisShelf[3] = book4;

        outputToConsole(thisShelf);
        replaceBooksOnShelf(thisShelf, 0, 3);
        outputToConsole(thisShelf);
        outputToConsoleBookWithName("Clean code", thisShelf);
    }
}