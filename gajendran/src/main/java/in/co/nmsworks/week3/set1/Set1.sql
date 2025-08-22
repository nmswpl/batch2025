
1
--  Add a new column email of type VARCHAR(100) to the SOCIAL_MEDIA table. After
--  that, update the email column for all rows with a dummy email like
--  username@example.com where the username is taken from the username column.


--Answer :


alter table SOCIAL_MEDIA add email varchar(100);
update SOCIAL_MEDIA set email = concat(username,"@example.com");



--
--2,
--  Change the location column’s data type to VARCHAR(50) to allow longer city names.


--Answer :

--
--mysql> desc SOCIAL_MEDIA;
--+-----------------+--------------+------+-----+---------+-------+
--| Field           | Type         | Null | Key | Default | Extra |
--+-----------------+--------------+------+-----+---------+-------+
--| id              | int          | YES  |     | NULL    |       |
--| username        | varchar(50)  | YES  |     | NULL    |       |
--| full_name       | varchar(50)  | YES  |     | NULL    |       |
--| gender          | varchar(50)  | YES  |     | NULL    |       |
--| location        | varchar(10)  | YES  |     | NULL    |       |
--| followers_count | int          | YES  |     | NULL    |       |
--| following_count | int          | YES  |     | NULL    |       |
--| post_count      | int          | YES  |     | NULL    |       |
--| like_count      | int          | YES  |     | NULL    |       |
--| email           | varchar(100) | YES  |     | NULL    |       |
--+-----------------+--------------+------+-----+---------+-------+


alter table SOCIAL_MEDIA modify location varchar(50);


--mysql> desc SOCIAL_MEDIA;
--+-----------------+--------------+------+-----+---------+-------+
--| Field           | Type         | Null | Key | Default | Extra |
--+-----------------+--------------+------+-----+---------+-------+
--| id              | int          | YES  |     | NULL    |       |
--| username        | varchar(50)  | YES  |     | NULL    |       |
--| full_name       | varchar(50)  | YES  |     | NULL    |       |
--| gender          | varchar(50)  | YES  |     | NULL    |       |
--| location        | varchar(50)  | YES  |     | NULL    |       |
--| followers_count | int          | YES  |     | NULL    |       |
--| following_count | int          | YES  |     | NULL    |       |
--| post_count      | int          | YES  |     | NULL    |       |
--| like_count      | int          | YES  |     | NULL    |       |
--| email           | varchar(100) | YES  |     | NULL    |       |
--+-----------------+--------------+------+-----+---------+-------+
--10 rows in set (0.01 sec)








--
--3,
--
--
--Retrieve all users from the SOCIAL_MEDIA table where the followers_count is
--greater than 50000 and the location is either 'Mumbai' or 'Delhi'.




--Answer


select * from SOCIAL_MEDIA where location in ('Mumbai' , 'Delhi') and followers_count > 50000 ;


--
--output
--
--|  989 | nprandirg       | Nealson Prandi         | Male   | Mumbai   |          173277 |           11318 |       6138 |       6843 | nprandirg@example.com       |
--|  990 | cvellarh        | Cynthie Vella          | Female | Delhi    |           70264 |          453765 |        913 |       8536 | cvellarh@example.com        |
--|  994 | phuntingdonrl   | Pedro Huntingdon       | Male   | Mumbai   |          951282 |          611723 |       5154 |       5273 | phuntingdonrl@example.com   |
--+------+-----------------+------------------------+--------+----------+-----------------+-----------------+------------+------------+-----------------------------+
--227 rows in set (0.00 sec)




--
--4
--
--Retrieve the users from the SOCIAL_MEDIA table who have either more than 10000
--followers or are following more than 5000 accounts, and who are located in either
--'Bangalore' or 'Chennai'.


--
--Answer:


--


 select * from SOCIAL_MEDIA where location in  ('Chennai', 'Bangalore') and (followers_count > 10000  or following_count > 5000);


-- |  985 | tfrankemarc     | Teresa Frankema         | Female | Bangalore |          623246 |          189230 |        660 |        913 | tfrankemarc@example.com     |
-- |  992 | wbolandrj       | Wilton Boland           | Male   | Chennai   |           25485 |          184370 |       5353 |       5312 | wbolandrj@example.com       |
-- |  993 | cpaternosterrk  | Caroljean Paternoster   | Others | Chennai   |          658158 |          218003 |       3790 |       2957 | cpaternosterrk@example.com  |
-- |  997 | tmillichapro    | Tuck Millichap          | Male   | Chennai   |          375310 |          990084 |       1801 |       5942 | tmillichapro@example.com    |
-- | 1000 | pgosartrr       | Pammie Gosart           | Female | Bangalore |           89804 |          135813 |       2335 |       1998 | pgosartrr@example.com       |
-- +------+-----------------+-------------------------+--------+-----------+-----------------+-----------------+------------+------------+-----------------------------+
-- 245 rows in set (0.00 sec)


--
--5,
--
--Find the location and gender wise average number of followers in the SOCIAL_MEDIA
--table. Sort by Location



SELECT location, gender, AVG(followers_count) AS avg_followers FROM SOCIAL_MEDIA GROUP BY location, gender ORDER BY location;

--output--output


--
--| Mumbai     | Male   |   492126.5909 |
--| Mumbai     | Others |   451809.8750 |
--| Pune       | Female |   464085.6615 |
--| Pune       | Male   |   474794.3148 |
--| Pune       | Others |   462642.2000 |
--+------------+--------+---------------+
--24 rows in set (0.01 sec)
