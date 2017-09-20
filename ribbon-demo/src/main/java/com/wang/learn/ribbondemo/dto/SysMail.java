package com.wang.learn.eurekaclient.dto;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

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

}
