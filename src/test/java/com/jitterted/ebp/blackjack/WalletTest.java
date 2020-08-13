package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

  @Test
  public void newWalletIsEmpty() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void add10BucksNewToWalletIsEmptyIsFalse() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(10);

    assertThat(wallet.isEmpty())
        .isFalse();
  }

  @Test
  public void add5BucksToNewWalletThenBalanceIs5() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(5);

    assertThat(wallet.balance())
        .isEqualTo(5);
  }

  @Test
  public void add7BucksToWalletWith5BucksThenBalanceIs12() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(5);

    wallet.addMoney(7);

    assertThat(wallet.balance())
        .isEqualTo(5 + 7);
  }

}
