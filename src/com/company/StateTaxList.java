package com.company;

import java.util.ArrayList;

public class StateTaxList {

  private ArrayList<StateTax>taxRates = new ArrayList<>();

  public void createStateTaxes() {
    StateTax utah = new StateTax("UT", 6.85);
    StateTax cali = new StateTax("CA", 8.25);

    taxRates.add(utah);
    taxRates.add(cali);
  }





}
