 create database if not exists blog default character set utf8;

 USE blog;



CREATE  TABLE users(

  id INT (12) PRIMARY KEY  AUTO_INCREMENT NOT NULL ,
  username VARCHAR(50) UNIQUE NOT NULL ,
  password VARCHAR(50) NOT NULL ,
  email VARCHAR(50) UNIQUE NOT NULL ,
  cellphone INT(50) DEFAULT NULL ,
  sex VARCHAR(10) DEFAULT NULL ,
  birthday BIGINT(20) DEFAULT NULL ,
  register_time BIGINT(20) DEFAULT NULL ,
  last_login_ip VARCHAR(255) DEFAULT NULL ,
  last_login_time BIGINT(20) DEFAULT NULL ,
  authority VARCHAR(20) DEFAULT NULL ,
  head_pic MEDIUMBLOB  DEFAULT NULL ,
  user_desc TEXT DEFAULT NULL,
  email_verify_code INT(40) DEFAULT 0 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



 CREATE TABLE articles(

   id INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   author VARCHAR(50) NOT NULL ,
   title TEXT NOT NULL ,
   context TEXT NOT NULL ,
   clicks INT(12) DEFAULT 0,
   user_id INT (12) NOT NULL ,
   edit_time BIGINT(20) NOT NULL ,
   comment_counts INT(20) DEFAULT 0,
   category VARCHAR(255) NOT NULL ,
   FOREIGN KEY (user_id) REFERENCES users(id) ON  DELETE CASCADE
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;



 CREATE TABLE comments(

   id INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   context TEXT NOT NULL ,
   edit_time BIGINT(20) NOT NULL ,
   user_id INT(12) NOT NULL ,
   article_id INT(12) NOT NULL ,
   FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE ,
   FOREIGN KEY (article_id) REFERENCES articles(id) ON DELETE CASCADE
 )ENGINE = InnoDB DEFAULT CHARSET = utf8;

 CREATE TABLE contacts(

   id INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   username VARCHAR(50) NOT NULL ,
   email VARCHAR(50) NOT NULL ,
   advice TEXT NOT NULL,
   edit_time BIGINT(20)
 );


 CREATE TABLE messages(

   id INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   username VARCHAR(50) NOT NULL ,
   message TEXT,
   edit_time BIGINT(20),
   owner VARCHAR(20)
 );



 CREATE TABLE childComments(
   id INT(12) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   context TEXT,
   username VARCHAR(50),
   FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
   FOREIGN KEY (article_id) REFERENCES articles(id) ON DELETE CASCADE
 )ENGINE = InnoDB DEFAULT CHARSET = utf8;;