package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  /*
   *
   * ADD TESTS FOR ACE BOUNDARY
   *
   *
   **/


  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    var cards = List.of(new Card(Suit.HEART, "A"),
                        new Card(Suit.HEART, "5"));
    Hand hand = new Hand(cards);

    assertThat(hand.handValueOf())
        .isEqualTo(11 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    var cards = List.of(new Card(Suit.HEART, "A"),
                        new Card(Suit.HEART, "8"),
                        new Card(Suit.HEART, "3"));
    Hand hand = new Hand(cards);

    assertThat(hand.handValueOf())
        .isEqualTo(1 + 8 + 3);
  }

}
