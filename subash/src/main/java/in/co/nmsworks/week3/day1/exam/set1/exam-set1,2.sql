EXAM-SETS-01

--1.Add a new column email of type VARCHAR(100) to the SOCIAL_MEDIA table. After that, update the email column for all rows with a dummy email like username@example.com where the username is taken from the username column.

alter table SOCIAL_MEDIA add column email varchar(100);
UPDATE SOCIAL_MEDIA set email=concat(username,"@example.com");

--2.Change the location column’s data type to VARCHAR(50) to allow longer city names.

alter table SOCIAL_MEDIA modify column location varchar(50);

--3.Retrieve all users from the SOCIAL_MEDIA table where the followers_count is greater than 50000 and the location is either 'Mumbai' or 'Delhi'.

select * from SOCIAL_MEDIA where followers_count>50000 and location in("Mumbai","Delhi");

--4.Retrieve the users from the SOCIAL_MEDIA table who have either more than 10000 followers or are following more than 5000 accounts, and who are located in either'Bangalore' or 'Chennai'.

select username from SOCIAL_MEDIA where followers_count >10000 or following_count >5000 and location in("Bangalore","Chennai");

--5.Find the location and gender wise average number of followers in the SOCIAL_MEDIA table. Sort by Location

select location,gender,avg(followers_count) as averege_followers from SOCIAL_MEDIA group by gender,LOCATION order by location asc;

EXAM-SETS-02

--1.Change the location column’s data type to VARCHAR(100) to allow longer city names.

alter table SOCIAL_MEDIA MODIFY column LOCATION varchar(100);

--2.Add a column is_verified of type boolean to the SOCIAL_MEDIA table. The value should be false for all existing and new users unless changed explicitly.

ALTER TABLE SOCIAL_MEDIA ADD is_verified BOOLEAN DEFAULT FALSE;

--3.Retrieve all users where the gender is 'Female' and the followers_count is either more than 10000 or the post_count is more than 1000.

Select * from SOCIAL_MEDIA where gender="female" and (followers_count>10000 or post_count>1000);

--4.Retrieve the users where the location is 'Hyderabad' or 'Kolkata', and the following_count is less than 1000.

Select * from SOCIAL_MEDIA where location in("Hyderabad","Kolkata") and following_count <1000;

--5.Find the location and gender wise number of like_count for each location in the SOCIAL_MEDIA table. sort by location.

Select location , gender ,sum(like_count) from SOCIAL_MEDIA group by location,gender order by location;