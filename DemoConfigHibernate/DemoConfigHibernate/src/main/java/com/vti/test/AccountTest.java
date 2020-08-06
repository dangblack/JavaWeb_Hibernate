package com.vti.test;

import java.util.List;

import com.vti.entity.Account;
import com.vti.repository.AccountRepository;

public class AccountTest {
	public static void main(String[] args) {
		AccountRepository repository = new AccountRepository();

		System.out.println("***********GET ALL ACCOUNTS***********");

		List<Account> Accounts = repository.getAllAccounts();

		for (Account Account : Accounts) {
			System.out.println(Account);
		}

		System.out.println("\n\n***********CREATE ACCOUNT***********");

		Account accountCreate = new Account();
		accountCreate.setUsername("NguyenVanA");
		accountCreate.setEmail("NguyenVanA@gmail.com");
		accountCreate.setFirstName("A");
		accountCreate.setLastName("Nguyen Van");

		repository.createAccount(accountCreate);

	}
}
