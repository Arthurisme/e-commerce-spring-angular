# e-commerce-spring-angular

Tutorial project:
eMusicStore

Admin data into database before use this web app:

 (If non users and authorities been created in database)Open phpMyAdmin or inteliJ idea data window:
 Add database for user and password -> sql spring security database schema
     
      create table users(
      username varchar_ignorecase(50) not null primary key,
      password varchar_ignorecase(50) not null,
      enabled boolean not null);

      create table authorities (
      username varchar_ignorecase(50) not null,
      authority varchar_ignorecase(50) not null,
      constraint fk_authorities_users foreign key(username) references users(username));
      create unique index ix_auth_username on authorities (username,authority);
      
      
     
Then add data into database:
users:
admin admin true
authorities 
admin ROLE_ADMIN

