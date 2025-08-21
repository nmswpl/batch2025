1.mysql> alter table SOCIAL_MEDIA modify location varchar(100);
2.mysql> alter table SOCIAL_MEDIA add colum isverified boolean default false;

3.mysql> select * from SOCIAL_MEDIA where gender = "Female" and (followers_count > 10000 or post_count > 1000);

4.mysql> select * from SOCIAL_MEDIA where location in("Hyderbad" , "Kolkota") and following_count < 1000;
5.mysql> select location ,gender from SOCIAL_MEDIA  group by location , gender order by location;