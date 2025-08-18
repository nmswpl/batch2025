 Query 1:
 alter table SOCIAL_MEDIA modify location varchar(100);

 Query 2:
  alter table SOCIAL_MEDIA add is_verified boolean default(False);

Query 4:
  select count(*) from SOCIAL_MEDIA  where location in ('Hyderbad','Kolkata') where count >1000
