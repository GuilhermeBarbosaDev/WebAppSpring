package com.web.resume.bootstrap;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.web.resume.models.Author;
import com.web.resume.models.Book;
import com.web.resume.models.Publisher;
import com.web.resume.repository.AuthorRepository;
import com.web.resume.repository.BookRepository;
import com.web.resume.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	
	public static final DecimalFormat df = new DecimalFormat("00.0000");
	
	
	
//	private final AuthorRepository authorRepository;
//	private final BookRepository bookRepository;
//	private final PublisherRepository publisherRepository;
//	
//	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
//		super();
//		this.publisherRepository = publisherRepository;
//		this.authorRepository = authorRepository;
//		this.bookRepository = bookRepository;
//	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		Author guilherme = new Author("Guilherme","Barbosa");
//		Book code = new Book("coder", "863752");
//		Publisher luxoft = new Publisher();
//				
//		
//		luxoft.setName("luxoft");
//		luxoft.setCity("Lauro de Freitas");
//		luxoft.setState("Bahia");
//		luxoft.setAddressLine("Av Brigadeiro ,383");
//		
//		
//		
//		guilherme.getBooks().add(code);
//		code.getAuthors().add(guilherme);
//		
//		publisherRepository.save(luxoft);
//		authorRepository.save(guilherme);
//		bookRepository.save(code);
//		
//		System.out.println("number of books: " + bookRepository.count());
//		System.out.println("number of publishies: " + publisherRepository.count());
//		System.out.println(luxoft.getName() + " is insane");
		
		System.out.println(df.format(beecrowdd4(1.0,5.0,7.0,9.0)));
	}
	
	public static double add(double int1) {
		
		double result = int1 * 12 / 250000 * 100;

		return result;
	}
	
	public static Double beecrowd(Double db1, Double db2){
		
		Double result = ((db1 * 15) / 100) + db2;
		return result;
	}
	
	public static double beecrowdd(int int2, double d, int int4, double e) {
		
		
		double result = (int2 * d) + (int4 * e); 
		
		return result;
	}
	
	public static double beecrowdd2(int int1) {
		
		double result = (4/3.0) * 3.14159 * int1 * int1 * int1;
		
		return result;
	}
	
	public static int beecrowdd3(int a, int b, int s) {
		
		if(a > b && a > s) {
			return a;
		} else if(b > a && b > s) {
			return b;
		}
		else if(s > b && s > a) {
			return s;
		}
		return 0;
	}
	
	public static double beecrowdd4(double x1, double x2, double y1, double y2) {
		
		double total = ((x2 - x1 * x2 - x1) + (y2 - y1 * y2 - y1));
		double result = Math.pow(1, total);
		
		return result;
	}
}
