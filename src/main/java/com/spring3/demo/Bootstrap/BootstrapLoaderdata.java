package com.spring3.demo.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring3.demo.model.Author;
import com.spring3.demo.model.Book;
import com.spring3.demo.model.Publisher;
import com.spring3.demo.repository.AuthorRepository;
import com.spring3.demo.repository.BookRepository;
import com.spring3.demo.repository.PublisherReportsitory;

@Component
public class BootstrapLoaderdata implements CommandLineRunner {

	private PublisherReportsitory publisherReportsitory;
	private BookRepository bookRepository;
	private AuthorRepository authorRepository;

	public BootstrapLoaderdata(PublisherReportsitory publisherReportsitory, BookRepository bookRepository,
			AuthorRepository authorRepository) {
		super();
		this.publisherReportsitory = publisherReportsitory;
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Author author1 = new Author();
		author1.setFirstName("first");
		author1.setLastName("last name1");

		Book book1 = new Book();
		book1.setIsdn("123");
		book1.setName("book1");

		Author author2 = new Author();
		author2.setFirstName("second");
		author2.setLastName("last name2");

		Book book2 = new Book();
		book2.setIsdn("123");
		book2.setName("book2");

		Book savebook1 = bookRepository.save(book1);
		Book savebook2 = bookRepository.save(book2);
		Author savedAuthor1 = authorRepository.save(author1);
		Author savedAuthor2 = authorRepository.save(author2);

		savebook1.getAuthors().add(savedAuthor1);
		savedAuthor1.getBooks().add(savebook1);

		savebook2.getAuthors().add(savedAuthor2);
		savebook2.getAuthors().add(savedAuthor1);
		savedAuthor2.getBooks().add(savebook2);

		Publisher publisher = new Publisher();
		publisher.setPublisherName("My Publisher");
		publisher.setAddress("123 Main");
		Publisher savedPublisher = publisherReportsitory.save(publisher);

		savebook1.setPublisher(savedPublisher);
		savebook2.setPublisher(savedPublisher);

		// authorRepository.save(savedAuthor1);
		bookRepository.save(savebook1);
		bookRepository.save(savebook2);

		System.out.println("Books:" + bookRepository.count());
		System.out.println("Authors :" + authorRepository.count());
		System.out.println("publisher :" + publisherReportsitory.count());

	}

}
