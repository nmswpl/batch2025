
--Question 4
--• Download the file SOCIAL_MEDIA.sql and save it in /tmp.
--• Login to MySQL. Create database MockTest
--• Once inside MockTest, run the following command source
--/tmp/SOCIAL_MEDIA.sql
--If successfully completed, you must be able to see a table SOCIAL_MEDIA. Check the number of
--rows.

--1. Change the location column’s data type to VARCHAR(100) to allow longer city names.

--2. Add a column is_verified of type boolean to the SOCIAL_MEDIA table. The value
--should be false for all existing and new users unless changed explicitly.

--3. Retrieve all users where the gender is 'Female' and the followers_count is either
--more than 10000 or the post_count is more than 1000.

--4. Retrieve the users where the location is 'Hyderabad' or 'Kolkata', and the
--following_count is less than 1000.

--5. Find the location and gender wise number of like_count for each location in the
--SOCIAL_MEDIA table. sort by location.



--Answers

1) UPDATE SOCIAL_MEDIA SET location VARCHAR(100);

2) ALTER table SOCIAL_MEDIA ADD column is_verified boolean where is_verified = false;

3) SELECT gender from SOCIAL_MEDIA where gender = female (SELECT followers_count,post_count from SOCIAL_MEDIA
 where followers_count < 10000 || post_count < 1000);
