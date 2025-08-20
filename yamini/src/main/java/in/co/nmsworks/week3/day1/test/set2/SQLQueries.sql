alter table SOCIAL_MEDIA modify location varchar(100);
alter table SOCIAL_MEDIA add column is_verified boolean default false;
select*from SOCIAL_MEDIA where gender="Female" and (followers_count>10000 or post_count > 1000);
select * from SOCIAL_MEDIA where (location = "Hyderabad" or location = "Kolkata") and following_count < 1000;
select location,gender,sum(like_count) from SOCIAL_MEDIA group by location,gender order by location;



