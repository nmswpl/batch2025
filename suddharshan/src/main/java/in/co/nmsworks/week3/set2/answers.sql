-- 1. Change the location column’s data type to VARCHAR(100) to allow longer city names.
alter table SOCIAL_MEDIA modify location varchar(100);

-- 2. Add a column is_verified of type boolean to the SOCIAL_MEDIA table. The value should be false for all existing and new users unless changed explicitly.
alter table SOCIAL_MEDIA add is_verified boolean;
update SOCIAL_MEDIA set is_verified = false;

-- 3. Retrieve all users where the gender is 'Female' and the followers_count is either more than 10000 or the post_count is more than 1000.
select * from SOCIAL_MEDIA where gender = "Female" and (followers_count > 10000 or post_count > 1000);

-- Retrieve the users where the location is 'Hyderabad' or 'Kolkata', and the following_count is less than 1000.