package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the drawer_pull_report database table.
 * 
 */
@Entity
@Table(name="drawer_pull_report")
@NamedQuery(name="DrawerPullReport.findAll", query="SELECT d FROM DrawerPullReport d")
public class DrawerPullReport implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double beginCash;
	private double cashBack;
	private double cashReceiptAmount;
	private int cashReceiptNo;
	private double cashTax;
	private double cashTips;
	private double cashToDeposit;
	private double chargedTips;
	private double creditCardReceiptAmount;
	private int creditCardReceiptNo;
	private double debitCardReceiptAmount;
	private int debitCardReceiptNo;
	private double drawerAccountable;
	private double drawerBleedAmount;
	private int drawerBleedNo;
	private double giftcertchangeamount;
	private double giftcertreturnamount;
	private int giftcertreturncount;
	private double grossReceipts;
	private double netSales;
	private double payOutAmount;
	private int payOutNo;
	private double receiptDifferential;
	private double refundAmount;
	private int refundReceiptCount;
	private String reg;
	private Date reportTime;
	private double salesTax;
	private int ticketCount;
	private double tipsDifferential;
	private double tipsPaid;
	private double totalRevenue;
	private double totalDiscountAmount;
	private int totalDiscountCheckSize;
	private int totalDiscountCount;
	private int totalDiscountGuest;
	private int totalDiscountPartySize;
	private double totalDiscountPercentage;
	private double totalDiscountRatio;
	private double totalDiscountSales;
	private double totalVoid;
	private double totalVoidWst;
	private double variance;
	private Terminal terminal;
	private User user;
	private Set<DrawerPullReportVoidticket> drawerPullReportVoidtickets;

	public DrawerPullReport() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="BEGIN_CASH")
	public double getBeginCash() {
		return this.beginCash;
	}

	public void setBeginCash(double beginCash) {
		this.beginCash = beginCash;
	}


	@Column(name="CASH_BACK")
	public double getCashBack() {
		return this.cashBack;
	}

	public void setCashBack(double cashBack) {
		this.cashBack = cashBack;
	}


	@Column(name="CASH_RECEIPT_AMOUNT")
	public double getCashReceiptAmount() {
		return this.cashReceiptAmount;
	}

	public void setCashReceiptAmount(double cashReceiptAmount) {
		this.cashReceiptAmount = cashReceiptAmount;
	}


	@Column(name="CASH_RECEIPT_NO")
	public int getCashReceiptNo() {
		return this.cashReceiptNo;
	}

	public void setCashReceiptNo(int cashReceiptNo) {
		this.cashReceiptNo = cashReceiptNo;
	}


	@Column(name="CASH_TAX")
	public double getCashTax() {
		return this.cashTax;
	}

	public void setCashTax(double cashTax) {
		this.cashTax = cashTax;
	}


	@Column(name="CASH_TIPS")
	public double getCashTips() {
		return this.cashTips;
	}

	public void setCashTips(double cashTips) {
		this.cashTips = cashTips;
	}


	@Column(name="CASH_TO_DEPOSIT")
	public double getCashToDeposit() {
		return this.cashToDeposit;
	}

	public void setCashToDeposit(double cashToDeposit) {
		this.cashToDeposit = cashToDeposit;
	}


	@Column(name="CHARGED_TIPS")
	public double getChargedTips() {
		return this.chargedTips;
	}

	public void setChargedTips(double chargedTips) {
		this.chargedTips = chargedTips;
	}


	@Column(name="CREDIT_CARD_RECEIPT_AMOUNT")
	public double getCreditCardReceiptAmount() {
		return this.creditCardReceiptAmount;
	}

	public void setCreditCardReceiptAmount(double creditCardReceiptAmount) {
		this.creditCardReceiptAmount = creditCardReceiptAmount;
	}


	@Column(name="CREDIT_CARD_RECEIPT_NO")
	public int getCreditCardReceiptNo() {
		return this.creditCardReceiptNo;
	}

	public void setCreditCardReceiptNo(int creditCardReceiptNo) {
		this.creditCardReceiptNo = creditCardReceiptNo;
	}


	@Column(name="DEBIT_CARD_RECEIPT_AMOUNT")
	public double getDebitCardReceiptAmount() {
		return this.debitCardReceiptAmount;
	}

	public void setDebitCardReceiptAmount(double debitCardReceiptAmount) {
		this.debitCardReceiptAmount = debitCardReceiptAmount;
	}


	@Column(name="DEBIT_CARD_RECEIPT_NO")
	public int getDebitCardReceiptNo() {
		return this.debitCardReceiptNo;
	}

	public void setDebitCardReceiptNo(int debitCardReceiptNo) {
		this.debitCardReceiptNo = debitCardReceiptNo;
	}


	@Column(name="DRAWER_ACCOUNTABLE")
	public double getDrawerAccountable() {
		return this.drawerAccountable;
	}

	public void setDrawerAccountable(double drawerAccountable) {
		this.drawerAccountable = drawerAccountable;
	}


	@Column(name="DRAWER_BLEED_AMOUNT")
	public double getDrawerBleedAmount() {
		return this.drawerBleedAmount;
	}

	public void setDrawerBleedAmount(double drawerBleedAmount) {
		this.drawerBleedAmount = drawerBleedAmount;
	}


	@Column(name="DRAWER_BLEED_NO")
	public int getDrawerBleedNo() {
		return this.drawerBleedNo;
	}

	public void setDrawerBleedNo(int drawerBleedNo) {
		this.drawerBleedNo = drawerBleedNo;
	}


	public double getGiftcertchangeamount() {
		return this.giftcertchangeamount;
	}

	public void setGiftcertchangeamount(double giftcertchangeamount) {
		this.giftcertchangeamount = giftcertchangeamount;
	}


	public double getGiftcertreturnamount() {
		return this.giftcertreturnamount;
	}

	public void setGiftcertreturnamount(double giftcertreturnamount) {
		this.giftcertreturnamount = giftcertreturnamount;
	}


	public int getGiftcertreturncount() {
		return this.giftcertreturncount;
	}

	public void setGiftcertreturncount(int giftcertreturncount) {
		this.giftcertreturncount = giftcertreturncount;
	}


	@Column(name="GROSS_RECEIPTS")
	public double getGrossReceipts() {
		return this.grossReceipts;
	}

	public void setGrossReceipts(double grossReceipts) {
		this.grossReceipts = grossReceipts;
	}


	@Column(name="NET_SALES")
	public double getNetSales() {
		return this.netSales;
	}

	public void setNetSales(double netSales) {
		this.netSales = netSales;
	}


	@Column(name="PAY_OUT_AMOUNT")
	public double getPayOutAmount() {
		return this.payOutAmount;
	}

	public void setPayOutAmount(double payOutAmount) {
		this.payOutAmount = payOutAmount;
	}


	@Column(name="PAY_OUT_NO")
	public int getPayOutNo() {
		return this.payOutNo;
	}

	public void setPayOutNo(int payOutNo) {
		this.payOutNo = payOutNo;
	}


	@Column(name="RECEIPT_DIFFERENTIAL")
	public double getReceiptDifferential() {
		return this.receiptDifferential;
	}

	public void setReceiptDifferential(double receiptDifferential) {
		this.receiptDifferential = receiptDifferential;
	}


	@Column(name="REFUND_AMOUNT")
	public double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}


	@Column(name="REFUND_RECEIPT_COUNT")
	public int getRefundReceiptCount() {
		return this.refundReceiptCount;
	}

	public void setRefundReceiptCount(int refundReceiptCount) {
		this.refundReceiptCount = refundReceiptCount;
	}


	public String getReg() {
		return this.reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REPORT_TIME")
	public Date getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}


	@Column(name="SALES_TAX")
	public double getSalesTax() {
		return this.salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}


	@Column(name="TICKET_COUNT")
	public int getTicketCount() {
		return this.ticketCount;
	}

	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}


	@Column(name="TIPS_DIFFERENTIAL")
	public double getTipsDifferential() {
		return this.tipsDifferential;
	}

	public void setTipsDifferential(double tipsDifferential) {
		this.tipsDifferential = tipsDifferential;
	}


	@Column(name="TIPS_PAID")
	public double getTipsPaid() {
		return this.tipsPaid;
	}

	public void setTipsPaid(double tipsPaid) {
		this.tipsPaid = tipsPaid;
	}


	@Column(name="TOTAL_REVENUE")
	public double getTotalRevenue() {
		return this.totalRevenue;
	}

	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}


	public double getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}

	public void setTotalDiscountAmount(double totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}


	public int getTotalDiscountCheckSize() {
		return this.totalDiscountCheckSize;
	}

	public void setTotalDiscountCheckSize(int totalDiscountCheckSize) {
		this.totalDiscountCheckSize = totalDiscountCheckSize;
	}


	public int getTotalDiscountCount() {
		return this.totalDiscountCount;
	}

	public void setTotalDiscountCount(int totalDiscountCount) {
		this.totalDiscountCount = totalDiscountCount;
	}


	public int getTotalDiscountGuest() {
		return this.totalDiscountGuest;
	}

	public void setTotalDiscountGuest(int totalDiscountGuest) {
		this.totalDiscountGuest = totalDiscountGuest;
	}


	public int getTotalDiscountPartySize() {
		return this.totalDiscountPartySize;
	}

	public void setTotalDiscountPartySize(int totalDiscountPartySize) {
		this.totalDiscountPartySize = totalDiscountPartySize;
	}


	public double getTotalDiscountPercentage() {
		return this.totalDiscountPercentage;
	}

	public void setTotalDiscountPercentage(double totalDiscountPercentage) {
		this.totalDiscountPercentage = totalDiscountPercentage;
	}


	public double getTotalDiscountRatio() {
		return this.totalDiscountRatio;
	}

	public void setTotalDiscountRatio(double totalDiscountRatio) {
		this.totalDiscountRatio = totalDiscountRatio;
	}


	public double getTotalDiscountSales() {
		return this.totalDiscountSales;
	}

	public void setTotalDiscountSales(double totalDiscountSales) {
		this.totalDiscountSales = totalDiscountSales;
	}


	public double getTotalVoid() {
		return this.totalVoid;
	}

	public void setTotalVoid(double totalVoid) {
		this.totalVoid = totalVoid;
	}


	public double getTotalVoidWst() {
		return this.totalVoidWst;
	}

	public void setTotalVoidWst(double totalVoidWst) {
		this.totalVoidWst = totalVoidWst;
	}


	public double getVariance() {
		return this.variance;
	}

	public void setVariance(double variance) {
		this.variance = variance;
	}


	//bi-directional many-to-one association to Terminal
	@ManyToOne
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	//bi-directional many-to-one association to DrawerPullReportVoidticket
	@OneToMany(mappedBy="drawerPullReport")
	public Set<DrawerPullReportVoidticket> getDrawerPullReportVoidtickets() {
		return this.drawerPullReportVoidtickets;
	}

	public void setDrawerPullReportVoidtickets(Set<DrawerPullReportVoidticket> drawerPullReportVoidtickets) {
		this.drawerPullReportVoidtickets = drawerPullReportVoidtickets;
	}

	public DrawerPullReportVoidticket addDrawerPullReportVoidticket(DrawerPullReportVoidticket drawerPullReportVoidticket) {
		getDrawerPullReportVoidtickets().add(drawerPullReportVoidticket);
		drawerPullReportVoidticket.setDrawerPullReport(this);

		return drawerPullReportVoidticket;
	}

	public DrawerPullReportVoidticket removeDrawerPullReportVoidticket(DrawerPullReportVoidticket drawerPullReportVoidticket) {
		getDrawerPullReportVoidtickets().remove(drawerPullReportVoidticket);
		drawerPullReportVoidticket.setDrawerPullReport(null);

		return drawerPullReportVoidticket;
	}

}