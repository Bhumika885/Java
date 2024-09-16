package com.xworkz.internal;

public interface BankRule {

	boolean locker();

	boolean security();

	int minBalance();

	double transactionFee();

	boolean withdrawal();

	boolean deposit();

	boolean keepClean();

	boolean longTermLoan();

	boolean getDebitCard();

	boolean getCreditCard();

	boolean onlineBanking();

	boolean manager();

	boolean amount();

	boolean account();

	boolean keepSilent();

}