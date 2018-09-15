CREATE TABLE city
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL
);

CREATE TABLE author
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  surname VARCHAR(20) NOT NULL,
  city_id_fk INT NOT NULL,
  foreign key (city_id_fk) references city(id)
);

CREATE TABLE article_topic
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL
);

CREATE TABLE article
(
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(50) NOT NULL,
  last_update DATE NOT NULL,
  author_id_fk INT NOT NULL,
  article_topic_id_fk INT NOT NULL,
  content TEXT,
  foreign key (author_id_fk) references author(id),
  foreign key (article_topic_id_fk) references article_topic(id)
);

