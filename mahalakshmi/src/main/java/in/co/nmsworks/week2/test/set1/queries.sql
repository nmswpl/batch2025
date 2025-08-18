alter table SOCIAL_MEDIA add column email varchar(100) default 'username@example.com';

update table SOCIAL_MEDIA where column location VARCHAR(50);

select * from SOCIAL_MEDIA where followers_count > 5000 and location = "Munbai" or location = "Delhi";

select * from SOCIAL_MEDIA where followers_count > 10000 and location = "Bangalore" or location = "Chennai";

select avg(count(gender)),avg(count(location)) from SOCIAL_MEDIA order by gender asc;



