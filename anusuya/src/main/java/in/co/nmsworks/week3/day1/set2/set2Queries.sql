--1. Change the location column’s data type to VARCHAR(100) to allow longer city names.

ALTER TABLE SOCIAL_MEDIA MODIFY location varchar(100);
desc SOCIAL_MEDIA;

--2. Add a column is_verified of type boolean to the SOCIAL_MEDIA table. The value
-- should be false for all existing and new users unless changed explicitly.

ALTER TABLE SOCIAL_MEDIA ADD is_verified BOOLEAN DEFAULT FALSE;
desc SOCIAL_MEDIA;

--3. Retrieve all users where the gender is 'Female' and the followers_count is either
--  more than 10000 or the post_count is more than 1000.

SELECT * FROM SOCIAL_MEDIA where (gender = 'Female' AND ((followers_count > 10000) OR (post_count > 1000)));

--4. Retrieve the users where the location is 'Hyderabad' or 'Kolkata', and the
-- following_count is less than 1000.

SELECT * FROM SOCIAL_MEDIA WHERE (location = 'Hyderbad' OR location = 'Kolkata') AND following_count < 1000;

--5. Find the location and gender wise number of like_count for each location in the
--  SOCIAL_MEDIA table. sort by location.

SELECT location, gender,COUNT(gender) FROM SOCIAL_MEDIA GROUP BY gender,location ORDER BY location;

