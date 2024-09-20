
package com.xworkz.impl;

import com.xworkz.interfaces.Repository;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("Execute a save in RepositoryImpl");
		return true;
	}

}
