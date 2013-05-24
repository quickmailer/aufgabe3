package mail;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Mail {
	String messageId;

	String from;
	String to;
	String subject;
	String body;
	
	Date receiveDate;
	Date sendDate;

	MailAccount mailaccount;
	
	public Mail(String messageId, String from, String to, String subject, String body, MailAccount mailaccount) {
		this.messageId = messageId;
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.body = body;
		this.mailaccount = mailaccount;
	}
	
	public String getMessageId() {
		return messageId;
	}

	public String getFormatedReceiveDate()
	{
		SimpleDateFormat dateFormated = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		String renderedDate = null;
		
		if(receiveDate != null)
		{
			renderedDate  = dateFormated.format(receiveDate);
		}
	
		return renderedDate;
	}
	
	public Date getReceiveDate() {
		return receiveDate;
	}
	
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public Date getSendDate() {
		return sendDate;
	}
	
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public MailAccount getMailaccount() {
		return mailaccount;
	}
	public void setMailaccount(MailAccount mailaccount) {
		this.mailaccount = mailaccount;
	}

}
