Query 1 ->
      alter table SOCIAL_MEDIA add email varchar(100);
      update SOCIAL_MEDIA set email=concat(username,'@example.com');

Query 2 ->
      alter table SOCIAL_MEDIA modify location varchar(50);

Query 3->
      select * from SOCIAL_MEDIA where followers_count >50000 && location in ('Mumbai','Delhi');

Query 4 ->
      select username from SOCIAL_MEDIA where followers_count >10000 or following_count >5000 && location in ('Bangalore','Chennai');
Query 5 ->
      select location, gender, avg(followers_count) from SOCIAL_MEDIA group by gender,location order by location asc;