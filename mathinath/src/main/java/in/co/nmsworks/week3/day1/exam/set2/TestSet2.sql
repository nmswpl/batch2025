--location column data type :
alter table SOCIAL_MEDIA modify location VARCHAR(100);

--add a column name is_verified :
alter table SOCIAL_MEDIA Add column is_verified BOOLEAN DEFAULT false;

--Retrieve all users where gender is Female
select * from SOCIAL_MEDIA where gender = "Female" and (followers_count > 10000 or post_count > 1000);

--retrieve all users where location is Hyderabad or kolkatta
select * from SOCIAL_MEDIA where location IN ("Hyderabad","Kolkatta") and followers_count < 1000;

--find location and gender and sort by location :
select location , gender ,like_count from SOCIAL_MEDIA GROUP BY like_count ORDER BY Location
