package com.spring3.demo.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
		System.out.println("Saved");
		publisherReportsitory.save(myPublisher2);
		System.out.println("Saved");

		System.out.println("total publisher :" + publisherReportsitory.count());

	}

}
