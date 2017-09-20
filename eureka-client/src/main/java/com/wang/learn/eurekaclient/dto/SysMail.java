/**
 * SysMail 2017/9/20 12:50
 * <p>
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package com.wang.learn.eurekaclient.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * @author gang.wang
 * @Title: SysMail
 * @Description: (描述此类的功能)
 * @date 2017/9/20 12:50
 */
public class SysMail  {

	private Long id;
	private String mailType;
	private String sender;
	private String receivers;
	private String cc;
	private String bcc ;
	private String subject ;
	private String body ;
	private String  status ;
	private Boolean deleted;
	private Boolean sync;
	private Date planSendTime;

	private MultipartFile[] attachments;
	private MultipartFile[] inlineImages;
	private String templateName;
	private String bodyToken;
	private String subjectToken;

	public Long getId() {
		return id;
	}

	public SysMail setId(Long id) {
		this.id = id;
		return this;
	}

	public String getMailType() {
		return mailType;
	}

	public SysMail setMailType(String mailType) {
		this.mailType = mailType;
		return this;
	}

	public String getSender() {
		return sender;
	}

	public SysMail setSender(String sender) {
		this.sender = sender;
		return this;
	}

	public String getReceivers() {
		return receivers;
	}

	public SysMail setReceivers(String receivers) {
		this.receivers = receivers;
		return this;
	}

	public String getCc() {
		return cc;
	}

	public SysMail setCc(String cc) {
		this.cc = cc;
		return this;
	}

	public String getBcc() {
		return bcc;
	}

	public SysMail setBcc(String bcc) {
		this.bcc = bcc;
		return this;
	}

	public String getSubject() {
		return subject;
	}

	public SysMail setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getBody() {
		return body;
	}

	public SysMail setBody(String body) {
		this.body = body;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public SysMail setStatus(String status) {
		this.status = status;
		return this;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public SysMail setDeleted(Boolean deleted) {
		this.deleted = deleted;
		return this;
	}

	public Boolean getSync() {
		return sync;
	}

	public SysMail setSync(Boolean sync) {
		this.sync = sync;
		return this;
	}

	public Date getPlanSendTime() {
		return planSendTime;
	}

	public SysMail setPlanSendTime(Date planSendTime) {
		this.planSendTime = planSendTime;
		return this;
	}

	public MultipartFile[] getAttachments() {
		return attachments;
	}

	public SysMail setAttachments(MultipartFile[] attachments) {
		this.attachments = attachments;
		return this;
	}

	public MultipartFile[] getInlineImages() {
		return inlineImages;
	}

	public SysMail setInlineImages(MultipartFile[] inlineImages) {
		this.inlineImages = inlineImages;
		return this;
	}

	public String getTemplateName() {
		return templateName;
	}

	public SysMail setTemplateName(String templateName) {
		this.templateName = templateName;
		return this;
	}

	public String getBodyToken() {
		return bodyToken;
	}

	public SysMail setBodyToken(String bodyToken) {
		this.bodyToken = bodyToken;
		return this;
	}

	public String getSubjectToken() {
		return subjectToken;
	}

	public SysMail setSubjectToken(String subjectToken) {
		this.subjectToken = subjectToken;
		return this;
	}
}
