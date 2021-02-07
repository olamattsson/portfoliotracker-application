package com.olamattsson.portfoliotracker.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
	@Test
	void testThatEqualsWork() {
		Transaction buyTransaction = new Transaction(TransactionType.BUY);
		Transaction sellTransaction = new Transaction(TransactionType.SELL);
		assertNotEquals(buyTransaction, sellTransaction);
	}
}