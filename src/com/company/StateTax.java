package com.company;

import java.util.ArrayList;

public class StateTax {
  private double stateTax;
  private String stateName;

  public StateTax(String stateName, double stateTax) {
    this.stateTax = stateTax;
    this.stateName = stateName;
  }

  public StateTax() {
  }

  public double getStateTax() {
    return stateTax;
  }

  public String getStateName() {
    return stateName;
  }
}
