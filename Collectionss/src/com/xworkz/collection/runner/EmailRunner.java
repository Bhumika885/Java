package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.associate.EmailDTO;

public class EmailRunner {

	public static void main(String[] args) {

		EmailDTO email = new EmailDTO();
		EmailDTO email2 = new EmailDTO();
		EmailDTO email3 = new EmailDTO();
		EmailDTO email4 = new EmailDTO();
		EmailDTO email5 = new EmailDTO();

		Collection<EmailDTO> collection = new ArrayList<EmailDTO>();
		// add method
		collection.add(email5);
		collection.add(email4);
		collection.add(email3);
		collection.add(email2);
		collection.add(email);

		collection.forEach(ref -> System.out.println(ref));
		System.out.println("---------------");

		// addAll method
		Collection<EmailDTO> additionalEmails = new ArrayList<>();
		additionalEmails.add(email);
		additionalEmails.add(email4);
		collection.addAll(additionalEmails);
		System.out.println("After adding 2 more emails: " + collection.size());
		System.out.println("---------------");

		// contains method
		System.out.println("Contains email : " + collection.contains(email));
		System.out.println("---------------");

		// containsAll
		System.out.println("Contains all checkEmails :" + collection.containsAll(collection));
		System.out.println(collection.size());
		System.out.println("---------------");

		// size method
		System.out.println("Size of collection :" + collection.size());
		System.out.println("---------------");

		// isEmpty method
		System.out.println("Is collection empty? " + collection.isEmpty());
		System.out.println("---------------");

		// iterator method
		Iterator<EmailDTO> iterator = collection.iterator();
		System.out.println(iterator.next());
		System.out.println("---------------");

		System.out.println("After Remove method");

		// remove method
		collection.remove(email3);
		collection.forEach(ref -> System.out.println(ref));
		System.out.println("---------------");

		// removeAll
		Collection<EmailDTO> emailsToRemove = new ArrayList<>();
		emailsToRemove.add(email2);
		boolean check = collection.removeAll(emailsToRemove);
		System.out.println("Were any emails removed? " + check);
		System.out.println("After removing email2: " + collection.size());
		System.out.println("---------------");

		// clear method
		collection.clear();
		System.out.println(collection);

		/**
		 * Collection<EmailDTO> retain = new ArrayList<EmailDTO>(); retain.add(email5);
		 * retain.add(email3); collection.retainAll(retain);
		 * collection.forEach(ref->System.out.println(ref));
		 */

		/**
		 * removeIf collection.removeIf(email -> "Mock
		 * Reminder".equals(email.getSubject())); System.out.println("After removing
		 * emails with subject 'Mock Reminder': " + collection.size());
		 */

	}

}