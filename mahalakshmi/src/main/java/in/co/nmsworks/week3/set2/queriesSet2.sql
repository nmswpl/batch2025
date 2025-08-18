update table SOCIAL_MEDIA where column location VARCHAR(50);

--2nd

SELECT * FROM SOCIAL_MEDIA WHERE gender = 'Female' AND (followers_count > 10000 OR post_count > 1000);

SELECT * FROM SOCIAL_MEDIA WHERE (location = "Hyderabad" OR location = "Kolkata") AND following_count < 1000;

--5th

