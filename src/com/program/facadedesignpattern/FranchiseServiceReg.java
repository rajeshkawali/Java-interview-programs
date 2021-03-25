package com.program.facadedesignpattern;

public class FranchiseServiceReg {
	private Franchise KFC;
	private Franchise McDonalds;
	private Franchise Dominos;

	public FranchiseServiceReg() {
		KFC = new KFC();
		McDonalds = new McDonalds();
		Dominos = new Dominos();
	}

	public void BuyKFCFranchise() {
		KFC.Option();
		KFC.Cost();
	}

	public void BuyMcDonaldsFranchise() {
		McDonalds.Option();
		McDonalds.Cost();
	}

	public void BuyDominosFranchise() {
		Dominos.Option();
		Dominos.Cost();
	}
}