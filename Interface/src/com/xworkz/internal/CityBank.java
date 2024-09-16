package com.xworkz.internal;

public class CityBank implements BankRule {

	@Override
	public boolean manager() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean amount() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean account() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean keepSilent() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean locker() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean security() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public int minBalance() {
		System.out.println(";;;;;;;");
		return 1000;
	}

	@Override
	public double transactionFee() {
		System.out.println(";;;;;;;");
		return 10;
	}

	@Override
	public boolean withdrawal() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean deposit() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean keepClean() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean longTermLoan() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean getDebitCard() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean getCreditCard() {
		System.out.println(";;;;;;;");
		return true;
	}

	@Override
	public boolean onlineBanking() {
		System.out.println(";;;;;;;");
		return true;
	}
}