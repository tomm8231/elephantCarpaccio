package com.company;

import java.util.ArrayList;

public class StateTaxList {

  private ArrayList<StateTax>taxRates = new ArrayList<>();

  public void createStateTaxes() {
    StateTax utah = new StateTax("UT", 1.0685);
    StateTax cali = new StateTax("CA", 1.825);

    taxRates.add(utah);
    taxRates.add(cali);
  }

  public ArrayList<StateTax> getTaxRates() {
    return taxRates;
  }



}
