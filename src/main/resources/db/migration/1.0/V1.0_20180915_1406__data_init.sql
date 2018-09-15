--Table: city
INSERT INTO city (name) VALUES ('Lodz');
INSERT INTO city (name) VALUES ('Warsaw');
INSERT INTO city (name) VALUES ('Radomsko');

--Table: author
INSERT INTO author (surname, city_id_fk) VALUES ('Sienkiewicz', 2);
INSERT INTO author (surname, city_id_fk) VALUES ('Reymont', 3);

--Table: article_topic
INSERT INTO article_topic (name) VALUES ('Sztuka');
INSERT INTO article_topic (name) VALUES ('Kultura');

--Table: article
INSERT INTO article (title, last_update, author_id_fk, article_topic_id_fk, content)
VALUES (
  'Naglowek',
  CURRENT_TIMESTAMP(),
  1,
  1,
  'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum'
);

INSERT INTO article (title, last_update, author_id_fk, article_topic_id_fk, content)
VALUES (
  'Naglowek',
  CURRENT_TIMESTAMP(),
  2,
  2,
  'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum'
);