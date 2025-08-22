alter table SOCIAL_MEDIA add email varchar(100);
update SOCIAL_MEDIA set email = concat(username , "@gmail.com");
alter table SOCIAL_MEDIA modify location varchar(50);
select * from SOCIAL_MEDIA where followers_count>50000 and (location = "Mumbai" or location = "Delhi");
select * from SOCIAL_MEDIA where (followers_count>50000 or following_count >1000) and (location ="Banglore" or location= "Chennai");
select location,gender,avg(followers_count) from SOCIAL_MEDIA order by location;