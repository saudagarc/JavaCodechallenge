package com.db.awmd.challenge.exception;

public class InsufficientAccountBalanceException extends RuntimeException {

  public InsufficientAccountBalanceException(String message) {
    super(message);
  }
}
