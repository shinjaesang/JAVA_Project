package test;

import java.util.Scanner;

public class Book2Array {

	public static void main(String[] args) {
		Book2 [] book= new Book2[2];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book2(title, author);
		}
		for(int i = 0; i<book.length; i++) {
			System.out.print("(" + book[i].title + ", "+ book[i].author + ")");
			
		scanner.close();
		}
	}

}
