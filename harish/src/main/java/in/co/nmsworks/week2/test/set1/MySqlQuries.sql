
alter table SOCIAL_MEDIA modify location VARCHAR(50);
update SOCIAL_MEDIA set email = concat(username,'@example.com');
alter table  SOCIAL_MEDIA add email varchar(100);
Select * from SOCIAL_MEDIA where followers_count > 50000 and location in('Mumbai','Delhi');
Select * from SOCIAL_MEDIA where (followers_count > 10000 or following_count > 5000) and location in('Bangalore','Chennai');
select location, gender,avg(followers_count) AS Average_followers from SOCIAL_MEDIA group by location , gender order by location;

