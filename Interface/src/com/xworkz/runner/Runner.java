package com.xworkz.runner;

import com.xworkz.internal.CityTrafficRule;
import com.xworkz.internal.BankRule;
import com.xworkz.internal.CollegeRule;
import com.xworkz.internal.PublicCollege;
import com.xworkz.internal.HospitalRule;
import com.xworkz.internal.CityTemple;
import com.xworkz.internal.BangaloreRailwayStation;
import com.xworkz.internal.PublicHospital;
import com.xworkz.internal.RailwayStationRule;
import com.xworkz.internal.CityBank;
import com.xworkz.internal.TempleRule;
import com.xworkz.internal.TrafficRule;

public class Runner {

	public static void main(String[] args) {

		HospitalRule hospital = new PublicHospital();
		System.out.println("Visiting People:" + hospital.noOfVisiters());
		System.out.println("Admission:" + hospital.admissionPolicy());
		System.out.println("Silence:" + hospital.maintainSilence());

		System.out.println("+++++++++++++++++++++++++");

		TrafficRule traffic = new CityTrafficRule();
		System.out.println(traffic.licence());
		System.out.println(traffic.helmet());
		System.out.println(traffic.numberPlate());
		System.out.println(traffic.speedLimit());
		System.out.println(traffic.noOfPeople());
		System.out.println(traffic.indicator());
		System.out.println(traffic.licence());
		System.out.println(traffic.seatBelt());
		System.out.println(traffic.noSmoking());
		System.out.println(traffic.noDrinking());
		System.out.println(traffic.noParkingInPublicPlace());
		System.out.println(traffic.ambulanceFreePassage());
		System.out.println("+++++++++++++++++++++++++");

		CollegeRule college= new PublicCollege();
		System.out.println(college.idCard());
		System.out.println(college.inShirt());
		System.out.println(college.shoes());
		System.out.println(college.setClgTiming());
		System.out.println(college.time());
		System.out.println(college.antiRagging());
		System.out.println(college.smoking());
		System.out.println(college.setDressCode());
		System.out.println(college.books());
		System.out.println(college.setLibHours());
		System.out.println("+++++++++++++++++++++++++");
		
		TempleRule temple= new CityTemple();
		System.out.println(temple.openingTime());
		System.out.println(temple.closingTime());
		System.out.println(temple.KeepSilence());
		System.out.println(temple.prayerTime());
		System.out.println(temple.donationPolicy());
		System.out.println(temple.dressCode());
		System.out.println(temple.visitorRule());
		System.out.println(temple.noPhones());
		System.out.println(temple.noCamera());
		System.out.println(temple.guide());
		System.out.println("+++++++++++++++++++++++++");
		
		RailwayStationRule railway= new BangaloreRailwayStation();
		System.out.println(railway.platformTicket());
		System.out.println(railway.trainTicket());
		System.out.println(railway.stationMaster());
		System.out.println(railway.policeStation());
		System.out.println(railway.chainSnatcher());
		System.out.println(railway.signals());
		System.out.println(railway.ticketCounter());
		System.out.println(railway.toilet());
		System.out.println(railway.drinkingWater());
		System.out.println(railway.foodStall());
		System.out.println(railway.foodStall());
		System.out.println(railway.announcementBoard());
		System.out.println(railway.noSmoking());
		System.out.println(railway.keepSilence());
		System.out.println(railway.trainSchedule());
		System.out.println(railway.parkingFacility());
		System.out.println("+++++++++++++++++++++++++");
		
		BankRule bank= new CityBank();
		System.out.println(bank.manager());
		System.out.println(bank.amount());
		System.out.println(bank.account());
		System.out.println(bank.keepSilent());
		System.out.println(bank.locker());
		System.out.println(bank.minBalance());
		System.out.println(bank.transactionFee());
		System.out.println(bank.withdrawal());
		System.out.println(bank.deposit());
		System.out.println(bank.keepClean());
		System.out.println(bank.longTermLoan());
		System.out.println(bank.getDebitCard());
		System.out.println(bank.getCreditCard());
		System.out.println(bank.onlineBanking());
		System.out.println("+++++++++++++++++++++++++");
		


	}

}