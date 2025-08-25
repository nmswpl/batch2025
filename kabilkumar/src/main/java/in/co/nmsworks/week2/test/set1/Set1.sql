5.mysql> select location , gender from SOCIAL_MEDIA group by location , gender order by location;
4.mysql> select * from SOCIAL_MEDIA where followers_count > 10000 or following_count > 5000 and location in('mumbai','chennai');
3.
mysql> select * from SOCIAL_MEDIA where followers_count > 5000 and location in ('mumbai','delhi');
2.mysql> update SOCIAL_MEDIA set email concat (username , "@gmail.com");
1.mysql> alter table SOCIAL_MEDIA add column email varchar(100);
