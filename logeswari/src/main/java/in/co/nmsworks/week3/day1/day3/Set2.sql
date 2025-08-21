 alter table SOCIAL_MEDIA add email varchar(100);
 update SOCIAL_MEDIA modify set email=CONCAT(username,'@example.com');
 alter table SOCIAL_MEDIA modify location varchar(30);
