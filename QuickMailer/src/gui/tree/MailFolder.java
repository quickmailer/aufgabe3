package gui.tree;


import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import storage.datamanager.adapters.FolderAdapter;
import storage.datamanager.adapters.MailAccountAdapter;

import storage.datamanager.adapters.FolderAdapter;
import mail.Mail;
@XmlJavaTypeAdapter(FolderAdapter.class)
// Used to store Folders
public class MailFolder implements TreeFolders{

	private String label;
	private Boolean restricted;
	private ArrayList<Mail> mailList;
	
	public MailFolder(String label) {
		this(label, false);

	}
	
	public MailFolder(String label, Boolean restricted) {
		this.label = label;
		this.restricted = restricted;
		this.mailList = new ArrayList<Mail>();
	}
	
	public String getLabel() {
		return label;
	}

	public Boolean setLabel(String label) {
		if(!restricted) {
			this.label = label;
			return true;
		}
		
		return false;
	}

	public ArrayList<Mail> getMailList() {
		return mailList;
	}

	public void setMailsList(ArrayList<Mail> mailList) {
		this.mailList = mailList;
	}
	
	public Boolean isRestricted(){
		return restricted;
	}

	public void addMail(Mail mail) {
		mailList.add(mail);
	}
	
	public void removeMail(Mail mail) {
		mailList.remove(mail);
	}

	public void setRestricted(Boolean restricted) {
		this.restricted = restricted;
	}
}
