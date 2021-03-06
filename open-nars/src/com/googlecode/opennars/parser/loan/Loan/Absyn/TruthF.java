package com.googlecode.opennars.parser.loan.Loan.Absyn; // Java Package generated by the BNF Converter.

public class TruthF extends TruthValue {
  public final Double double_;

  public TruthF(Double p1) { double_ = p1; }

  public <R,A> R accept(com.googlecode.opennars.parser.loan.Loan.Absyn.TruthValue.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.googlecode.opennars.parser.loan.Loan.Absyn.TruthF) {
      com.googlecode.opennars.parser.loan.Loan.Absyn.TruthF x = (com.googlecode.opennars.parser.loan.Loan.Absyn.TruthF)o;
      return this.double_.equals(x.double_);
    }
    return false;
  }

  public int hashCode() {
    return this.double_.hashCode();
  }


}
