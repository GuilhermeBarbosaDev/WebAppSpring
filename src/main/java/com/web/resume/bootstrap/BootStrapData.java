package com.web.resume.bootstrap;

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

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Author guilherme = new Author("Guilherme","Barbosa");
		Book code = new Book("coder", "863752");
		Publisher luxoft = new Publisher();
				
		
		luxoft.setName("luxoft");
		luxoft.setCity("Lauro de Freitas");
		luxoft.setState("Bahia");
		luxoft.setAddressLine("Av Brigadeiro ,383");
		
		
		
		guilherme.getBooks().add(code);
		code.getAuthors().add(guilherme);
		
		publisherRepository.save(luxoft);
		authorRepository.save(guilherme);
		bookRepository.save(code);
		
		System.out.println("number of books: " + bookRepository.count());
		System.out.println("number of publishies: " + publisherRepository.count());
		System.out.println(luxoft.getName() + " is insane");
	}
	
}
