package com.spring3.demo.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring3.demo.entity.Author;
import com.spring3.demo.entity.Book;
import com.spring3.demo.model.Publisher;
import com.spring3.demo.repository.PublisherReportsitory;
@Component
public class BootstrapLoaderdata implements CommandLineRunner {

	private PublisherReportsitory publisherReportsitory;

	public BootstrapLoaderdata(PublisherReportsitory publisherReportsitory) {
		super();
		this.publisherReportsitory = publisherReportsitory;
	}

	@Override
	public void run(String... args) throws Exception {


		Book nooneBook = new Book();
		nooneBook.setIsdn("1234");
		nooneBook.setName("Thinking in java ");

		Book saveBook1 = bookRepository.save(nooneBook);

		Author nooneAuthor = new Author();
		nooneAuthor.setFirstName("eric");
		nooneAuthor.setLastName("Bano");

		Author saveauthor1 = authorRepository.save(nooneAuthor);

		Book notwoBook = new Book();
		notwoBook.setIsdn("11234");
		notwoBook.setName("Thinking in eclipse ");

		Book saveBook2 = bookRepository.save(notwoBook);

		Author notwoAuthor = new Author();
		notwoAuthor.setFirstName("eric");
		notwoAuthor.setLastName("Bano");
		authorRepository.save(notwoAuthor);

		notwoAuthor.getBooks().add(saveBook2);
		saveBook2.getAuthors().add(notwoAuthor);
		authorRepository.save(notwoAuthor);
		bookRepository.save(saveBook2);
		

		System.out.println("book count " + bookRepository.count());
		System.out.println("author count " + authorRepository.count());

		
		
		
		/*
		Publisher myPublisher1 = new Publisher();
		myPublisher1.setAddress("XYZ");
		myPublisher1.setCity("Mumbai");
		myPublisher1.setPublisherName("Test");
		myPublisher1.setState("Maharastra");
		myPublisher1.setZip(410210);

		Publisher myPublisher2 = new Publisher();
		myPublisher2.setAddress("XYZX");
		myPublisher2.setCity("Mumbai");
		myPublisher2.setPublisherName("Test");
		myPublisher2.setState("Maharastra");
		myPublisher2.setZip(410210);

		publisherReportsitory.save(myPublisher1);
		publisherReportsitory.save(myPublisher2);
		*/

		System.out.println("total publisher :" + publisherReportsitory.count());

	}

}
