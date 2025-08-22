--1st question
ALTER TABLE SOCIAL_MEDIA ADD email varchar(255) NOT NULL;
UPDATE SOCIAL_MEDIA SET email = CONCAT(username, "@example.com");

--2nd Question
ALTER TABLE SOCIAL_MEDIA MODIFY location varchar(50);

--3rd Question
select * from SOCIAL_MEDIA WHERE followers_count > 50000 AND (location IN("New Delhi","Mumbai"));

--4th Question
select * from SOCIAL_MEDIA WHERE (followers_count > 10000 OR following_count < 5000) AND (location IN("Bangalore","Chennai"));

--5th Question
select location, gender, AVG(followers_count) as Average_Followers from SOCIAL_MEDIA GROUP BY location, gender ORDER BY location;
