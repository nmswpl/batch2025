 --QUESTION1--
 ALTER TABLE  SOCIAL_MEDIA MODIFY location VARCHAR(100);

--QUESTION2--
ALTER TABLE SOCIAL_MEDIA ADD is_verified boolean default false;
update SOCIAL_MEDIA SET is_verified=false ;

--QUESTION3--
select * from SOCIAL_MEDIA WHERE gender = "Female" and (followers_count > 1000 or post_count > 1000);

--Question4--
select * from SOCIAL_MEDIA WHERE location in ('Hyderbad','kolkata') and following_count < 1000;

--Question5--
select gender , location , sum(like_count) from SOCIAL_MEDIA GROUP BY gender , location ORDER BY location ASC;


