package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the transactions database table.
 * 
 */
@Entity
@Table(name="transactions")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double amount;
	private byte authorizable;
	private byte captured;
	private String cardAuthCode;
	private String cardMerchantGateway;
	private String cardNumber;
	private String cardReader;
	private String cardTransactionId;
	private String cardType;
	private String customPaymentFieldName;
	private String customPaymentName;
	private String customPaymentRef;
	private byte drawerResetted;
	private double giftCertCashBackAmount;
	private double giftCertFaceValue;
	private String giftCertNumber;
	private double giftCertPaidAmount;
	private String note;
	private String paymentSubType;
	private String paymentType;
	private double tenderAmount;
	private double tipsAmount;
	private Date transactionTime;
	private String transactionType;
	private Set<TransactionProperty> transactionProperties;
	private Ticket ticket;
	private Terminal terminal;
	private User user;
	private PayoutRecepient payoutRecepient;
	private PayoutReason payoutReason;

	public Transaction() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	public byte getAuthorizable() {
		return this.authorizable;
	}

	public void setAuthorizable(byte authorizable) {
		this.authorizable = authorizable;
	}


	public byte getCaptured() {
		return this.captured;
	}

	public void setCaptured(byte captured) {
		this.captured = captured;
	}


	@Column(name="CARD_AUTH_CODE")
	public String getCardAuthCode() {
		return this.cardAuthCode;
	}

	public void setCardAuthCode(String cardAuthCode) {
		this.cardAuthCode = cardAuthCode;
	}


	@Column(name="CARD_MERCHANT_GATEWAY")
	public String getCardMerchantGateway() {
		return this.cardMerchantGateway;
	}

	public void setCardMerchantGateway(String cardMerchantGateway) {
		this.cardMerchantGateway = cardMerchantGateway;
	}


	@Column(name="CARD_NUMBER")
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	@Column(name="CARD_READER")
	public String getCardReader() {
		return this.cardReader;
	}

	public void setCardReader(String cardReader) {
		this.cardReader = cardReader;
	}


	@Column(name="CARD_TRANSACTION_ID")
	public String getCardTransactionId() {
		return this.cardTransactionId;
	}

	public void setCardTransactionId(String cardTransactionId) {
		this.cardTransactionId = cardTransactionId;
	}


	@Column(name="CARD_TYPE")
	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	@Column(name="CUSTOM_PAYMENT_FIELD_NAME")
	public String getCustomPaymentFieldName() {
		return this.customPaymentFieldName;
	}

	public void setCustomPaymentFieldName(String customPaymentFieldName) {
		this.customPaymentFieldName = customPaymentFieldName;
	}


	@Column(name="CUSTOM_PAYMENT_NAME")
	public String getCustomPaymentName() {
		return this.customPaymentName;
	}

	public void setCustomPaymentName(String customPaymentName) {
		this.customPaymentName = customPaymentName;
	}


	@Column(name="CUSTOM_PAYMENT_REF")
	public String getCustomPaymentRef() {
		return this.customPaymentRef;
	}

	public void setCustomPaymentRef(String customPaymentRef) {
		this.customPaymentRef = customPaymentRef;
	}


	@Column(name="DRAWER_RESETTED")
	public byte getDrawerResetted() {
		return this.drawerResetted;
	}

	public void setDrawerResetted(byte drawerResetted) {
		this.drawerResetted = drawerResetted;
	}


	@Column(name="GIFT_CERT_CASH_BACK_AMOUNT")
	public double getGiftCertCashBackAmount() {
		return this.giftCertCashBackAmount;
	}

	public void setGiftCertCashBackAmount(double giftCertCashBackAmount) {
		this.giftCertCashBackAmount = giftCertCashBackAmount;
	}


	@Column(name="GIFT_CERT_FACE_VALUE")
	public double getGiftCertFaceValue() {
		return this.giftCertFaceValue;
	}

	public void setGiftCertFaceValue(double giftCertFaceValue) {
		this.giftCertFaceValue = giftCertFaceValue;
	}


	@Column(name="GIFT_CERT_NUMBER")
	public String getGiftCertNumber() {
		return this.giftCertNumber;
	}

	public void setGiftCertNumber(String giftCertNumber) {
		this.giftCertNumber = giftCertNumber;
	}


	@Column(name="GIFT_CERT_PAID_AMOUNT")
	public double getGiftCertPaidAmount() {
		return this.giftCertPaidAmount;
	}

	public void setGiftCertPaidAmount(double giftCertPaidAmount) {
		this.giftCertPaidAmount = giftCertPaidAmount;
	}


	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	@Column(name="PAYMENT_SUB_TYPE")
	public String getPaymentSubType() {
		return this.paymentSubType;
	}

	public void setPaymentSubType(String paymentSubType) {
		this.paymentSubType = paymentSubType;
	}


	@Column(name="PAYMENT_TYPE")
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	@Column(name="TENDER_AMOUNT")
	public double getTenderAmount() {
		return this.tenderAmount;
	}

	public void setTenderAmount(double tenderAmount) {
		this.tenderAmount = tenderAmount;
	}


	@Column(name="TIPS_AMOUNT")
	public double getTipsAmount() {
		return this.tipsAmount;
	}

	public void setTipsAmount(double tipsAmount) {
		this.tipsAmount = tipsAmount;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TRANSACTION_TIME")
	public Date getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}


	@Column(name="TRANSACTION_TYPE")
	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	//bi-directional many-to-one association to TransactionProperty
	@OneToMany(mappedBy="transaction")
	public Set<TransactionProperty> getTransactionProperties() {
		return this.transactionProperties;
	}

	public void setTransactionProperties(Set<TransactionProperty> transactionProperties) {
		this.transactionProperties = transactionProperties;
	}

	public TransactionProperty addTransactionProperty(TransactionProperty transactionProperty) {
		getTransactionProperties().add(transactionProperty);
		transactionProperty.setTransaction(this);

		return transactionProperty;
	}

	public TransactionProperty removeTransactionProperty(TransactionProperty transactionProperty) {
		getTransactionProperties().remove(transactionProperty);
		transactionProperty.setTransaction(null);

		return transactionProperty;
	}


	//bi-directional many-to-one association to Ticket
	@ManyToOne
	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
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


	//bi-directional many-to-one association to PayoutRecepient
	@ManyToOne
	@JoinColumn(name="PAYOUT_RECEPIENT_ID")
	public PayoutRecepient getPayoutRecepient() {
		return this.payoutRecepient;
	}

	public void setPayoutRecepient(PayoutRecepient payoutRecepient) {
		this.payoutRecepient = payoutRecepient;
	}


	//bi-directional many-to-one association to PayoutReason
	@ManyToOne
	@JoinColumn(name="PAYOUT_REASON_ID")
	public PayoutReason getPayoutReason() {
		return this.payoutReason;
	}

	public void setPayoutReason(PayoutReason payoutReason) {
		this.payoutReason = payoutReason;
	}

}